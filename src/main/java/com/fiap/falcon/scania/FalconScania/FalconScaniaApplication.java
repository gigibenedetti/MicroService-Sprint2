package com.fiap.falcon.scania.FalconScania;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.fiap.falcon.scania.FalconScania.controllers, com.fiap.falcon.scania.FalconScania.config"})

public class FalconScaniaApplication {

	public static void main(String[] args) {
		SpringApplication.run(FalconScaniaApplication.class, args);
	}

}
