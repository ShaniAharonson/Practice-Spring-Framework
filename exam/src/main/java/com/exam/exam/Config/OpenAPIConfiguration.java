package com.exam.exam.Config;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class OpenAPIConfiguration {
    @Bean
    public OpenAPI defineAPI() {
        Server server = new Server();
        server.setUrl("http://localhost:8080");
        server.setDescription("Students api for development");

        Contact myContact = new Contact();
        myContact.setName("Shani Aharonson");
        myContact.setEmail("shani.bolandi@gmail.com");

        Info info = new Info()
                .title("Student Management System API")
                .version("1.0")
                .description("This API exposes endpoints to manage students")
                .contact(myContact);
        return new OpenAPI().info(info).servers(List.of(server));
    }
}
