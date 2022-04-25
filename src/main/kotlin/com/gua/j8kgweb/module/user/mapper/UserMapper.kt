package com.gua.j8kgweb.module.user.mapper

import com.baomidou.mybatisplus.core.mapper.BaseMapper
import com.gua.j8kgweb.module.user.entity.User
import com.gua.j8kgweb.module.user.pojo.UserDTO

/**
 *
 *
 * Mapper 接口
 *
 *
 * @author xiong
 * @since 2022-04-24
 */
interface UserMapper : BaseMapper<User> {
    fun selectUserById(id: Int): UserDTO
}
