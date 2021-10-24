package com.zxd.Config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @CLASS_NAME ApplicationContextConfig
 * @CLASS_EXPLAIN 此处填写说明
 * @Author zxd
 * @Date 2021/9/5 下午8:47
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
