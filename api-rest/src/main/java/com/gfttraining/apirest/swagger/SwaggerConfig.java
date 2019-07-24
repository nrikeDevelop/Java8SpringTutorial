package com.gfttraining.apirest.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
private static final Contact CONTACT = new Contact("a_name",
		"web",
		"contact");

private static final ApiInfo MY_API_INFO = 
new ApiInfo("My awesome ",
		"Information Api",
		"Creado por Nrike",
		"Descriptive text",
		CONTACT,"other Descriptive text","other Descriptive text");
@Bean
public Docket api() {
	return new Docket(DocumentationType.SWAGGER_2).apiInfo(MY_API_INFO);
}


}
