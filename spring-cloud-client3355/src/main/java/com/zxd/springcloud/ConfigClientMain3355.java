package com.zxd.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @CLASS_NAME ConfigClientMain3355
 * @CLASS_EXPLAIN 此处填写说明
 * @Author zxd
 * @Date 2021/10/24 下午4:13
 */
@SpringBootApplication(scanBasePackages = "com.zxd")
@EnableDiscoveryClient
public class ConfigClientMain3355 {
    public static void main(String[] args){
        SpringApplication.run(ConfigClientMain3355.class, args);
    }
}
