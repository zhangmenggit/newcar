package com.zchx.newcar.common.domain.user;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author zzm
 * @since 2019-03-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("sys_user")
public class UserEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "user_id", type = IdType.AUTO)
    private Long userId;

    /**
     * 用户名
     */
    @TableField("username")
    private String username;

    @TableField("name")
    private String name;

    /**
     * 密码
     */
    @TableField("password")
    private String password;

    @TableField("dept_id")
    private Long deptId;

    /**
     * 邮箱
     */
    @TableField("email")
    private String email;

    /**
     * 手机号
     */
    @TableField("mobile")
    private String mobile;

    /**
     * 状态 0:禁用，1:正常
     */
    @TableField("status")
    private Integer status;

    /**
     * 创建用户id
     */
    @TableField("user_id_create")
    private Long userIdCreate;

    /**
     * 创建时间
     */
    @TableField("gmt_create")
    private LocalDateTime gmtCreate;

    /**
     * 修改时间
     */
    @TableField("gmt_modified")
    private LocalDateTime gmtModified;

    /**
     * 性别
     */
    @TableField("sex")
    private Long sex;

    /**
     * 出身日期
     */
    @TableField("birth")
    private LocalDateTime birth;

    @TableField("pic_id")
    private Long picId;

    /**
     * 现居住地
     */
    @TableField("live_address")
    private String liveAddress;

    /**
     * 爱好
     */
    @TableField("hobby")
    private String hobby;

    /**
     * 省份
     */
    @TableField("province")
    private String province;

    /**
     * 所在城市
     */
    @TableField("city")
    private String city;

    /**
     * 所在地区
     */
    @TableField("district")
    private String district;

    /**
     * 用户的openId
     */
    @TableField("wechat_openid")
    private String wechatOpenid;

    /**
     * 用户的unionid
     */
    @TableField("wechat_unionid")
    private String wechatUnionid;

    /**
     * 用户头像
     */
    @TableField("head_img")
    private String headImg;

    /**
     * 用户类型 1前台用户 2 后台用户
     */
    @TableField("user_type")
    private Integer userType;

    /**
     * 新年寄语
     */
    @TableField("new_year_message")
    private String newYearMessage;


}
