package com.gua.j8kgweb.module.student.service.impl

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import com.gua.j8kgweb.module.student.entity.Student
import com.gua.j8kgweb.module.student.mapper.StudentMapper
import com.gua.j8kgweb.module.student.service.IStudentService
import org.springframework.stereotype.Service

@Service
class StudentServiceImpl :
    ServiceImpl<StudentMapper, Student>(),
    IStudentService