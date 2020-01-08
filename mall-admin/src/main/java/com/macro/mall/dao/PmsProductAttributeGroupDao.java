package com.macro.mall.dao;

import com.macro.mall.bo.AttributeGroupVo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface PmsProductAttributeGroupDao {

   @Select("select " +
           "a.id as attributeGroupId, " +
           "a.`name` as attributeGroupName, " +
           "b.id as attributeId, " +
           "b.`name` as attributeName " +
           "from pms_product_attribute_group a join pms_product_attribute b on a.id = b.product_attribute_category_id and b.type = 1 " +
           "where a.delete_status = 0 " +
           "and a.`status` = 0 " +
           "and b.delete_status = 0 " +
           "and a.product_attribute_category_id = #{cid} " +
           "ORDER BY b.sort")
   List<AttributeGroupVo> getParamsList(@Param("cid") Long cid);
}
