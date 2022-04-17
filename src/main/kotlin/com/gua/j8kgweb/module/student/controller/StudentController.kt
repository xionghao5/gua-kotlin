package com.gua.j8kgweb.module.student.controller

import com.gua.j8kgweb.module.student.entity.Student
import com.gua.j8kgweb.module.student.service.IStudentService
import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/student")
@Api(tags = ["学生接口"])
class StudentController(
    val service: IStudentService
) {
    @ApiOperation("获取全部学生")
    @GetMapping("/getAll")
    fun getAll(): List<Student> {
        return service.list()
    }

    @ApiOperation("添加学生")
    @PostMapping("/add")
    fun add(
        @RequestBody student: Student
    ) {
        service.save(student)
    }
}