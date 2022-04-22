package com.gua.j8kgweb.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import springfox.documentation.builders.ApiInfoBuilder
import springfox.documentation.builders.PathSelectors
import springfox.documentation.builders.RequestHandlerSelectors
import springfox.documentation.service.Contact
import springfox.documentation.spi.DocumentationType
import springfox.documentation.spring.web.plugins.Docket
import springfox.documentation.swagger2.annotations.EnableSwagger2


@Configuration
@EnableSwagger2
class SwaggerConfig {

    /**
     * http://localhost:80/swagger-ui.html
     */
    @Bean
    fun createRestApi(): Docket {
        return Docket(DocumentationType.SWAGGER_2)
            .pathMapping("/")
            .select()
            .apis(RequestHandlerSelectors.basePackage("com.gua.j8kgweb"))
            .paths(PathSelectors.any())
            .build().apiInfo(
                ApiInfoBuilder()
                    .title("SpringBoot整合Swagger")
                    .description("SpringBoot整合Swagger，详细信息......")
                    .version("9.0")
                    .contact(Contact("xionghao", "blog.csdn.net", "18829037917@163.com"))
                    .license("The Apache License")
                    .licenseUrl("http://www.baidu.com")
                    .build()
            )
    }
}
