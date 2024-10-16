package com.ust.Emp_info;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class EmpInfoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpInfoApplication.class, args);
	}

}
