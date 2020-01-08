package com.macro.mall.bo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

public class AttributeGroupVo {
    @ApiModelProperty("属性组id")
    private Long attributeGroupId;
    @ApiModelProperty("属性组名称")
    private String attributeGroupName;
    @ApiModelProperty("属性id")
    private Long attributeId;
    @ApiModelProperty("属性名称")
    private String attributeName;

    public Long getAttributeGroupId() {
        return attributeGroupId;
    }

    public void setAttributeGroupId(Long attributeGroupId) {
        this.attributeGroupId = attributeGroupId;
    }

    public String getAttributeGroupName() {
        return attributeGroupName;
    }

    public void setAttributeGroupName(String attributeGroupName) {
        this.attributeGroupName = attributeGroupName;
    }

    public Long getAttributeId() {
        return attributeId;
    }

    public void setAttributeId(Long attributeId) {
        this.attributeId = attributeId;
    }

    public String getAttributeName() {
        return attributeName;
    }

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }
}
