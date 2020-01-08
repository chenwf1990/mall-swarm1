package com.macro.mall.dao;

import com.macro.mall.bo.ProductRecommendVo;
import com.macro.mall.model.PmsProductRecommend;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 商品推荐
 */
public interface PmsProductRecommendDao {
    int insertList(@Param("list") List<PmsProductRecommend> pmsProductRecommendList);

    List<ProductRecommendVo> productRecommendList(Long productId);
}
