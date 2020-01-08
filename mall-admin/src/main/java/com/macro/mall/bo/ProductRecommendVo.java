package com.macro.mall.bo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class ProductRecommendVo {
    @ApiModelProperty(value = "推荐主键id")
    private Integer id;

    @ApiModelProperty(value = "原始商品id")
    private Integer productId;

    @ApiModelProperty(value = "推荐的商品id")
    private Integer recommendProductId;

    @ApiModelProperty(value = "推荐的商品名称")
    private String productName;

    @ApiModelProperty(value = "推荐的商品库存")
    private Integer stock;

    @ApiModelProperty(value = "推荐的商品价格")
    private BigDecimal price;
}
