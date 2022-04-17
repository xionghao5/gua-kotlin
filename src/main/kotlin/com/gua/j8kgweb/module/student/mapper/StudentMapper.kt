package com.gua.j8kgweb.module.student.mapper

import com.baomidou.mybatisplus.core.mapper.BaseMapper
import com.gua.j8kgweb.module.student.entity.Student
import org.apache.ibatis.annotations.Mapper

@Mapper
interface StudentMapper : BaseMapper<Student>