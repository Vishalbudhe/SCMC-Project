package com.ack.business;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class AckBusinessServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AckBusinessServiceApplication.class, args);
	}

}
