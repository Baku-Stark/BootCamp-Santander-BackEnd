package com.springboot_mysql.todo_list;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(
		title="DIO Project",
		version = "2024.07",
		description = "DIO Project",
		termsOfService = "runcode",
		contact = @Contact(
				name = "Baku-Stark",
				email = "https://github.com/Baku-Stark"
		),
		license = @License(
				name = "license",
				url = "runcodenow"
		)
))
public class TodoListApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodoListApplication.class, args);
	}

}
