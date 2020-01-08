package com.macro.mall.mapper;

import com.macro.mall.model.PmsProductLabel;
import com.macro.mall.model.PmsProductLabelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsProductLabelMapper {
    long countByExample(PmsProductLabelExample example);

    int deleteByExample(PmsProductLabelExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PmsProductLabel record);

    int insertSelective(PmsProductLabel record);

    List<PmsProductLabel> selectByExample(PmsProductLabelExample example);

    PmsProductLabel selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PmsProductLabel record, @Param("example") PmsProductLabelExample example);

    int updateByExample(@Param("record") PmsProductLabel record, @Param("example") PmsProductLabelExample example);

    int updateByPrimaryKeySelective(PmsProductLabel record);

    int updateByPrimaryKey(PmsProductLabel record);
}