package com.macro.mall.controller;

import com.macro.mall.common.api.CommonPage;
import com.macro.mall.common.api.CommonResult;
import com.macro.mall.dto.PmsProductLabelGroupParam;
import com.macro.mall.model.PmsProductLabelGroup;
import com.macro.mall.service.PmsProductLabelGroupService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 商品标签Controller
 * Created by macro on 2018/4/26.
 */
@Controller
@Api(tags = "PmsProductLabelController", description = "商品标签管理")
@RequestMapping("/label")
public class PmsProductLabelController {
    @Resource
    private PmsProductLabelGroupService pmsProductLabelGroupService;

    @ApiOperation(value = "标签列表")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<PmsProductLabelGroup>> getList(@RequestParam(value = "name", required = false) String name,
                                                                  @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                                                  @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize) {
        List<PmsProductLabelGroup> list = pmsProductLabelGroupService.list(name, pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(list));
    }

    @ApiOperation("创建标签组")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
//    @PreAuthorize("hasAuthority('pms:labelGroup:create')")
    public CommonResult create(@Validated @RequestBody PmsProductLabelGroupParam groupParam, BindingResult result) {
        CommonResult commonResult;
        int count = pmsProductLabelGroupService.createLabelGroup(groupParam);
        if (count == 1) {
            commonResult = CommonResult.success(count);
        } else {
            commonResult = CommonResult.failed();
        }
        return commonResult;
    }

    @ApiOperation("根据标签组id获取标签组编辑信息")
    @RequestMapping(value = "/updateInfo/{id}", method = RequestMethod.GET)
    @ResponseBody
//    @PreAuthorize("hasAuthority('pms:labelGroup:read')")
    public CommonResult<PmsProductLabelGroupParam> getUpdateInfo(@PathVariable Long id) {
        PmsProductLabelGroupParam pmsProductLabelGroupParam = pmsProductLabelGroupService.getUpdateInfo(id);
        return CommonResult.success(pmsProductLabelGroupParam);
    }

    @ApiOperation("批量修改删除状态")
    @RequestMapping(value = "/update/deleteStatus", method = RequestMethod.POST)
    @ResponseBody
//    @PreAuthorize("hasAuthority('pms:labelGroup:delete')")
    public CommonResult updateDeleteStatus(@RequestParam("ids") List<Long> ids,
                                          @RequestParam("deleteStatus") Integer deleteStatus) {
        int count = pmsProductLabelGroupService.updateDeleteStatus(ids, deleteStatus);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation(value = "更新标签")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    @ResponseBody
//    @PreAuthorize("hasAuthority('pms:labelGroup:update')")
    public CommonResult update(@PathVariable("id") Long id,
                               @Validated @RequestBody PmsProductLabelGroupParam groupParam,
                               BindingResult result) {
        CommonResult commonResult;
        int count = pmsProductLabelGroupService.updateLabelGroup(id, groupParam);
        if (count == 1) {
            commonResult = CommonResult.success(count);
        } else {
            commonResult = CommonResult.failed();
        }
        return commonResult;
    }
}
