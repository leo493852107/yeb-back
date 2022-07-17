package com.leo23.service.impl;

import com.leo23.entity.Role;
import com.leo23.mapper.RoleMapper;
import com.leo23.service.IRoleService;
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
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {

}
