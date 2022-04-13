package com.gua.j8kgweb.service

import com.gua.j8kgweb.dao.MessageRepository
import com.gua.j8kgweb.pojo.Message
import com.gua.j8kgweb.util.StringUtil
import org.springframework.stereotype.Service

@Service
class MessageService(val db: MessageRepository) {
    fun getAll(): List<Message> {
        return db.getAll()
    }

    fun addOne() {
        db.save(Message(null,StringUtil().getRandomString(5)))
    }
}