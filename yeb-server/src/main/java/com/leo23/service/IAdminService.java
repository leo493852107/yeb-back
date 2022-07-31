package com.leo23.service;

import com.leo23.entity.Admin;
import com.baomidou.mybatisplus.extension.service.IService;
import com.leo23.entity.RespBean;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author leo23
 * @since 2022-07-17
 */
public interface IAdminService extends IService<Admin> {
    /**
     * 登录之后返回token
     *
     * @param username
     * @param password
     * @param request
     * @return
     */
    RespBean login(String username, String password, HttpServletRequest request);

    /**
     * 根据用户名获取用户
     *
     * @param username
     * @return
     */
    Admin getAdminByUserName(String username);
}
