package com.zxd.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @CLASS_NAME PaymentMain8001
 * @CLASS_EXPLAIN 此处填写说明
 * @Author zxd
 * @Date 2021/8/25 下午11:19
 */
@MapperScan("com.zxd.Dao")
@EnableEurekaClient
@SpringBootApplication(scanBasePackages = "com.zxd")
public class PaymentMain8003 {
    public static void main(String[] args){
        SpringApplication.run(PaymentMain8003.class, args);
    }
}
