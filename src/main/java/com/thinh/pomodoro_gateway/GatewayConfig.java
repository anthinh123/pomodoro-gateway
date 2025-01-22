package com.thinh.pomodoro_gateway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

    @Autowired
    AuthenticationFilter filter;

    @Bean
    public RouteLocator routes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("timemanagementservice", r -> r.path("/api/workdays/**")
                        .filters(f -> f.filter(filter))
                        .uri("lb://timemanagementservice"))

                .route("useridentityservice", r -> r.path("/api/v1/auth/**")
                        .uri("lb://useridentityservice"))
                .build();
    }

}
