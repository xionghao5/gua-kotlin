package com.gua.j8kgweb.module.user.service

import com.baomidou.mybatisplus.core.metadata.IPage
import com.baomidou.mybatisplus.extension.service.IService
import com.gua.j8kgweb.module.user.entity.User
import com.gua.j8kgweb.module.user.pojo.UserDTO
import com.gua.j8kgweb.module.user.pojo.UserQO

/**
 *
 *
 * 服务类
 *
 *
 * @author xiong
 * @since 2022-04-24
 */
interface IUserService : IService<User> {
    fun getUserById(id: Int): UserDTO
    fun getPage(userQO: UserQO): IPage<UserDTO>
}