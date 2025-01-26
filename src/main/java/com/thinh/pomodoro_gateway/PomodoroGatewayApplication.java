package com.thinh.pomodoro_gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@EnableDiscoveryClient
@Configuration
public class PomodoroGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(PomodoroGatewayApplication.class, args);
	}

//	@Bean
//	public GatewayFilter authenticationFilter() {
//		return new AuthenticationFilter();
//	}

}
