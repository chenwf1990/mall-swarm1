package com.macro.mall.dto;

import com.macro.mall.model.PmsProductLabel;
import com.macro.mall.model.PmsProductLabelGroup;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * 标签组传递参数
 */
public class PmsProductLabelGroupParam {
    @ApiModelProperty("标签组集合")
    private PmsProductLabelGroup pmsProductLabelGroup;
    @ApiModelProperty("子标签集合")
    private List<PmsProductLabel> pmsProductLabelList;

    public PmsProductLabelGroup getPmsProductLabelGroup() {
        return pmsProductLabelGroup;
    }

    public void setPmsProductLabelGroup(PmsProductLabelGroup pmsProductLabelGroup) {
        this.pmsProductLabelGroup = pmsProductLabelGroup;
    }

    public List<PmsProductLabel> getPmsProductLabelList() {
        return pmsProductLabelList;
    }

    public void setPmsProductLabelList(List<PmsProductLabel> pmsProductLabelList) {
        this.pmsProductLabelList = pmsProductLabelList;
    }
}
