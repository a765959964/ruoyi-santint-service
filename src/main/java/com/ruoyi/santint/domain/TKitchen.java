package com.ruoyi.santint.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * 门店管理对象 t_kitchen
 *
 * @author ruoyi
 * @date 2019-08-27
 */
public class TKitchen extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 序号
     */
    private Long id;

    /**
     * 门店id
     */
    @Excel(name = "门店id")
    private Long kitchenId;

    /**
     * 门店管理员账号
     */
    @Excel(name = "门店管理员账号")
    private String username;

    /**
     * 管理员密码
     */
    @Excel(name = "管理员密码")
    private String password;

    /**
     * 门店名称
     */
    @Excel(name = "门店名称")
    private String name;

    /**
     * 地址
     */
    @Excel(name = "地址")
    private String address;

    /**
     * 联系人
     */
    @Excel(name = "联系人")
    private String person;

    /**
     * 联系电话
     */
    @Excel(name = "联系电话")
    private String phone;

    /**
     * 用户token
     */
    @Excel(name = "用户token")
    private String userToken;

    /**
     * 是否 禁用0 否 1是
     */
    @Excel(name = "是否 禁用0 否 1是" , readConverterExp = "0=否,1=是")
    private Long status;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setKitchenId(Long kitchenId) {
        this.kitchenId = kitchenId;
    }

    public Long getKitchenId() {
        return kitchenId;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @NotBlank(message = "门店账号不能为空")
    @Size(min = 0, max = 30, message = "门店账号长度不能超过10个字符")
    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    @NotBlank(message = "门店名称不能为空")
    @Size(min = 0, max = 30, message = "门店名称长度不能超过30个字符")
    public String getName() {
        return name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public String getPerson() {
        return person;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Size(min = 0, max = 11, message = "手机号码长度不能超过11个字符")
    public String getPhone() {
        return phone;
    }

    public void setUserToken(String userToken) {
        this.userToken = userToken;
    }

    public String getUserToken() {
        return userToken;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public Long getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("id" , getId())
                .append("kitchenId" , getKitchenId())
                .append("username" , getUsername())
                .append("password" , getPassword())
                .append("name" , getName())
                .append("address" , getAddress())
                .append("person" , getPerson())
                .append("phone" , getPhone())
                .append("createTime" , getCreateTime())
                .append("userToken" , getUserToken())
                .append("status" , getStatus())
                .toString();
    }
}
