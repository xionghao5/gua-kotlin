package com.gua.j8kgweb.module.student.entity

import com.baomidou.mybatisplus.annotation.IdType
import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty
import java.io.Serializable

/**
 *
 *
 *
 *
 *
 * @author xiong
 * @since 2022-04-17
 */
@TableName("sys_student")
@ApiModel(value = "Student对象", description = "")
class Student : Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    var id: Int? = null

    @ApiModelProperty("姓名")
    var name: String? = null

    @ApiModelProperty("年龄")
    var age: Int? = null

    override fun toString(): String {
        return "Student{" +
                "id=" + id +
                ", name=" + name +
                ", age=" + age +
                "}"
    }

    companion object {
        private const val serialVersionUID = 1L
    }
}