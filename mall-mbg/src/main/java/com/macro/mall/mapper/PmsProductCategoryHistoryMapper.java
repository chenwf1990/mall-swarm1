package com.macro.mall.mapper;

import com.macro.mall.model.PmsProductCategoryHistory;
import com.macro.mall.model.PmsProductCategoryHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsProductCategoryHistoryMapper {
    long countByExample(PmsProductCategoryHistoryExample example);

    int deleteByExample(PmsProductCategoryHistoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PmsProductCategoryHistory record);

    int insertSelective(PmsProductCategoryHistory record);

    List<PmsProductCategoryHistory> selectByExample(PmsProductCategoryHistoryExample example);

    PmsProductCategoryHistory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PmsProductCategoryHistory record, @Param("example") PmsProductCategoryHistoryExample example);

    int updateByExample(@Param("record") PmsProductCategoryHistory record, @Param("example") PmsProductCategoryHistoryExample example);

    int updateByPrimaryKeySelective(PmsProductCategoryHistory record);

    int updateByPrimaryKey(PmsProductCategoryHistory record);
}