package com.unitbv.iot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.unitbv.iot.model")
public class IoTApp {

	public static void main(String[] args) {
		SpringApplication.run(IoTApp.class, args);
	}

}
