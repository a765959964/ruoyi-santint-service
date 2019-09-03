package com.ruoyi.santint.service;

import com.ruoyi.santint.domain.Foodtable;

import java.util.List;
import java.util.Map;

/**
 * 菜品Service接口
 *
 * @author ruoyi
 * @date 2019-08-19
 */
public interface IFoodtableService {
    /**
     * 查询菜品
     *
     * @param id 菜品ID
     * @return 菜品
     */
    public Foodtable selectFoodtableById(Long id);

    /**
     * 查询菜品列表
     *
     * @param foodtable 菜品
     * @return 菜品集合
     */
    public List<Foodtable> selectFoodtableList(Foodtable foodtable);

    /**
     * 新增菜品
     *
     * @param foodtable 菜品
     * @return 结果
     */
    public int insertFoodtable(Foodtable foodtable);

    /**
     * 修改菜品
     *
     * @param foodtable 菜品
     * @return 结果
     */
    public int updateFoodtable(Foodtable foodtable);

    /**
     * 批量删除菜品
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteFoodtableByIds(String ids);

    /**
     * 删除菜品信息
     *
     * @param id 菜品ID
     * @return 结果
     */
    public int deleteFoodtableById(Long id);


    /**
     * 查询菜品信息
     *
     * @param map
     * @return
     */
    List getFoodtableList(Map map);
}
