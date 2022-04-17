package com.gua.j8kgweb.module.message.service

import com.gua.j8kgweb.module.message.dao.MessageRepository
import com.gua.j8kgweb.module.message.pojo.Message
import com.gua.j8kgweb.util.StringUtil
import org.springframework.stereotype.Service

@Service
class MessageService(val db: MessageRepository) {
    fun getAll(): List<Message> {
        return db.getAll()
    }

    fun addOne() {
        db.save(Message(null, StringUtil().getRandomString(5)))
    }
}