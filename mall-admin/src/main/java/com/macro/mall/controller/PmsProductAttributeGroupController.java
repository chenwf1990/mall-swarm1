package com.macro.mall.controller;

import com.macro.mall.common.api.CommonPage;
import com.macro.mall.common.api.CommonResult;
import com.macro.mall.dto.PmsProductAttributeGroupParam;
import com.macro.mall.model.PmsProductAttributeGroup;
import com.macro.mall.service.ProductAttributeGroupService;
import io.swagger.annotations.*;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 创建商品参数分组
 */
@Controller
@Api(tags = "PmsProductAttributeGroupController", description = "商品参数管理")
@RequestMapping("/productAttributeGroup")
public class PmsProductAttributeGroupController {
    @Resource
    private ProductAttributeGroupService productAttributeGroupService;

    @ApiOperation("参数列表")
    @ApiImplicitParams({@ApiImplicitParam(name = "type", value = "0表示属性，1表示参数", required = true, paramType = "query", dataType = "integer")})
    @RequestMapping(value = "/list/{cid}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<PmsProductAttributeGroup>> getList(@ApiParam("类目id") @PathVariable Long cid,
                                                                      @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                                      @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<PmsProductAttributeGroup> pmsProductAttributeGroupList = productAttributeGroupService.getList(cid, pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(pmsProductAttributeGroupList));
    }

    @ApiOperation("添加商品分组")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult create(@RequestBody PmsProductAttributeGroupParam pmsProductAttributeGroupParam, BindingResult bindingResult) {
        int count = productAttributeGroupService.create(pmsProductAttributeGroupParam);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation("修改商品属性信息")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult update(@PathVariable Long id, @RequestBody PmsProductAttributeGroupParam pmsProductAttributeGroupParam, BindingResult bindingResult) {
        int count = productAttributeGroupService.update(id, pmsProductAttributeGroupParam);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation("查询单个商品属性")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<PmsProductAttributeGroup> getParamGroup(@PathVariable Long id) {
        PmsProductAttributeGroup productAttributeGroup = productAttributeGroupService.getParamGroup(id);
        return CommonResult.success(productAttributeGroup);
    }

    @ApiOperation("批量删除商品属性")
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult delete(@RequestParam("ids") List<Long> ids) {
        int count = productAttributeGroupService.delete(ids);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation("获取品类对应属性参数")
    @RequestMapping(value = "/list/params/{cid}", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<Map<String,Object>> paramsList(@ApiParam("类目id") @PathVariable Long cid, BindingResult result) {
        Map<String,Object> map = productAttributeGroupService.paramsList(cid);
        return CommonResult.success(map,"");
    }
}
