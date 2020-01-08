package com.macro.mall.dao;

import com.macro.mall.model.PmsProductLabelGroup;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 *
 */
public interface PmsProductLabelGroupDao {
    int insertList(@Param("list") List<PmsProductLabelGroup> pmsProductLabelGroups);
}
