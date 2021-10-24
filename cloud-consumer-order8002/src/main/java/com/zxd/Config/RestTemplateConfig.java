package com.zxd.Config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @CLASS_NAME RestTemplateConfig
 * @CLASS_EXPLAIN 此处填写说明
 * @Author zxd
 * @Date 2021/8/29 上午1:54
 */
@Configuration
public class RestTemplateConfig {

    @Bean
//    @LoadBalanced //开启访问端负载均衡
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
