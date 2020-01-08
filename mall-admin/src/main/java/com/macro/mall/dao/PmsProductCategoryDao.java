package com.macro.mall.dao;

import com.macro.mall.bo.CategoryHistoryVo;
import com.macro.mall.dto.PmsProductCategoryWithChildrenItem;

import java.util.List;

/**
 * 商品分类自定义Dao
 * Created by macro on 2018/5/25.
 */
public interface PmsProductCategoryDao {
    List<PmsProductCategoryWithChildrenItem> listWithChildren();

    /**
     * 用户最近添加的品类
     * @param userId
     * @return
     */
    List<CategoryHistoryVo> getListHistory(Long userId);
}
