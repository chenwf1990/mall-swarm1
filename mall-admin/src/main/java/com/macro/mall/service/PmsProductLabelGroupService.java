package com.macro.mall.service;

import com.macro.mall.dto.PmsProductLabelGroupParam;
import com.macro.mall.model.PmsProductLabelGroup;

import java.util.List;

public interface PmsProductLabelGroupService {
    /**
     * 创建标签组
     * @param groupParam
     * @return
     */
    int createLabelGroup(PmsProductLabelGroupParam groupParam);

    PmsProductLabelGroupParam getUpdateInfo(Long id);

    int updateDeleteStatus(List<Long> ids, Integer deleteStatus);

    int updateLabelGroup(Long id, PmsProductLabelGroupParam groupParam);

    List<PmsProductLabelGroup> list(String name, Integer pageNum, Integer pageSize);
}
