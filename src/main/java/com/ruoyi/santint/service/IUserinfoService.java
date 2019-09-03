package com.ruoyi.santint.service;

import com.ruoyi.santint.domain.Userinfo;

import java.util.List;

/**
 * 个人资料Service接口
 *
 * @author ruoyi
 * @date 2019-08-19
 */
public interface IUserinfoService {
    /**
     * 查询个人资料
     *
     * @param id 个人资料ID
     * @return 个人资料
     */
    public Userinfo selectUserinfoById(Long id);

    /**
     * 查询个人资料列表
     *
     * @param userinfo 个人资料
     * @return 个人资料集合
     */
    public List<Userinfo> selectUserinfoList(Userinfo userinfo);

    /**
     * 新增个人资料
     *
     * @param userinfo 个人资料
     * @return 结果
     */
    public int insertUserinfo(Userinfo userinfo);

    /**
     * 修改个人资料
     *
     * @param userinfo 个人资料
     * @return 结果
     */
    public int updateUserinfo(Userinfo userinfo);

    /**
     * 批量删除个人资料
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteUserinfoByIds(String ids);

    /**
     * 删除个人资料信息
     *
     * @param id 个人资料ID
     * @return 结果
     */
    public int deleteUserinfoById(Long id);
}
