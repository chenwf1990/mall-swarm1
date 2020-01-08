package com.macro.mall.mapper;

import com.macro.mall.model.PmsShopCategoryAptitudeInfo;
import com.macro.mall.model.PmsShopCategoryAptitudeInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsShopCategoryAptitudeInfoMapper {
    long countByExample(PmsShopCategoryAptitudeInfoExample example);

    int deleteByExample(PmsShopCategoryAptitudeInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PmsShopCategoryAptitudeInfo record);

    int insertSelective(PmsShopCategoryAptitudeInfo record);

    List<PmsShopCategoryAptitudeInfo> selectByExample(PmsShopCategoryAptitudeInfoExample example);

    PmsShopCategoryAptitudeInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PmsShopCategoryAptitudeInfo record, @Param("example") PmsShopCategoryAptitudeInfoExample example);

    int updateByExample(@Param("record") PmsShopCategoryAptitudeInfo record, @Param("example") PmsShopCategoryAptitudeInfoExample example);

    int updateByPrimaryKeySelective(PmsShopCategoryAptitudeInfo record);

    int updateByPrimaryKey(PmsShopCategoryAptitudeInfo record);
}