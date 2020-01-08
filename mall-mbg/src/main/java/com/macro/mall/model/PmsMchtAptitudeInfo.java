package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class PmsMchtAptitudeInfo implements Serializable {
    private Long id;

    @ApiModelProperty(value = "商家id")
    private Long mchtId;

    @ApiModelProperty(value = "联系人电话")
    private String contactMobile;

    @ApiModelProperty(value = "联系人姓名")
    private String contactNick;

    @ApiModelProperty(value = "联系人邮箱")
    private String contactEmail;

    @ApiModelProperty(value = "联系人 性别 0男 1 女")
    private Integer contactSex;

    @ApiModelProperty(value = "公司名称")
    private String companyName;

    @ApiModelProperty(value = "法人姓名")
    private String legalNick;

    @ApiModelProperty(value = "法人手机号码")
    private String legalMobile;

    @ApiModelProperty(value = "法人身份证")
    private String legalIdCard;

    @ApiModelProperty(value = "营业执照注册号")
    private String businessLicenseNo;

    @ApiModelProperty(value = "公司所在省")
    private String companyProvinceId;

    @ApiModelProperty(value = "公司所在市")
    private String companyCityId;

    @ApiModelProperty(value = "公司所在区")
    private String companyAreaId;

    @ApiModelProperty(value = "公司详细地址")
    private String companyAddress;

    @ApiModelProperty(value = "公司手机号码")
    private String companyMobile;

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

    public String getContactMobile() {
        return contactMobile;
    }

    public void setContactMobile(String contactMobile) {
        this.contactMobile = contactMobile;
    }

    public String getContactNick() {
        return contactNick;
    }

    public void setContactNick(String contactNick) {
        this.contactNick = contactNick;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public Integer getContactSex() {
        return contactSex;
    }

    public void setContactSex(Integer contactSex) {
        this.contactSex = contactSex;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getLegalNick() {
        return legalNick;
    }

    public void setLegalNick(String legalNick) {
        this.legalNick = legalNick;
    }

    public String getLegalMobile() {
        return legalMobile;
    }

    public void setLegalMobile(String legalMobile) {
        this.legalMobile = legalMobile;
    }

    public String getLegalIdCard() {
        return legalIdCard;
    }

    public void setLegalIdCard(String legalIdCard) {
        this.legalIdCard = legalIdCard;
    }

    public String getBusinessLicenseNo() {
        return businessLicenseNo;
    }

    public void setBusinessLicenseNo(String businessLicenseNo) {
        this.businessLicenseNo = businessLicenseNo;
    }

    public String getCompanyProvinceId() {
        return companyProvinceId;
    }

    public void setCompanyProvinceId(String companyProvinceId) {
        this.companyProvinceId = companyProvinceId;
    }

    public String getCompanyCityId() {
        return companyCityId;
    }

    public void setCompanyCityId(String companyCityId) {
        this.companyCityId = companyCityId;
    }

    public String getCompanyAreaId() {
        return companyAreaId;
    }

    public void setCompanyAreaId(String companyAreaId) {
        this.companyAreaId = companyAreaId;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public String getCompanyMobile() {
        return companyMobile;
    }

    public void setCompanyMobile(String companyMobile) {
        this.companyMobile = companyMobile;
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
        sb.append(", contactMobile=").append(contactMobile);
        sb.append(", contactNick=").append(contactNick);
        sb.append(", contactEmail=").append(contactEmail);
        sb.append(", contactSex=").append(contactSex);
        sb.append(", companyName=").append(companyName);
        sb.append(", legalNick=").append(legalNick);
        sb.append(", legalMobile=").append(legalMobile);
        sb.append(", legalIdCard=").append(legalIdCard);
        sb.append(", businessLicenseNo=").append(businessLicenseNo);
        sb.append(", companyProvinceId=").append(companyProvinceId);
        sb.append(", companyCityId=").append(companyCityId);
        sb.append(", companyAreaId=").append(companyAreaId);
        sb.append(", companyAddress=").append(companyAddress);
        sb.append(", companyMobile=").append(companyMobile);
        sb.append(", deleteStatus=").append(deleteStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}