package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class PmsMchtShopInfo implements Serializable {
    private Long id;

    @ApiModelProperty(value = "商家id")
    private Long mchtId;

    @ApiModelProperty(value = "店铺类型")
    private String shopType;

    @ApiModelProperty(value = "主营类目(一级类目)")
    private Long mainCategory;

    @ApiModelProperty(value = "公司名称")
    private String companyName;

    @ApiModelProperty(value = "品牌id")
    private Long brandId;

    @ApiModelProperty(value = "类目关键字")
    private String categoryKeywords;

    @ApiModelProperty(value = "店铺后缀")
    private String shopSuffix;

    @ApiModelProperty(value = "店铺介绍")
    private String shopIntroduce;

    @ApiModelProperty(value = "期望店铺名称")
    private String expectShopName;

    @ApiModelProperty(value = "创建时间")
    private Date createDate;

    @ApiModelProperty(value = "创建人")
    private Long createBy;

    @ApiModelProperty(value = "更新时间")
    private Date updateDate;

    @ApiModelProperty(value = "更新者")
    private Long updateBy;

    @ApiModelProperty(value = "删除标识0 未删除 1已删除")
    private Integer deleteStatus;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMchtId() {
        return mchtId;
    }

    public void setMchtId(Long mchtId) {
        this.mchtId = mchtId;
    }

    public String getShopType() {
        return shopType;
    }

    public void setShopType(String shopType) {
        this.shopType = shopType;
    }

    public Long getMainCategory() {
        return mainCategory;
    }

    public void setMainCategory(Long mainCategory) {
        this.mainCategory = mainCategory;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public String getCategoryKeywords() {
        return categoryKeywords;
    }

    public void setCategoryKeywords(String categoryKeywords) {
        this.categoryKeywords = categoryKeywords;
    }

    public String getShopSuffix() {
        return shopSuffix;
    }

    public void setShopSuffix(String shopSuffix) {
        this.shopSuffix = shopSuffix;
    }

    public String getShopIntroduce() {
        return shopIntroduce;
    }

    public void setShopIntroduce(String shopIntroduce) {
        this.shopIntroduce = shopIntroduce;
    }

    public String getExpectShopName() {
        return expectShopName;
    }

    public void setExpectShopName(String expectShopName) {
        this.expectShopName = expectShopName;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Long getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Long getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Long updateBy) {
        this.updateBy = updateBy;
    }

    public Integer getDeleteStatus() {
        return deleteStatus;
    }

    public void setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", mchtId=").append(mchtId);
        sb.append(", shopType=").append(shopType);
        sb.append(", mainCategory=").append(mainCategory);
        sb.append(", companyName=").append(companyName);
        sb.append(", brandId=").append(brandId);
        sb.append(", categoryKeywords=").append(categoryKeywords);
        sb.append(", shopSuffix=").append(shopSuffix);
        sb.append(", shopIntroduce=").append(shopIntroduce);
        sb.append(", expectShopName=").append(expectShopName);
        sb.append(", createDate=").append(createDate);
        sb.append(", createBy=").append(createBy);
        sb.append(", updateDate=").append(updateDate);
        sb.append(", updateBy=").append(updateBy);
        sb.append(", deleteStatus=").append(deleteStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}