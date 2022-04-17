package com.gua.j8kgweb.module.message.pojo

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table("message")
data class Message(
    @Id val id: String?,
    val text: String
)