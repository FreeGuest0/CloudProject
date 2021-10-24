package com.zxd.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @CLASS_NAME PaymentMain8001
 * @CLASS_EXPLAIN 此处填写说明
 * @Author zxd
 * @Date 2021/8/25 下午11:19
 */
@EnableEurekaClient
@EnableDiscoveryClient
@MapperScan("com.zxd.Dao")
@SpringBootApplication(scanBasePackages = "com.zxd")
public class PaymentMain8001 {
    public static void main(String[] args){
        SpringApplication.run(PaymentMain8001.class, args);
    }
}
