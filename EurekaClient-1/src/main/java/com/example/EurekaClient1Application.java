package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@EnableEurekaClient
public class EurekaClient1Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClient1Application.class, args);
	}

}
