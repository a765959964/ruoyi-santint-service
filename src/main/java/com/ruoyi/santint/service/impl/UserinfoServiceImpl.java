package com.ruoyi.santint.service.impl;

import java.util.List;

import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.santint.mapper.UserinfoMapper;
import com.ruoyi.santint.domain.Userinfo;
import com.ruoyi.santint.service.IUserinfoService;
import com.ruoyi.common.core.text.Convert;

/**
 * 个人资料Service业务层处理
 *
 * @author ruoyi
 * @date 2019-08-19
 */
@Service
public class UserinfoServiceImpl implements IUserinfoService {
    @Autowired
    private UserinfoMapper userinfoMapper;

    /**
     * 查询个人资料
     *
     * @param id 个人资料ID
     * @return 个人资料
     */
    @Override
    public Userinfo selectUserinfoById(Long id) {
        return userinfoMapper.selectUserinfoById(id);
    }

    /**
     * 查询个人资料列表
     *
     * @param userinfo 个人资料
     * @return 个人资料
     */
    @Override
    public List<Userinfo> selectUserinfoList(Userinfo userinfo) {
        return userinfoMapper.selectUserinfoList(userinfo);
    }

    /**
     * 新增个人资料
     *
     * @param userinfo 个人资料
     * @return 结果
     */
    @Override
    public int insertUserinfo(Userinfo userinfo) {
        userinfo.setCreateTime(DateUtils.getNowDate());
        return userinfoMapper.insertUserinfo(userinfo);
    }

    /**
     * 修改个人资料
     *
     * @param userinfo 个人资料
     * @return 结果
     */
    @Override
    public int updateUserinfo(Userinfo userinfo) {
        userinfo.setUpdateTime(DateUtils.getNowDate());
        return userinfoMapper.updateUserinfo(userinfo);
    }

    /**
     * 删除个人资料对象
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteUserinfoByIds(String ids) {
        return userinfoMapper.deleteUserinfoByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除个人资料信息
     *
     * @param id 个人资料ID
     * @return 结果
     */
    public int deleteUserinfoById(Long id) {
        return userinfoMapper.deleteUserinfoById(id);
    }
}
