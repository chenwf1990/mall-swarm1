package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class PmsProductCategoryHistory implements Serializable {
    private Long id;

    @ApiModelProperty(value = "用户id（商家id）")
    private Long userId;

    @ApiModelProperty(value = "一级分类")
    private Long productCategoryIdI;

    @ApiModelProperty(value = "二级分类")
    private Long productCategoryIdIi;

    @ApiModelProperty(value = "三级分类")
    private Long productCategoryIdIii;

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

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getProductCategoryIdI() {
        return productCategoryIdI;
    }

    public void setProductCategoryIdI(Long productCategoryIdI) {
        this.productCategoryIdI = productCategoryIdI;
    }

    public Long getProductCategoryIdIi() {
        return productCategoryIdIi;
    }

    public void setProductCategoryIdIi(Long productCategoryIdIi) {
        this.productCategoryIdIi = productCategoryIdIi;
    }

    public Long getProductCategoryIdIii() {
        return productCategoryIdIii;
    }

    public void setProductCategoryIdIii(Long productCategoryIdIii) {
        this.productCategoryIdIii = productCategoryIdIii;
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
        sb.append(", userId=").append(userId);
        sb.append(", productCategoryIdI=").append(productCategoryIdI);
        sb.append(", productCategoryIdIi=").append(productCategoryIdIi);
        sb.append(", productCategoryIdIii=").append(productCategoryIdIii);
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