package com.thinh.pomodoro_gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PomodoroGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(PomodoroGatewayApplication.class, args);
	}

}
