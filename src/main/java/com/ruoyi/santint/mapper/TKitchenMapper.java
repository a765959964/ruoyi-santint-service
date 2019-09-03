package com.ruoyi.santint.mapper;

import com.ruoyi.santint.domain.TKitchen;

import java.util.List;

/**
 * 门店管理Mapper接口
 *
 * @author ruoyi
 * @date 2019-08-27
 */
public interface TKitchenMapper {
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
     * 删除门店管理
     *
     * @param id 门店管理ID
     * @return 结果
     */
    public int deleteTKitchenById(Long id);

    /**
     * 批量删除门店管理
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTKitchenByIds(String[] ids);


    /**
     * 查询门店管理
     *
     * @param name
     * @return
     */
    TKitchen selectTKitchenByName(String name);

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
    TKitchen checkTkitchenUnique(TKitchen tKitchen);
}
