package com.in10s.StudentMgtEureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication 
@EnableEurekaServer
public class StudentMgtEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentMgtEurekaApplication.class, args);
	}

}



