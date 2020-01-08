package com.macro.mall.dto;

import com.macro.mall.model.PmsProductAttributeGroup;
import io.swagger.annotations.ApiModelProperty;

public class PmsProductAttributeGroupParam {
    @ApiModelProperty("商品参数实体")
    private PmsProductAttributeGroup pmsProductAttributeGroup;

    public PmsProductAttributeGroup getPmsProductAttributeGroup() {
        return pmsProductAttributeGroup;
    }

    public void setPmsProductAttributeGroup(PmsProductAttributeGroup pmsProductAttributeGroup) {
        this.pmsProductAttributeGroup = pmsProductAttributeGroup;
    }
}
