package com.korit.springboot_security.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;

public class SwaggerConfig {

    @Bean
    public OpenAPI getOpenAPI() {
        OpenAPI openAPI = new OpenAPI();
        openAPI.info(getInfo());
        return openAPI;
    }

    private Info getInfo() {
        Info info = new Info();
        info.title("Spring Boot security 수업");
        info.version("1.0");
        info.description("security 수업 내용입니다.");
        info.contact(getContact());
        return info;
    }

    private Contact getContact() {
        Contact contact = new Contact();
        contact.name("권민창");
        contact.email("kwonmc5.11@gmail.com");
        return contact;
    }
}
