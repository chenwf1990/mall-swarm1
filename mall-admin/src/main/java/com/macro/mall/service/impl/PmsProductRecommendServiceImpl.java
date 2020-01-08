package com.macro.mall.service.impl;

import com.macro.mall.bo.ProductRecommendVo;
import com.macro.mall.dao.PmsProductRecommendDao;
import com.macro.mall.service.PmsProductRecommendService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class PmsProductRecommendServiceImpl implements PmsProductRecommendService {
    @Resource
    private PmsProductRecommendDao pmsProductRecommendDao;
    @Override
    public List<ProductRecommendVo> productRecommendList(Long productId) {

        return pmsProductRecommendDao.productRecommendList(productId);
    }
}
