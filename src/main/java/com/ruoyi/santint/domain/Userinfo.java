package com.ruoyi.santint.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 个人资料对象 userinfo
 *
 * @author ruoyi
 * @date 2019-08-19
 */
public class Userinfo extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private Long id;

    /**
     * 用户ID
     */
    @Excel(name = "用户ID")
    private String userid;

    /**
     * 用户名
     */
    @Excel(name = "用户名")
    private String username;

    /**
     * 密码
     */
    @Excel(name = "密码")
    private String password;

    /**
     * 支付密码
     */
    @Excel(name = "支付密码")
    private String paypassword;

    /**
     * 头像地址
     */
    @Excel(name = "头像地址")
    private String headaddr;

    /**
     * 昵称
     */
    @Excel(name = "昵称")
    private String nickname;

    /**
     * 性别1、男2、女
     */
    @Excel(name = "性别1、男2、女")
    private Long sex;

    /**
     * 生日
     */
    @Excel(name = "生日")
    private Long birthday;

    /**
     * 民族
     */
    @Excel(name = "民族")
    private String nation;

    /**
     * 口味偏好
     */
    @Excel(name = "口味偏好")
    private Long tastepre;

    /**
     * 手机
     */
    @Excel(name = "手机")
    private String phone;

    /**
     * 成长指
     */
    @Excel(name = "成长指")
    private Long growvalue;

    /**
     * 邮箱
     */
    @Excel(name = "邮箱")
    private String email;

    /**
     * 用户信息版本号
     */
    @Excel(name = "用户信息版本号")
    private String userinfover;

    /**
     * 多客户端最新版本标示
     */
    @Excel(name = "多客户端最新版本标示")
    private String mutilnewestver;

    /**
     * null
     */
    @Excel(name = "null")
    private String token;

    /**
     * 标志：1、异常2、正常
     */
    @Excel(name = "标志：1、异常2、正常")
    private Long falg;

    /**
     * 用户IP
     */
    @Excel(name = "用户IP")
    private String userip;

    /**
     * 用户端口
     */
    @Excel(name = "用户端口")
    private String userport;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPaypassword(String paypassword) {
        this.paypassword = paypassword;
    }

    public String getPaypassword() {
        return paypassword;
    }

    public void setHeadaddr(String headaddr) {
        this.headaddr = headaddr;
    }

    public String getHeadaddr() {
        return headaddr;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setSex(Long sex) {
        this.sex = sex;
    }

    public Long getSex() {
        return sex;
    }

    public void setBirthday(Long birthday) {
        this.birthday = birthday;
    }

    public Long getBirthday() {
        return birthday;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getNation() {
        return nation;
    }

    public void setTastepre(Long tastepre) {
        this.tastepre = tastepre;
    }

    public Long getTastepre() {
        return tastepre;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setGrowvalue(Long growvalue) {
        this.growvalue = growvalue;
    }

    public Long getGrowvalue() {
        return growvalue;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setUserinfover(String userinfover) {
        this.userinfover = userinfover;
    }

    public String getUserinfover() {
        return userinfover;
    }

    public void setMutilnewestver(String mutilnewestver) {
        this.mutilnewestver = mutilnewestver;
    }

    public String getMutilnewestver() {
        return mutilnewestver;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setFalg(Long falg) {
        this.falg = falg;
    }

    public Long getFalg() {
        return falg;
    }

    public void setUserip(String userip) {
        this.userip = userip;
    }

    public String getUserip() {
        return userip;
    }

    public void setUserport(String userport) {
        this.userport = userport;
    }

    public String getUserport() {
        return userport;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("id" , getId())
                .append("userid" , getUserid())
                .append("username" , getUsername())
                .append("password" , getPassword())
                .append("paypassword" , getPaypassword())
                .append("headaddr" , getHeadaddr())
                .append("nickname" , getNickname())
                .append("sex" , getSex())
                .append("birthday" , getBirthday())
                .append("nation" , getNation())
                .append("tastepre" , getTastepre())
                .append("phone" , getPhone())
                .append("growvalue" , getGrowvalue())
                .append("email" , getEmail())
                .append("userinfover" , getUserinfover())
                .append("mutilnewestver" , getMutilnewestver())
                .append("token" , getToken())
                .append("falg" , getFalg())
                .append("createTime" , getCreateTime())
                .append("userip" , getUserip())
                .append("userport" , getUserport())
                .toString();
    }
}
