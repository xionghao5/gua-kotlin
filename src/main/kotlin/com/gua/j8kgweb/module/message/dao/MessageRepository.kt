package com.gua.j8kgweb.module.message.dao

import com.gua.j8kgweb.module.message.pojo.Message
import org.springframework.data.jdbc.repository.query.Query
import org.springframework.data.repository.CrudRepository

interface MessageRepository : CrudRepository<Message, String> {
    @Query("select * from message")
    fun getAll(): List<Message>
}