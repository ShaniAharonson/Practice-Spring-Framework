package com.phase2.javaProject_Phase2.config;
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
        server.setDescription("Donation api for development");

        Contact myContact = new Contact();
        myContact.setName("Shani Aharonson");
        myContact.setEmail("shani.bolandi@gmail.com");

        Info info = new Info()
                .title("Donation Management System API")
                .version("1.0")
                .description("This API exposes endpoints to manage donation")
                .contact(myContact);
        return new OpenAPI().info(info).servers(List.of(server));
    }
}
