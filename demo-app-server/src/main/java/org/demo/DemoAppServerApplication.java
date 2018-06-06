package org.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan({"org.demo"})
@EnableJpaRepositories("org.demo.dao")
@EntityScan("org.demo.model")
public class DemoAppServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoAppServerApplication.class, args);
	}
}
