package com.ruoyi.santint.service.impl;

import java.util.List;
import java.util.ArrayList;

import com.ruoyi.common.core.domain.Ztree;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.santint.mapper.TFoodCommonTypeMapper;
import com.ruoyi.santint.domain.TFoodCommonType;
import com.ruoyi.santint.service.ITFoodCommonTypeService;
import com.ruoyi.common.core.text.Convert;

/**
 * 菜系食材味型分类Service业务层处理
 *
 * @author ruoyi
 * @date 2019-08-19
 */
@Service
public class TFoodCommonTypeServiceImpl implements ITFoodCommonTypeService {
    @Autowired
    private TFoodCommonTypeMapper tFoodCommonTypeMapper;

    /**
     * 查询菜系食材味型分类
     *
     * @param id 菜系食材味型分类ID
     * @return 菜系食材味型分类
     */
    @Override
    public TFoodCommonType selectTFoodCommonTypeById(Long id) {
        return tFoodCommonTypeMapper.selectTFoodCommonTypeById(id);
    }

    /**
     * 查询菜系食材味型分类列表
     *
     * @param tFoodCommonType 菜系食材味型分类
     * @return 菜系食材味型分类
     */
    @Override
    public List<TFoodCommonType> selectTFoodCommonTypeList(TFoodCommonType tFoodCommonType) {
        return tFoodCommonTypeMapper.selectTFoodCommonTypeList(tFoodCommonType);
    }

    /**
     * 新增菜系食材味型分类
     *
     * @param tFoodCommonType 菜系食材味型分类
     * @return 结果
     */
    @Override
    public int insertTFoodCommonType(TFoodCommonType tFoodCommonType) {
        return tFoodCommonTypeMapper.insertTFoodCommonType(tFoodCommonType);
    }

    /**
     * 修改菜系食材味型分类
     *
     * @param tFoodCommonType 菜系食材味型分类
     * @return 结果
     */
    @Override
    public int updateTFoodCommonType(TFoodCommonType tFoodCommonType) {
        return tFoodCommonTypeMapper.updateTFoodCommonType(tFoodCommonType);
    }

    /**
     * 删除菜系食材味型分类对象
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTFoodCommonTypeByIds(String ids) {
        return tFoodCommonTypeMapper.deleteTFoodCommonTypeByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除菜系食材味型分类信息
     *
     * @param id 菜系食材味型分类ID
     * @return 结果
     */
    public int deleteTFoodCommonTypeById(Long id) {
        return tFoodCommonTypeMapper.deleteTFoodCommonTypeById(id);
    }

    /**
     * 查询菜系食材味型分类树列表
     *
     * @return 所有菜系食材味型分类信息
     */
    @Override
    public List<Ztree> selectTFoodCommonTypeTree() {
        List<TFoodCommonType> tFoodCommonTypeList = tFoodCommonTypeMapper.selectTFoodCommonTypeList(new TFoodCommonType());
        List<Ztree> ztrees = new ArrayList<Ztree>();
        for (TFoodCommonType tFoodCommonType : tFoodCommonTypeList) {
            if (tFoodCommonType.getStatus() == 1) {
                Ztree ztree = new Ztree();
                ztree.setId(Long.parseLong(tFoodCommonType.getCode()));
                ztree.setpId(Long.parseLong(tFoodCommonType.getPcode()));
                ztree.setName(tFoodCommonType.getName());
                ztree.setTitle(tFoodCommonType.getName());
                ztrees.add(ztree);
            }
        }
        return ztrees;
    }
}
