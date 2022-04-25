package com.gua.j8kgweb.module.user.controller

import com.baomidou.dynamic.datasource.annotation.DS
import com.gua.j8kgweb.module.user.entity.User
import com.gua.j8kgweb.module.user.service.IUserService
import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*

/**
 *
 *
 * 前端控制器
 *
 *
 * @author xiong
 * @since 2022-04-24
 */
@RestController
@RequestMapping("/user")
@Api(tags = ["用户接口"])
class UserController(
    val service: IUserService
) {
    @ApiOperation("获取全部用户")
    @GetMapping("/getAll")
    @DS("db2")
    fun getAll(): List<User> {
        return service.list()
    }

    @ApiOperation("添加用户")
    @PostMapping("/add")
    @DS("db2")
    fun add(
        @RequestBody user: User
    ) {
        service.save(user)
    }
}