package com.ruoyi.santint.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.TreeEntity;

/**
 * 菜系食材味型分类对象 t_food_common_type
 *
 * @author zf aaaa
 * @date 2019-08-19
 */
public class TFoodCommonType extends TreeEntity {
    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private Long id;

    /**
     * 编码
     */
    @Excel(name = "编码")
    private String code;

    /**
     * 名称
     */
    @Excel(name = "名称")
    private String name;

    /**
     * 1代表 一级2代表 二级
     */
    @Excel(name = "1代表 一级2代表 二级")
    private Long level;

    /**
     * 父id
     */
    @Excel(name = "父id")
    private String pcode;

    /**
     * 1 .菜系分类 4级2..食材分类 3级3. 味型分类 2级
     */
    @Excel(name = "1 .菜系分类 4级2..食材分类 3级3. 味型分类 2级")
    private Long status;

    /**
     * 备注
     */
    @Excel(name = "备注")
    private Long isdel;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setLevel(Long level) {
        this.level = level;
    }

    public Long getLevel() {
        return level;
    }

    public void setPcode(String pcode) {
        this.pcode = pcode;
    }

    public String getPcode() {
        return pcode;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public Long getStatus() {
        return status;
    }

    public void setIsdel(Long isdel) {
        this.isdel = isdel;
    }

    public Long getIsdel() {
        return isdel;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("id" , getId())
                .append("code" , getCode())
                .append("name" , getName())
                .append("level" , getLevel())
                .append("pcode" , getPcode())
                .append("status" , getStatus())
                .append("isdel" , getIsdel())
                .toString();
    }
}
