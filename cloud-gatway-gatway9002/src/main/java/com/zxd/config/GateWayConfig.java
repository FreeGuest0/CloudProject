package com.zxd.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @CLASS_NAME GateWayConfig
 * @CLASS_EXPLAIN 此处填写说明
 * @Author zxd
 * @Date 2021/10/14 上午12:36
 */
@Configuration
public class GateWayConfig {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder){
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        routes.route("springcloud_route" , r-> r.path("/hello").uri("http://localhost:8001/user")).build();
        return routes.build();
    }
}
