package com.ruoyi.santint.domain;

import com.ruoyi.common.annotation.Excels;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 菜品对象 foodtable
 *  zf
 * @author zfaa
 * @date 2019-08-19
 */
public class Foodtable extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private Long id;

    /**
     * 菜品ID
     */
    @Excel(name = "菜品ID")
    private Long foodid;

    /**
     * 综合
     */
    @Excel(name = "综合")
    private Long global;

    /**
     * 评分
     */
    @Excel(name = "评分")
    private Double score;

    /**
     * 评分次数
     */
    @Excel(name = "评分次数")
    private Long scorecount;

    /**
     * 销量
     */
    @Excel(name = "销量")
    private Long sales;

    /**
     * 价格
     */
    @Excel(name = "价格")
    private Double price;

    /**
     * 菜品图标地址
     */
    @Excel(name = "菜品图标地址")
    private String iconaddress;

    /**
     * 菜图片地址
     */
    @Excel(name = "菜图片地址")
    private String imageaddress;

    /**
     * 菜名
     */
    @Excel(name = "菜名")
    private String foodname;

    /**
     * 酸度
     */
    @Excel(name = "酸度")
    private Long sour;

    /**
     * 甜度
     */
    @Excel(name = "甜度")
    private Long sweet;

    /**
     * 咸度
     */
    @Excel(name = "咸度")
    private Long salty;

    /**
     * 辣度
     */
    @Excel(name = "辣度")
    private Long hot;

    /**
     * 作者名
     */
    @Excel(name = "作者名")
    private String authorname;

    /**
     * 作者简介
     */
    @Excel(name = "作者简介")
    private String authorbrief;

    /**
     * 作者图标
     */
    @Excel(name = "作者图标")
    private String authoricon;

    /**
     * 作者详情
     */
    @Excel(name = "作者详情")
    private String authordetail;

    /**
     * 菜品简介
     */
    @Excel(name = "菜品简介")
    private String foodbrief;

    /**
     * 菜品详情
     */
    @Excel(name = "菜品详情")
    private String fooddetail;

    /**
     * 配菜菜品分类号
     */
    @Excel(name = "配菜菜品分类号")
    private String matchfoodnum;

    /**
     * 搭配菜品ID
     */
    @Excel(name = "搭配菜品ID")
    private String matchfoodid;

    /**
     * 菜品状态
     */
    @Excel(name = "菜品状态")
    private Long foodstat;

    /**
     * 菜品详情路径
     */
    @Excel(name = "菜品详情路径")
    private String jsonpath;

    /**
     * foodtype_id
     */
    @Excel(name = "foodtype_id")
    private Long foodtypeId;

    /**
     * 0 否 1 是
     */
    @Excel(name = "0 否 1 是")
    private Long isdel;

    /**
     * 菜系ID
     */
    @Excel(name = "菜系ID")
    private String foodCommonId;

    /**
     * 食材ID
     */
    @Excel(name = "食材ID")
    private String materialId;

    /**
     * 味型id
     */
    @Excel(name = "味型id")
    private String tasteId;

    /**
     * 菜系字段
     */
    @Excel(name = "菜系字段")
    private String foodtypeField;

    /**
     * 菜系id
     */
    @Excel(name = "菜系id")
    private Long foodcommonId;

    /**
     * 制作时间
     */
    @Excel(name = "制作时间")
    private Long wastetime;

    /**
     * 版本号
     */
    @Excel(name = "版本号")
    private String version;


    public TFoodCommonType gettFoodCommonType() {
        return tFoodCommonType;
    }

    public void settFoodCommonType(TFoodCommonType tFoodCommonType) {
        this.tFoodCommonType = tFoodCommonType;
    }

    /**
     * 菜系对象
     */
    private TFoodCommonType tFoodCommonType;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setFoodid(Long foodid) {
        this.foodid = foodid;
    }

    public Long getFoodid() {
        return foodid;
    }

    public void setGlobal(Long global) {
        this.global = global;
    }

    public Long getGlobal() {
        return global;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Double getScore() {
        return score;
    }

    public void setScorecount(Long scorecount) {
        this.scorecount = scorecount;
    }

    public Long getScorecount() {
        return scorecount;
    }

    public void setSales(Long sales) {
        this.sales = sales;
    }

    public Long getSales() {
        return sales;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }

    public void setIconaddress(String iconaddress) {
        this.iconaddress = iconaddress;
    }

    public String getIconaddress() {
        return iconaddress;
    }

    public void setImageaddress(String imageaddress) {
        this.imageaddress = imageaddress;
    }

    public String getImageaddress() {
        return imageaddress;
    }

    public void setFoodname(String foodname) {
        this.foodname = foodname;
    }

    public String getFoodname() {
        return foodname;
    }

    public void setSour(Long sour) {
        this.sour = sour;
    }

    public Long getSour() {
        return sour;
    }

    public void setSweet(Long sweet) {
        this.sweet = sweet;
    }

    public Long getSweet() {
        return sweet;
    }

    public void setSalty(Long salty) {
        this.salty = salty;
    }

    public Long getSalty() {
        return salty;
    }

    public void setHot(Long hot) {
        this.hot = hot;
    }

    public Long getHot() {
        return hot;
    }

    public void setAuthorname(String authorname) {
        this.authorname = authorname;
    }

    public String getAuthorname() {
        return authorname;
    }

    public void setAuthorbrief(String authorbrief) {
        this.authorbrief = authorbrief;
    }

    public String getAuthorbrief() {
        return authorbrief;
    }

    public void setAuthoricon(String authoricon) {
        this.authoricon = authoricon;
    }

    public String getAuthoricon() {
        return authoricon;
    }

    public void setAuthordetail(String authordetail) {
        this.authordetail = authordetail;
    }

    public String getAuthordetail() {
        return authordetail;
    }

    public void setFoodbrief(String foodbrief) {
        this.foodbrief = foodbrief;
    }

    public String getFoodbrief() {
        return foodbrief;
    }

    public void setFooddetail(String fooddetail) {
        this.fooddetail = fooddetail;
    }

    public String getFooddetail() {
        return fooddetail;
    }

    public void setMatchfoodnum(String matchfoodnum) {
        this.matchfoodnum = matchfoodnum;
    }

    public String getMatchfoodnum() {
        return matchfoodnum;
    }

    public void setMatchfoodid(String matchfoodid) {
        this.matchfoodid = matchfoodid;
    }

    public String getMatchfoodid() {
        return matchfoodid;
    }

    public void setFoodstat(Long foodstat) {
        this.foodstat = foodstat;
    }

    public Long getFoodstat() {
        return foodstat;
    }

    public void setJsonpath(String jsonpath) {
        this.jsonpath = jsonpath;
    }

    public String getJsonpath() {
        return jsonpath;
    }

    public void setFoodtypeId(Long foodtypeId) {
        this.foodtypeId = foodtypeId;
    }

    public Long getFoodtypeId() {
        return foodtypeId;
    }

    public void setIsdel(Long isdel) {
        this.isdel = isdel;
    }

    public Long getIsdel() {
        return isdel;
    }

    public void setFoodCommonId(String foodCommonId) {
        this.foodCommonId = foodCommonId;
    }

    public String getFoodCommonId() {
        return foodCommonId;
    }

    public void setMaterialId(String materialId) {
        this.materialId = materialId;
    }

    public String getMaterialId() {
        return materialId;
    }

    public void setTasteId(String tasteId) {
        this.tasteId = tasteId;
    }

    public String getTasteId() {
        return tasteId;
    }

    public void setFoodtypeField(String foodtypeField) {
        this.foodtypeField = foodtypeField;
    }

    public String getFoodtypeField() {
        return foodtypeField;
    }

    public void setFoodcommonId(Long foodcommonId) {
        this.foodcommonId = foodcommonId;
    }

    public Long getFoodcommonId() {
        return foodcommonId;
    }

    public void setWastetime(Long wastetime) {
        this.wastetime = wastetime;
    }

    public Long getWastetime() {
        return wastetime;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getVersion() {
        return version;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("id" , getId())
                .append("foodid" , getFoodid())
                .append("global" , getGlobal())
                .append("score" , getScore())
                .append("scorecount" , getScorecount())
                .append("sales" , getSales())
                .append("price" , getPrice())
                .append("iconaddress" , getIconaddress())
                .append("imageaddress" , getImageaddress())
                .append("foodname" , getFoodname())
                .append("sour" , getSour())
                .append("sweet" , getSweet())
                .append("salty" , getSalty())
                .append("hot" , getHot())
                .append("authorname" , getAuthorname())
                .append("authorbrief" , getAuthorbrief())
                .append("authoricon" , getAuthoricon())
                .append("authordetail" , getAuthordetail())
                .append("foodbrief" , getFoodbrief())
                .append("fooddetail" , getFooddetail())
                .append("matchfoodnum" , getMatchfoodnum())
                .append("matchfoodid" , getMatchfoodid())
                .append("foodstat" , getFoodstat())
                .append("jsonpath" , getJsonpath())
                .append("foodtypeId" , getFoodtypeId())
                .append("isdel" , getIsdel())
                .append("foodCommonId" , getFoodCommonId())
                .append("materialId" , getMaterialId())
                .append("tasteId" , getTasteId())
                .append("foodtypeField" , getFoodtypeField())
                .append("foodcommonId" , getFoodcommonId())
                .append("createTime" , getCreateTime())
                .append("wastetime" , getWastetime())
                .append("version" , getVersion())
                .append("tFoodCommonType" , gettFoodCommonType())
                .toString();
    }
}
