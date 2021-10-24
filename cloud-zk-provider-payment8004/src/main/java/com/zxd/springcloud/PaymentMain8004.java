package com.zxd.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @CLASS_NAME PaymentMain8004
 * @CLASS_EXPLAIN 此处填写说明
 * @Author zxd
 * @Date 2021/9/4 下午5:29
 */
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = "com.zxd")
public class PaymentMain8004 {
    public static void main(String[] args){
        SpringApplication.run(PaymentMain8004.class, args);
    }
}
