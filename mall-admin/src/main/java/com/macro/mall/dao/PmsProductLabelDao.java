package com.macro.mall.dao;

import com.macro.mall.model.PmsProductLabel;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PmsProductLabelDao {
    int insertList(@Param("list") List<PmsProductLabel> productLabelList);
}
