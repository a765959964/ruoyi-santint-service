package com.ruoyi.santint.service.impl;

import java.util.List;

import com.ruoyi.common.exception.BusinessException;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.santint.mapper.TKitchenMapper;
import com.ruoyi.santint.domain.TKitchen;
import com.ruoyi.santint.service.ITKitchenService;
import com.ruoyi.common.core.text.Convert;

/**
 * 门店管理Service业务层处理
 *
 * @author ruoyi
 * @date 2019-08-27
 */
@Service
public class TKitchenServiceImpl implements ITKitchenService {

    private static final Logger log = LoggerFactory.getLogger(TKitchenServiceImpl.class);

    @Autowired
    private TKitchenMapper tKitchenMapper;

    /**
     * 查询门店管理
     *
     * @param id 门店管理ID
     * @return 门店管理
     */
    @Override
    public TKitchen selectTKitchenById(Long id) {
        return tKitchenMapper.selectTKitchenById(id);
    }

    /**
     * 查询门店管理列表
     *
     * @param tKitchen 门店管理
     * @return 门店管理
     */
    @Override
    public List<TKitchen> selectTKitchenList(TKitchen tKitchen) {
        return tKitchenMapper.selectTKitchenList(tKitchen);
    }

    /**
     * 新增门店管理
     *
     * @param tKitchen 门店管理
     * @return 结果
     */
    @Override
    public int insertTKitchen(TKitchen tKitchen) {
        tKitchen.setCreateTime(DateUtils.getNowDate());
        return tKitchenMapper.insertTKitchen(tKitchen);
    }

    /**
     * 修改门店管理
     *
     * @param tKitchen 门店管理
     * @return 结果
     */
    @Override
    public int updateTKitchen(TKitchen tKitchen) {
        tKitchen.setUpdateTime(DateUtils.getNowDate());
        return tKitchenMapper.updateTKitchen(tKitchen);
    }

    /**
     * 删除门店管理对象
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTKitchenByIds(String ids) {
        return tKitchenMapper.deleteTKitchenByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除门店管理信息
     *
     * @param id 门店管理ID
     * @return 结果
     */
    public int deleteTKitchenById(Long id) {
        return tKitchenMapper.deleteTKitchenById(id);
    }


    @Override
    public String importKitchen(List<TKitchen> kitchenList, boolean updateSupport, String operName) {

        if (StringUtils.isNull(kitchenList) || kitchenList.size() == 0) {
            throw new BusinessException("导入门店数据不能为空！");
        }

        int successNum = 0;     //成功条数
        int failureNum = 0;     //失败条数

        StringBuilder successMsg = new StringBuilder();     //成功消息
        StringBuilder failureMsg = new StringBuilder();     //失败消息

        //循环导入数据
        for (TKitchen kitchen : kitchenList) {

            //验证是否存在门店名称
            TKitchen kit = tKitchenMapper.selectTKitchenByName(kitchen.getName());

            try {
                if (StringUtils.isNull(kit)) {        //导入
                    this.insertTKitchen(kitchen);
                    successNum++;
                    successMsg.append("<br/>" + successNum + "、门店 " + kitchen.getName() + " 导入成功");

                } else if (updateSupport) {          //更新
                    this.updateTKitchen(kitchen);
                    successNum++;
                    successMsg.append("<br/>" + successNum + "、门店 " + kitchen.getName() + " 更新成功");
                } else {
                    failureNum++;
                    failureMsg.append("<br/>" + failureNum + "、门店 " + kitchen.getName() + " 已存在");
                }
            } catch (Exception e) {
                failureNum++;
                String msg = "<br/>" + failureNum + "、门店 " + kitchen.getName() + " 导入失败：";
                failureMsg.append(msg + e.getMessage());
                log.error(msg, e);
            }

        }

        if (failureNum > 0) {
            failureMsg.insert(0, "很抱歉，导入失败！共 " + failureNum + " 条数据格式不正确，错误如下：");
            throw new BusinessException(failureMsg.toString());
        } else {
            successMsg.insert(0, "恭喜您，数据已全部导入成功！共 " + successNum + " 条，数据如下：");
        }
        return successMsg.toString();
    }

    @Override
    public int checkKitNameUnique(String name) {

        return tKitchenMapper.checkKitNameUnique(name);
    }

    @Override
    public String checkTkitchenUnique(TKitchen tKitchen) {
        Long kitchenId = StringUtils.isNull(tKitchen.getKitchenId()) ? 1L : tKitchen.getKitchenId();
        TKitchen kit = tKitchenMapper.checkTkitchenUnique(tKitchen);
        if (StringUtils.isNotNull(kit) && kit.getKitchenId().longValue() != kitchenId.longValue()) {
            return "1";
        }
        return "0";
    }

}
