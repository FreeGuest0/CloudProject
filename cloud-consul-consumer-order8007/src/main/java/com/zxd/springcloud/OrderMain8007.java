package com.zxd.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/**
 * @CLASS_NAME OrderMain8007
 * @CLASS_EXPLAIN 此处填写说明
 * @Author zxd
 * @Date 2021/9/5 下午8:44
 */
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = "com.zxd")
public class OrderMain8007 {
    public static void main(String[] args){
        SpringApplication.run(OrderMain8007.class, args);
    }
}
