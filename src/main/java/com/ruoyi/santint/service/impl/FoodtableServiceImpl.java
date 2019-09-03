package com.ruoyi.santint.service.impl;

import java.util.List;
import java.util.Map;

import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.santint.mapper.FoodtableMapper;
import com.ruoyi.santint.domain.Foodtable;
import com.ruoyi.santint.service.IFoodtableService;
import com.ruoyi.common.core.text.Convert;

/**
 * 菜品Service业务层处理
 *
 * @author ruoyi
 * @date 2019-08-19
 */
@Service
public class FoodtableServiceImpl implements IFoodtableService {
    @Autowired
    private FoodtableMapper foodtableMapper;

    /**
     * 查询菜品
     *
     * @param id 菜品ID
     * @return 菜品
     */
    @Override
    public Foodtable selectFoodtableById(Long id) {
        return foodtableMapper.selectFoodtableById(id);
    }

    /**
     * 查询菜品列表
     *
     * @param foodtable 菜品
     * @return 菜品
     */
    @Override
    public List<Foodtable> selectFoodtableList(Foodtable foodtable) {
        return foodtableMapper.selectFoodtableList(foodtable);
    }

    /**
     * 新增菜品
     *
     * @param foodtable 菜品
     * @return 结果
     */
    @Override
    public int insertFoodtable(Foodtable foodtable) {
        foodtable.setCreateTime(DateUtils.getNowDate());
        return foodtableMapper.insertFoodtable(foodtable);
    }

    /**
     * 修改菜品
     *
     * @param foodtable 菜品
     * @return 结果
     */
    @Override
    public int updateFoodtable(Foodtable foodtable) {
        foodtable.setUpdateTime(DateUtils.getNowDate());
        return foodtableMapper.updateFoodtable(foodtable);
    }

    /**
     * 删除菜品对象
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteFoodtableByIds(String ids) {
        return foodtableMapper.deleteFoodtableByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除菜品信息
     *
     * @param id 菜品ID
     * @return 结果
     */
    public int deleteFoodtableById(Long id) {
        return foodtableMapper.deleteFoodtableById(id);
    }

    @Override
    public List getFoodtableList(Map map) {
        return foodtableMapper.getFoodtableList(map);
    }
}
