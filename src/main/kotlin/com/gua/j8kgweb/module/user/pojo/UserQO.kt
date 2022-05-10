package com.gua.j8kgweb.module.user.pojo

data class UserQO(
    var username: String = "",
    var pageNo: Long = 1,
    var pageSize: Long = 10,
)