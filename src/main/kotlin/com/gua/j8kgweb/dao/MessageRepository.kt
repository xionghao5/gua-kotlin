package com.gua.j8kgweb.dao

import com.gua.j8kgweb.pojo.Message
import org.springframework.data.jdbc.repository.query.Query
import org.springframework.data.repository.CrudRepository

interface MessageRepository : CrudRepository<Message, String> {
    @Query("select * from message")
    fun getAll(): List<Message>
}