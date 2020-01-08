package com.macro.mall.service;

import com.macro.mall.dto.PmsProductAttributeGroupParam;
import com.macro.mall.model.PmsProductAttributeGroup;

import java.util.List;
import java.util.Map;

public interface ProductAttributeGroupService {
    int create(PmsProductAttributeGroupParam pmsProductAttributeGroupParam);

    List<PmsProductAttributeGroup> getList(Long cid, Integer pageSize, Integer pageNum);

    int update(Long id, PmsProductAttributeGroupParam productAttributeParam);

    PmsProductAttributeGroup getParamGroup(Long id);

    int delete(List<Long> ids);

    Map<String, Object> paramsList(Long cid);
}
