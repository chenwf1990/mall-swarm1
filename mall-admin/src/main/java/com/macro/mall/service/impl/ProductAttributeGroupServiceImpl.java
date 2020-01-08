package com.macro.mall.service.impl;

import com.github.pagehelper.PageHelper;
import com.macro.mall.bo.AttributeGroupVo;
import com.macro.mall.dao.PmsProductAttributeGroupDao;
import com.macro.mall.dto.PmsProductAttributeGroupParam;
import com.macro.mall.mapper.PmsProductAttributeGroupMapper;
import com.macro.mall.model.PmsProductAttributeGroup;
import com.macro.mall.model.PmsProductAttributeGroupExample;
import com.macro.mall.service.ProductAttributeGroupService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
@Transactional
public class ProductAttributeGroupServiceImpl implements ProductAttributeGroupService {
    @Resource
    private PmsProductAttributeGroupMapper pmsProductAttributeGroupMapper;
    @Resource
    private PmsProductAttributeGroupDao pmsProductAttributeGroupDao;

    @Override
    public List<PmsProductAttributeGroup> getList(Long cid, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        PmsProductAttributeGroupExample example = new PmsProductAttributeGroupExample();
        example.setOrderByClause("sort desc");
        example.createCriteria().andProductAttributeCategoryIdEqualTo(cid).andDeleteStatusEqualTo(0);
        return pmsProductAttributeGroupMapper.selectByExample(example);
    }

    @Override
    public int create(PmsProductAttributeGroupParam pmsProductAttributeGroupParam) {
        PmsProductAttributeGroup productAttributeGroup = pmsProductAttributeGroupParam.getPmsProductAttributeGroup();
        productAttributeGroup.setStatus(0);
        productAttributeGroup.setCreateDate(new Date());
        pmsProductAttributeGroupMapper.insertSelective(productAttributeGroup);
        return 0;
    }

    @Override
    public int update(Long id, PmsProductAttributeGroupParam productAttributeParam) {
        PmsProductAttributeGroup productAttributeGroup = productAttributeParam.getPmsProductAttributeGroup();
        productAttributeGroup.setId(id);
        productAttributeGroup.setUpdateDate(new Date());
        return pmsProductAttributeGroupMapper.updateByPrimaryKeySelective(productAttributeGroup);
    }

    @Override
    public PmsProductAttributeGroup getParamGroup(Long id) {
        return pmsProductAttributeGroupMapper.selectByPrimaryKey(id);
    }

    @Override
    public int delete(List<Long> ids) {
        PmsProductAttributeGroupExample example = new PmsProductAttributeGroupExample();
        example.createCriteria().andIdIn(ids);
        PmsProductAttributeGroup productAttributeGroup = new PmsProductAttributeGroup();
        productAttributeGroup.setDeleteStatus(0);
        productAttributeGroup.setUpdateDate(new Date());
        return pmsProductAttributeGroupMapper.updateByExampleSelective(productAttributeGroup,example);
    }

    @Override
    public Map<String, Object> paramsList(Long cid) {
        List<AttributeGroupVo> vos = pmsProductAttributeGroupDao.getParamsList(cid);
        Map<String,Object> map = vos.stream().collect(Collectors.toMap(AttributeGroupVo::getAttributeGroupName, Function.identity()));
        return map;
    }
}
