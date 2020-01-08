package com.macro.mall.controller;

import com.macro.mall.bo.ProductRecommendVo;
import com.macro.mall.common.api.CommonPage;
import com.macro.mall.common.api.CommonResult;
import com.macro.mall.model.PmsProductLabelGroup;
import com.macro.mall.model.PmsProductRecommend;
import com.macro.mall.service.PmsProductRecommendService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;


/**
 * 商品推荐
 * auth:chenwf
 */

@Controller
@Api(tags = "PmsProductRecommendController", description = "商品推荐管理")
@RequestMapping("/recommend")
public class PmsProductRecommendController {
    @Resource
    private PmsProductRecommendService PmsProductRecommendService;

    @ApiOperation(value = "商品推荐列表")
    @RequestMapping(value = "/productRecommendList", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<CommonPage<ProductRecommendVo>> productRecommendList(@RequestParam(value = "productId", required = false) Long productId) {
        List<ProductRecommendVo> list = PmsProductRecommendService.productRecommendList(productId);
        return CommonResult.success(CommonPage.restPage(list));
    }
}
