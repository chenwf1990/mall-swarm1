package com.macro.mall.mapper;

import com.macro.mall.model.PmsProductRecommend;
import com.macro.mall.model.PmsProductRecommendExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsProductRecommendMapper {
    long countByExample(PmsProductRecommendExample example);

    int deleteByExample(PmsProductRecommendExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PmsProductRecommend record);

    int insertSelective(PmsProductRecommend record);

    List<PmsProductRecommend> selectByExample(PmsProductRecommendExample example);

    PmsProductRecommend selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PmsProductRecommend record, @Param("example") PmsProductRecommendExample example);

    int updateByExample(@Param("record") PmsProductRecommend record, @Param("example") PmsProductRecommendExample example);

    int updateByPrimaryKeySelective(PmsProductRecommend record);

    int updateByPrimaryKey(PmsProductRecommend record);
}