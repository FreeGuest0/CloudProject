package com.zxd.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * @CLASS_NAME MyCateWayFilter
 * @CLASS_EXPLAIN 此处填写说明
 * @Author zxd
 * @Date 2021/10/16 下午5:09
 */
@Component
@Slf4j
public class MyCateWayFilter implements GlobalFilter, Ordered {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        log.info("********** 进入系统 开始验证过滤 **********");
        String username = exchange.getRequest().getQueryParams().getFirst("username");
        if(null == username){
            log.info("********** 请求用户所需属性为null 非法用户！ **********");
            exchange.getResponse().setStatusCode(HttpStatus.NOT_ACCEPTABLE);
            return exchange.getResponse().setComplete();
        }
        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
