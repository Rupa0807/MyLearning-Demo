package com.rupa.RestJpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication @EntityScan("com.rupa.RestJpa.Entity")
public class RestJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestJpaApplication.class, args);
	}

}
