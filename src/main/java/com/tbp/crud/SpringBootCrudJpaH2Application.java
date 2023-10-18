package com.tbp.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.demo.*", "com.tbp.crud.*"})
@EntityScan(basePackages= {"com.example.demo.*","com.tbp.crud.*"})
@EnableJpaRepositories(basePackages = {"com.example.demo.*","com.tbp.crud.*"})
public class SpringBootCrudJpaH2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCrudJpaH2Application.class, args);
	}

}
