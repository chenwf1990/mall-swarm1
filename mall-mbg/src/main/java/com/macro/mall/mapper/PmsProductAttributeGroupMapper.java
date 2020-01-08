package com.macro.mall.mapper;

import com.macro.mall.model.PmsProductAttributeGroup;
import com.macro.mall.model.PmsProductAttributeGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsProductAttributeGroupMapper {
    long countByExample(PmsProductAttributeGroupExample example);

    int deleteByExample(PmsProductAttributeGroupExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PmsProductAttributeGroup record);

    int insertSelective(PmsProductAttributeGroup record);

    List<PmsProductAttributeGroup> selectByExample(PmsProductAttributeGroupExample example);

    PmsProductAttributeGroup selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PmsProductAttributeGroup record, @Param("example") PmsProductAttributeGroupExample example);

    int updateByExample(@Param("record") PmsProductAttributeGroup record, @Param("example") PmsProductAttributeGroupExample example);

    int updateByPrimaryKeySelective(PmsProductAttributeGroup record);

    int updateByPrimaryKey(PmsProductAttributeGroup record);
}