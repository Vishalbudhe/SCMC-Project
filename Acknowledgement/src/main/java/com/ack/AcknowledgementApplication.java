package com.ack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class AcknowledgementApplication {

	public static void main(String[] args) {
		SpringApplication.run(AcknowledgementApplication.class, args);
	}

}
