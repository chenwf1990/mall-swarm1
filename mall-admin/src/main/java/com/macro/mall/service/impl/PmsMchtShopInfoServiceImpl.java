package com.macro.mall.service.impl;

import com.macro.mall.dto.UmsAdminParam;
import com.macro.mall.mapper.PmsMchtAptitudeInfoMapper;
import com.macro.mall.mapper.PmsMchtPicMapper;
import com.macro.mall.mapper.PmsMchtShopInfoMapper;
import com.macro.mall.mapper.PmsShopCategoryAptitudeInfoMapper;
import com.macro.mall.model.PmsMchtAptitudeInfo;
import com.macro.mall.model.PmsMchtPic;
import com.macro.mall.model.PmsMchtShopInfo;
import com.macro.mall.model.PmsShopCategoryAptitudeInfo;
import com.macro.mall.service.PmsMchtPicService;
import com.macro.mall.service.PmsMchtShopInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;

@Service
@Transactional
@Slf4j
public class PmsMchtShopInfoServiceImpl implements PmsMchtShopInfoService {
    @Resource
    private PmsMchtShopInfoMapper pmsMchtShopInfoMapper;
    @Resource
    private PmsShopCategoryAptitudeInfoMapper pmsShopCategoryAptitudeInfoMapper;
    @Resource
    private PmsMchtPicService pmsMchtPicService;
    @Resource
    private PmsMchtAptitudeInfoMapper pmsMchtAptitudeInfoMapper;
    @Override
    public void saveMchtInfo(Long id, UmsAdminParam umsAdminParam) {
        Date curDate = new Date();
        //商家入驻信息
        PmsMchtAptitudeInfo pmsMchtAptitudeInfo = umsAdminParam.getPmsMchtAptitudeInfo();
        pmsMchtAptitudeInfo.setMchtId(id);
        pmsMchtAptitudeInfoMapper.insertSelective(pmsMchtAptitudeInfo);

        //身份证正照图片
        pmsMchtPicService.saveMchtPicModel(umsAdminParam.getIdCardPic1(),1,id);
        //身份证反照图片
        pmsMchtPicService.saveMchtPicModel(umsAdminParam.getIdCardPic1(),2,id);

        //商家店铺信息
        PmsMchtShopInfo pmsMchtShopInfo = umsAdminParam.getPmsMchtShopInfo();
        pmsMchtShopInfo.setMchtId(id);
        pmsMchtShopInfo.setCreateDate(curDate);
        pmsMchtShopInfoMapper.insertSelective(pmsMchtShopInfo);

        //对应类目行业资质
        if(!umsAdminParam.getPmsShopCategoryAptitudeInfos().isEmpty()){
            for (PmsShopCategoryAptitudeInfo pmsShopCategoryAptitudeInfo : umsAdminParam.getPmsShopCategoryAptitudeInfos()) {
                pmsShopCategoryAptitudeInfo.setMchtId(id);
                pmsShopCategoryAptitudeInfo.setCreateDate(curDate);
                pmsShopCategoryAptitudeInfoMapper.insertSelective(pmsShopCategoryAptitudeInfo);
            }
        }

    }
}
