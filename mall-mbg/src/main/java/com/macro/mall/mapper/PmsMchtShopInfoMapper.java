package com.macro.mall.mapper;

import com.macro.mall.model.PmsMchtShopInfo;
import com.macro.mall.model.PmsMchtShopInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsMchtShopInfoMapper {
    long countByExample(PmsMchtShopInfoExample example);

    int deleteByExample(PmsMchtShopInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PmsMchtShopInfo record);

    int insertSelective(PmsMchtShopInfo record);

    List<PmsMchtShopInfo> selectByExample(PmsMchtShopInfoExample example);

    PmsMchtShopInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PmsMchtShopInfo record, @Param("example") PmsMchtShopInfoExample example);

    int updateByExample(@Param("record") PmsMchtShopInfo record, @Param("example") PmsMchtShopInfoExample example);

    int updateByPrimaryKeySelective(PmsMchtShopInfo record);

    int updateByPrimaryKey(PmsMchtShopInfo record);
}