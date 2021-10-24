package com.zxd.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @CLASS_NAME ConsumerMain8005
 * @CLASS_EXPLAIN 此处填写说明
 * @Author zxd
 * @Date 2021/9/5 下午5:11
 */
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = "com.zxd")
public class ConsumerMain8005 {
    public static void main(String[] args){
        SpringApplication.run(ConsumerMain8005.class, args);
    }
}
