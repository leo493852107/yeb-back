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
@TableName("t_employee_remove")
public class EmployeeRemove implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 员工id
     */
    private Integer eid;

    /**
     * 调动后部门
     */
    private Integer afterDepId;

    /**
     * 调动后职位
     */
    private Integer afterJobId;

    /**
     * 调动日期
     */
    private LocalDate removeDate;

    /**
     * 调动原因
     */
    private String reason;

    /**
     * 备注
     */
    private String remark;


}
