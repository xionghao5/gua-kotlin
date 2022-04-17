package com.gua.j8kgweb.util

import com.baomidou.mybatisplus.generator.FastAutoGenerator
import com.baomidou.mybatisplus.generator.config.GlobalConfig
import com.baomidou.mybatisplus.generator.config.OutputFile
import com.baomidou.mybatisplus.generator.config.PackageConfig
import com.baomidou.mybatisplus.generator.config.StrategyConfig
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine
import java.util.*


//程序入口
fun main(args: Array<String>) {
    generator()
}

//代码生成方法
fun generator() {
    FastAutoGenerator.create(
        "jdbc:mysql://localhost:3306/kotlin",
        "root",
        "888"
    )
        .globalConfig { builder: GlobalConfig.Builder ->
            builder.author("xiong") // 设置作者
                .enableSwagger() // 开启 swagger 模式
                .fileOverride() // 覆盖已生成文件
                .outputDir("D://temp//") // 指定输出目录
        }
        .packageConfig { builder: PackageConfig.Builder ->
            builder.parent("com.gua.j8kgweb.module.student") // 设置父包名
//                .moduleName("system") // 设置父包模块名
                .pathInfo(Collections.singletonMap(OutputFile.xml, "D://temp")) // 设置mapperXml生成路径
        }
        .strategyConfig { builder: StrategyConfig.Builder ->
            builder.addInclude("sys_student") // 设置需要生成的表名
                .addTablePrefix("sys_") // 设置过滤表前缀
        }
        .templateEngine(FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
        .execute()

}