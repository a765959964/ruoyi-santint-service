package com.ruoyi.santint.service;

import com.ruoyi.santint.domain.TKitchen;

import java.util.List;

/**
 * 门店管理Service接口
 *
 * @author ruoyi
 * @date 2019-08-27
 */
public interface ITKitchenService {
    /**
     * 查询门店管理
     *
     * @param id 门店管理ID
     * @return 门店管理
     */
    public TKitchen selectTKitchenById(Long id);

    /**
     * 查询门店管理列表
     *
     * @param tKitchen 门店管理
     * @return 门店管理集合
     */
    public List<TKitchen> selectTKitchenList(TKitchen tKitchen);

    /**
     * 新增门店管理
     *
     * @param tKitchen 门店管理
     * @return 结果
     */
    public int insertTKitchen(TKitchen tKitchen);

    /**
     * 修改门店管理
     *
     * @param tKitchen 门店管理
     * @return 结果
     */
    public int updateTKitchen(TKitchen tKitchen);

    /**
     * 批量删除门店管理
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTKitchenByIds(String ids);

    /**
     * 删除门店管理信息
     *
     * @param id 门店管理ID
     * @return 结果
     */
    public int deleteTKitchenById(Long id);

    /**
     * 导入门店数据
     *
     * @param kitchenList   门店数据列表
     * @param updateSupport 是否更新支持，如果已存在，则进行更新数据
     * @param operName      操作用户
     * @return 结果
     */
    String importKitchen(List<TKitchen> kitchenList, boolean updateSupport, String operName);

    /**
     * 查询门店是否唯一
     *
     * @param name
     * @return
     */
    int checkKitNameUnique(String name);


    /**
     * 查询门店实体是否唯一
     *
     * @param tKitchen
     * @return
     */
    String checkTkitchenUnique(TKitchen tKitchen);

}
