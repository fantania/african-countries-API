package com.fantania.africanCountriesAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.fantania.africanCountriesAPI")
public class AfricanCountriesApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AfricanCountriesApiApplication.class, args);
	}

}
