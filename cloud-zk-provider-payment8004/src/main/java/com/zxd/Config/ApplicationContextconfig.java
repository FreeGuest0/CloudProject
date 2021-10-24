package com.zxd.Config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @CLASS_NAME ApplicationContextconfig
 * @CLASS_EXPLAIN 此处填写说明
 * @Author zxd
 * @Date 2021/9/4 下午5:38
 */
@Configuration
public class ApplicationContextconfig {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
