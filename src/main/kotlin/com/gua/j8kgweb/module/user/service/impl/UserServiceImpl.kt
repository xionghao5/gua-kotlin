package com.gua.j8kgweb.module.user.service.impl

import com.baomidou.mybatisplus.core.metadata.IPage
import com.baomidou.mybatisplus.extension.plugins.pagination.Page
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import com.gua.j8kgweb.module.user.entity.User
import com.gua.j8kgweb.module.user.mapper.UserMapper
import com.gua.j8kgweb.module.user.pojo.UserDTO
import com.gua.j8kgweb.module.user.pojo.UserQO
import com.gua.j8kgweb.module.user.service.IUserService
import org.springframework.stereotype.Service

/**
 *
 *
 * 服务实现类
 *
 *
 * @author xiong
 * @since 2022-04-24
 */
@Service
class UserServiceImpl(
    val userMapper: UserMapper
) : ServiceImpl<UserMapper, User>(), IUserService {
    override fun getUserById(id: Int): UserDTO {
        return userMapper.selectUserById(id)
    }

    override fun getPage(userQO: UserQO): IPage<UserDTO> {
        var page = Page<UserDTO>(userQO.pageNo, userQO.pageSize)
        return userMapper.selectUserPage(page, userQO)
    }
}