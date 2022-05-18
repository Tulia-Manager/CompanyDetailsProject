package com.abhi;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringSchedulingProj2SchedulingInSpringBootApplication {

	public static void main(String[] args) {
		System.out.println("Application starts"+new Date());
		SpringApplication.run(SpringSchedulingProj2SchedulingInSpringBootApplication.class, args);
		System.out.println("Application ends");
	}

}
