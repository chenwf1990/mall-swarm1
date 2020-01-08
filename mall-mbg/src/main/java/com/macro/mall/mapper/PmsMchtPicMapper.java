package com.macro.mall.mapper;

import com.macro.mall.model.PmsMchtPic;
import com.macro.mall.model.PmsMchtPicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsMchtPicMapper {
    long countByExample(PmsMchtPicExample example);

    int deleteByExample(PmsMchtPicExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PmsMchtPic record);

    int insertSelective(PmsMchtPic record);

    List<PmsMchtPic> selectByExample(PmsMchtPicExample example);

    PmsMchtPic selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PmsMchtPic record, @Param("example") PmsMchtPicExample example);

    int updateByExample(@Param("record") PmsMchtPic record, @Param("example") PmsMchtPicExample example);

    int updateByPrimaryKeySelective(PmsMchtPic record);

    int updateByPrimaryKey(PmsMchtPic record);
}