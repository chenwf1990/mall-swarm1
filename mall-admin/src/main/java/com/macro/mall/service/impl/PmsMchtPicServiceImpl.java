package com.macro.mall.service.impl;

import com.macro.mall.mapper.PmsMchtPicMapper;
import com.macro.mall.model.PmsMchtPic;
import com.macro.mall.service.PmsMchtPicService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;

@Service
@Transactional
@Slf4j
public class PmsMchtPicServiceImpl implements PmsMchtPicService {
    @Resource
    private PmsMchtPicMapper pmsMchtPicMapper;

    @Override
    public void saveMchtPicModel(String pic, int type, Long mchtId) {
        if(!StringUtils.isBlank(pic)) {
            PmsMchtPic pmsMchtPic = new PmsMchtPic();
            pmsMchtPic.setMchtId(mchtId);
            pmsMchtPic.setType(1);
            pmsMchtPic.setPic(pic);
            pmsMchtPic.setCreateDate(new Date());
            pmsMchtPicMapper.insertSelective(pmsMchtPic);
        }
    }
}
