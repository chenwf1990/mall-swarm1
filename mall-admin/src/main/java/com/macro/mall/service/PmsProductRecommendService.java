package com.macro.mall.service;

import com.macro.mall.bo.ProductRecommendVo;

import java.util.List;

public interface PmsProductRecommendService {
    List<ProductRecommendVo> productRecommendList(Long productId);
}
