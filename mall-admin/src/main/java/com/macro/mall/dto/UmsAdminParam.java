package com.macro.mall.dto;

import com.macro.mall.model.PmsMchtAptitudeInfo;
import com.macro.mall.model.PmsMchtShopInfo;
import com.macro.mall.model.PmsShopCategoryAptitudeInfo;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import java.util.List;

/**
 * 用户登录参数
 * Created by macro on 2018/4/26.
 */
@Getter
@Setter
public class UmsAdminParam {
    @ApiModelProperty(value = "用户名", required = true)
    @NotEmpty(message = "用户名不能为空")
    private String username;
    @ApiModelProperty(value = "密码", required = true)
    @NotEmpty(message = "密码不能为空")
    private String password;
    @ApiModelProperty(value = "用户头像")
    private String icon;
    @ApiModelProperty(value = "邮箱")
    @Email(message = "邮箱格式不合法")
    private String email;
    @ApiModelProperty(value = "用户昵称")
    private String nickName;
    @ApiModelProperty(value = "备注")
    private String note;
    @ApiModelProperty(value = "用户类型1商家 2平台", required = true)
    @NotEmpty(message = "用户类型不能为空")
    private Integer type;


    @ApiModelProperty(value = "身份证正照图片 type=2必传")
    private String idCardPic1;
    @ApiModelProperty(value = "身份证反照图片 type=2必传")
    private String idCardPic2;
    @ApiModelProperty(value = "商家入驻资质信息 type=2必传")
    private PmsMchtAptitudeInfo pmsMchtAptitudeInfo;
    @ApiModelProperty(value = "商家店铺信息 type=2必传")
    private PmsMchtShopInfo pmsMchtShopInfo;
    @ApiModelProperty(value = "对应类目行业资质集合 type=2必传")
    private List<PmsShopCategoryAptitudeInfo> pmsShopCategoryAptitudeInfos;


}
