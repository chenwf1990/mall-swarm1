package com.macro.mall.bo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CategoryHistoryVo {
    @ApiModelProperty(value = "一级分类")
    private Long productCategoryIdI;
    @ApiModelProperty(value = "一级分类名称")
    private Long productCategoryIdIName;

    @ApiModelProperty(value = "二级分类")
    private Long productCategoryIdIi;
    @ApiModelProperty(value = "二级分类名称")
    private Long productCategoryIdIiName;

    @ApiModelProperty(value = "三级分类")
    private Long productCategoryIdIii;
    @ApiModelProperty(value = "三级分类名称")
    private Long productCategoryIdIiiName;
}
