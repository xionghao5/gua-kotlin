package com.gua.j8kgweb.module.message.controller

import com.gua.j8kgweb.module.message.pojo.Message
import com.gua.j8kgweb.module.message.service.MessageService
import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@Api(tags = ["消息接口"])
@RestController
@RequestMapping("/message")
class MessageController(val service: MessageService) {
    @ApiOperation("获取全部消息")
    @GetMapping("/getAll")
    fun getAll(): List<Message> {
        return service.getAll()
    }

    @ApiOperation("新增消息")
    @GetMapping("/addOne")
    fun addOne() {
        service.addOne()
    }
}