package com.leo23.service.impl;

import com.leo23.entity.Department;
import com.leo23.mapper.DepartmentMapper;
import com.leo23.service.IDepartmentService;
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
public class DepartmentServiceImpl extends ServiceImpl<DepartmentMapper, Department> implements IDepartmentService {

}
