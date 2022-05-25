package com.sprint1.ebs.connection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig {

    @Bean
    public Docket postsApi() {
        ApiInfo apiInfo = new ApiInfoBuilder()
                .title("Connection - EBS")
                .description("APIs for Connection ms")
                .version("1.0.0")
                .build();

        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.sprint1.ebs.connection"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo)
                .enable(true);
    }
}