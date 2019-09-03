package com.ruoyi.santint.service;

import com.ruoyi.santint.domain.TFoodCommonType;

import java.util.List;

import com.ruoyi.common.core.domain.Ztree;

/**
 * 菜系食材味型分类Service接口
 *
 * @author ruoyi
 * @date 2019-08-19
 */
public interface ITFoodCommonTypeService {
    /**
     * 查询菜系食材味型分类
     *
     * @param id 菜系食材味型分类ID
     * @return 菜系食材味型分类
     */
    public TFoodCommonType selectTFoodCommonTypeById(Long id);

    /**
     * 查询菜系食材味型分类列表
     *
     * @param tFoodCommonType 菜系食材味型分类
     * @return 菜系食材味型分类集合
     */
    public List<TFoodCommonType> selectTFoodCommonTypeList(TFoodCommonType tFoodCommonType);

    /**
     * 新增菜系食材味型分类
     *
     * @param tFoodCommonType 菜系食材味型分类
     * @return 结果
     */
    public int insertTFoodCommonType(TFoodCommonType tFoodCommonType);

    /**
     * 修改菜系食材味型分类
     *
     * @param tFoodCommonType 菜系食材味型分类
     * @return 结果
     */
    public int updateTFoodCommonType(TFoodCommonType tFoodCommonType);

    /**
     * 批量删除菜系食材味型分类
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTFoodCommonTypeByIds(String ids);

    /**
     * 删除菜系食材味型分类信息
     *
     * @param id 菜系食材味型分类ID
     * @return 结果
     */
    public int deleteTFoodCommonTypeById(Long id);

    /**
     * 查询菜系食材味型分类树列表
     *
     * @return 所有菜系食材味型分类信息
     */
    public List<Ztree> selectTFoodCommonTypeTree();
}
