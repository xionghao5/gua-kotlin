package com.gua.j8kgweb.module.user.entity

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
 * @since 2022-04-24
 */
@TableName("sys_user")
@ApiModel(value = "User对象", description = "")
class User : Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    var id: Int? = null

    @ApiModelProperty("用户名")
    var username: String? = null

    @ApiModelProperty("密码")
    var password: String? = null
    override fun toString(): String {
        return "User{" +
                "id=" + id +
                ", username=" + username +
                ", password=" + password +
                "}"
    }

    companion object {
        private const val serialVersionUID = 1L
    }
}