package com.macro.mall.mapper;

import com.macro.mall.model.PmsProductLabelGroup;
import com.macro.mall.model.PmsProductLabelGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsProductLabelGroupMapper {
    long countByExample(PmsProductLabelGroupExample example);

    int deleteByExample(PmsProductLabelGroupExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PmsProductLabelGroup record);

    int insertSelective(PmsProductLabelGroup record);

    List<PmsProductLabelGroup> selectByExample(PmsProductLabelGroupExample example);

    PmsProductLabelGroup selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PmsProductLabelGroup record, @Param("example") PmsProductLabelGroupExample example);

    int updateByExample(@Param("record") PmsProductLabelGroup record, @Param("example") PmsProductLabelGroupExample example);

    int updateByPrimaryKeySelective(PmsProductLabelGroup record);

    int updateByPrimaryKey(PmsProductLabelGroup record);
}