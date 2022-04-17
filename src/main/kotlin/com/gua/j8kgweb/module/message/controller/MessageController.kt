package com.gua.j8kgweb.module.message.controller

import com.gua.j8kgweb.module.message.pojo.Message
import com.gua.j8kgweb.module.message.service.MessageService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/message")
class MessageController(val service: MessageService) {
    @GetMapping("/getAll")
    fun getAll(): List<Message> {
        return service.getAll()
    }

    @GetMapping("/addOne")
    fun addOne() {
        service.addOne()
    }
}