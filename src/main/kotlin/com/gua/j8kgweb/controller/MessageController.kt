package com.gua.j8kgweb.controller

import com.gua.j8kgweb.pojo.Message
import com.gua.j8kgweb.service.MessageService
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
    fun addOne(){
         service.addOne()
    }
}