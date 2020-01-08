package com.macro.mall.mapper;

import com.macro.mall.model.PmsMchtAptitudeInfo;
import com.macro.mall.model.PmsMchtAptitudeInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsMchtAptitudeInfoMapper {
    long countByExample(PmsMchtAptitudeInfoExample example);

    int deleteByExample(PmsMchtAptitudeInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PmsMchtAptitudeInfo record);

    int insertSelective(PmsMchtAptitudeInfo record);

    List<PmsMchtAptitudeInfo> selectByExample(PmsMchtAptitudeInfoExample example);

    PmsMchtAptitudeInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PmsMchtAptitudeInfo record, @Param("example") PmsMchtAptitudeInfoExample example);

    int updateByExample(@Param("record") PmsMchtAptitudeInfo record, @Param("example") PmsMchtAptitudeInfoExample example);

    int updateByPrimaryKeySelective(PmsMchtAptitudeInfo record);

    int updateByPrimaryKey(PmsMchtAptitudeInfo record);
}