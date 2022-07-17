package com.leo23.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 *
 * @author leo23
 * @since 2022-07-17
 */
@Getter
@Setter
@TableName("t_employee_ec")
public class EmployeeEc implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 员工编号
     */
    private Integer eid;

    /**
     * 奖罚日期
     */
    private LocalDate ecDate;

    /**
     * 奖罚原因
     */
    private String ecReason;

    /**
     * 奖罚分
     */
    private Integer ecPoint;

    /**
     * 奖罚类别，0：奖，1：罚
     */
    private Integer ecType;

    /**
     * 备注
     */
    private String remark;


}
