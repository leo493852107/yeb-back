package com.leo23.service.impl;

import com.leo23.entity.Admin;
import com.leo23.mapper.AdminMapper;
import com.leo23.service.IAdminService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author leo23
 * @since 2022-07-17
 */
@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements IAdminService {

}
