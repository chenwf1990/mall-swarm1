package com.macro.mall.service.impl;

import com.github.pagehelper.PageHelper;
import com.macro.mall.dao.PmsProductLabelDao;
import com.macro.mall.dto.PmsProductLabelGroupParam;
import com.macro.mall.mapper.PmsProductLabelGroupMapper;
import com.macro.mall.mapper.PmsProductLabelMapper;
import com.macro.mall.model.PmsProductLabel;
import com.macro.mall.model.PmsProductLabelExample;
import com.macro.mall.model.PmsProductLabelGroup;
import com.macro.mall.model.PmsProductLabelGroupExample;
import com.macro.mall.service.PmsProductLabelGroupService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
@Transactional
public class PmsProductLabelGroupServiceImpl implements PmsProductLabelGroupService {
    private static final Logger LOGGER = LoggerFactory.getLogger(PmsProductServiceImpl.class);
    @Resource
    private PmsProductLabelGroupMapper pmsProductLabelGroupMapper;
    @Resource
    private PmsProductLabelMapper pmsProductLabelMapper;
    @Resource
    private PmsProductLabelDao pmsProductLabelDao;

    @Override
    public List<PmsProductLabelGroup> list(String name, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        PmsProductLabelGroupExample example = new PmsProductLabelGroupExample();
        PmsProductLabelGroupExample.Criteria criteria = example.createCriteria();
        criteria.andDeleteStatusEqualTo(0);
        if (!StringUtils.isEmpty(name)) {
            criteria.andNameLike("%" + name + "%");
        }
        example.setOrderByClause("id desc");
        return pmsProductLabelGroupMapper.selectByExample(example);
    }

    /**
     * 创建标签组
     *
     * @param groupParam
     * @return
     */
    @Override
    public int createLabelGroup(PmsProductLabelGroupParam groupParam) {
        PmsProductLabelGroup pmsProductLabelGroup = groupParam.getPmsProductLabelGroup();
        pmsProductLabelGroup.setCreateDate(new Date());
        pmsProductLabelGroupMapper.insertSelective(pmsProductLabelGroup);
        Long labelGroupId = pmsProductLabelGroup.getId();
        //关联子标签
        for (PmsProductLabel pmsProductLabel : groupParam.getPmsProductLabelList()) {
            pmsProductLabel.setLabelGropuId(labelGroupId);
            pmsProductLabel.setCreateDate(new Date());
            pmsProductLabelMapper.insertSelective(pmsProductLabel);
        }
        return 1;
    }

    @Override
    public PmsProductLabelGroupParam getUpdateInfo(Long id) {
        PmsProductLabelGroup pmsProductLabelGroup = pmsProductLabelGroupMapper.selectByPrimaryKey(id);
        PmsProductLabelExample pmsProductLabelExample = new PmsProductLabelExample();
        pmsProductLabelExample.createCriteria().andLabelGropuIdEqualTo(id);
        pmsProductLabelMapper.selectByExample(pmsProductLabelExample);

        PmsProductLabelGroupParam pmsProductLabelGroupParam = new PmsProductLabelGroupParam();

        pmsProductLabelGroupParam.setPmsProductLabelGroup(pmsProductLabelGroup);
        pmsProductLabelGroupParam.setPmsProductLabelList(pmsProductLabelMapper.selectByExample(pmsProductLabelExample));
        return pmsProductLabelGroupParam;
    }

    @Override
    public int updateDeleteStatus(List<Long> ids, Integer deleteStatus) {
        PmsProductLabelGroup record = new PmsProductLabelGroup();
        if(deleteStatus == 0){
         record.setDeleteStatus(1);
        }else if(deleteStatus == 1){
            record.setStatus(0);
        }else if(deleteStatus == 2){
            record.setStatus(1);
        }
        PmsProductLabelGroupExample example = new PmsProductLabelGroupExample();
        example.createCriteria().andIdIn(ids);
        int count = pmsProductLabelGroupMapper.updateByExampleSelective(record, example);
        if(deleteStatus == 0) {
            //删除子标签
            PmsProductLabel record1 = new PmsProductLabel();
            record1.setDeleteStatus(deleteStatus);
            PmsProductLabelExample example1 = new PmsProductLabelExample();
            example1.createCriteria().andIdIn(ids);
            pmsProductLabelMapper.updateByExampleSelective(record1, example1);
        }
        return count;
    }

    @Override
    public int updateLabelGroup(Long id, PmsProductLabelGroupParam groupParam) {
        pmsProductLabelGroupMapper.updateByPrimaryKeySelective(groupParam.getPmsProductLabelGroup());
        PmsProductLabelExample pmsProductLabelExample = new PmsProductLabelExample();
        pmsProductLabelExample.createCriteria().andLabelGropuIdEqualTo(id);
        pmsProductLabelMapper.deleteByExample(pmsProductLabelExample);
        for (PmsProductLabel pmsProductLabel : groupParam.getPmsProductLabelList()) {
            pmsProductLabel.setLabelGropuId(groupParam.getPmsProductLabelGroup().getId());
            pmsProductLabel.setCreateDate(new Date());
            pmsProductLabelMapper.insertSelective(pmsProductLabel);
        }

        return 1;
    }
}
