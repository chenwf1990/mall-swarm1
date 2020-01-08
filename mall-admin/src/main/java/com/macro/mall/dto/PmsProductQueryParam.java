package com.macro.mall.dto;

import io.swagger.annotations.ApiModelProperty;

/**
 * 产品查询参数
 * Created by macro on 2018/4/27.
 */
public class PmsProductQueryParam {
    @ApiModelProperty("上架状态：0->下架；1->上架")
    private Integer publishStatus;
    @ApiModelProperty("审核状态：0->未审核；1->审核通过")
    private Integer verifyStatus;
    @ApiModelProperty("商品名称模糊关键字")
    private String keyword;
    @ApiModelProperty("商品货号")
    private String productSn;
    @ApiModelProperty("二级分类")
    private Long productCategoryId;
    @ApiModelProperty("商品品牌编号")
    private Long brandId;
    @ApiModelProperty(value = "一级分类")
    private Long productCategoryIdI;
    @ApiModelProperty(value = "三级分类")
    private Long productCategoryIdIii;

    public Long getProductCategoryIdI() {
        return productCategoryIdI;
    }

    public void setProductCategoryIdI(Long productCategoryIdI) {
        this.productCategoryIdI = productCategoryIdI;
    }

    public Long getProductCategoryIdIii() {
        return productCategoryIdIii;
    }

    public void setProductCategoryIdIii(Long productCategoryIdIii) {
        this.productCategoryIdIii = productCategoryIdIii;
    }

    public Integer getPublishStatus() {
        return publishStatus;
    }

    public void setPublishStatus(Integer publishStatus) {
        this.publishStatus = publishStatus;
    }

    public Integer getVerifyStatus() {
        return verifyStatus;
    }

    public void setVerifyStatus(Integer verifyStatus) {
        this.verifyStatus = verifyStatus;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getProductSn() {
        return productSn;
    }

    public void setProductSn(String productSn) {
        this.productSn = productSn;
    }

    public Long getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(Long productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }
}
