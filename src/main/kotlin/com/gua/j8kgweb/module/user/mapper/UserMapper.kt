package com.gua.j8kgweb.module.user.mapper

import com.baomidou.dynamic.datasource.annotation.DS
import com.baomidou.mybatisplus.core.mapper.BaseMapper
import com.baomidou.mybatisplus.core.metadata.IPage
import com.baomidou.mybatisplus.extension.plugins.pagination.Page
import com.gua.j8kgweb.module.user.entity.User
import com.gua.j8kgweb.module.user.pojo.UserDTO
import com.gua.j8kgweb.module.user.pojo.UserQO
import org.apache.ibatis.annotations.Mapper

/**
 *
 *
 * Mapper 接口
 *
 *
 * @author xiong
 * @since 2022-04-24
 */
@Mapper
interface UserMapper : BaseMapper<User> {
    fun selectUserById(id: Int): UserDTO

    @DS("db2")
    fun selectUserPage(page: Page<UserDTO>, userQO: UserQO): IPage<UserDTO>
}
