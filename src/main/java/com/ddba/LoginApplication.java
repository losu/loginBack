package com.ddba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
public class LoginApplication {

	
	@Bean
	public WebMvcConfigurer corsConfigure() {
		return new WebMvcConfigurerAdapter() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/login")
				.allowCredentials(true)
				.allowedOrigins("*")
				.allowedMethods("PUT", "POST", "GET", "OPTIONS",
						"DELETE");
			}
		};
	}
	
	
    public static void main(String[] args) {
        SpringApplication.run(LoginApplication.class, args);
    }
}
