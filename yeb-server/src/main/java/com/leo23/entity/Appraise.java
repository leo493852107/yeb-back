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
@TableName("t_appraise")
public class Appraise implements Serializable {

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
     * 考评日期
     */
    private LocalDate appDate;

    /**
     * 考评结果
     */
    private String appResult;

    /**
     * 考评内容
     */
    private String appContent;

    /**
     * 备注
     */
    private String remark;


}
