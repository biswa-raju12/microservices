package com.biswapractice.Loans;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
/*@ComponentScans({ @ComponentScan("com.easybank.loans.controller") })
@EnableJpaRepositories("com.easybank.loans.repository")
@EntityScan("com.easybank.loans.model")*/
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
		info = @Info(
				title = "Loans microservice REST API Documentation",
				description = "EazyBank Loans microservice REST API Documentation",
				version = "v1",
				contact = @Contact(
						name = "Biswa Das",
						email = "biswa@easybank.com",
						url = "https://www.easybank.com"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://www.easybank.com"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "EasyBank Loans microservice REST API Documentation",
				url = "https://www.easybank.com/swagger-ui.html"
		)
)
public class LoansApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoansApplication.class, args);
	}
}

