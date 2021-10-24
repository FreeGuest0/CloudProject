package com.zxd.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @CLASS_NAME gatewaymain9002
 * @CLASS_EXPLAIN 此处填写说明
 * @Author zxd
 * @Date 2021/10/10 下午5:11
 */
@SpringBootApplication(scanBasePackages = "com.zxd")
@EnableDiscoveryClient
@EnableEurekaClient
public class  gatewaymain9002 {
    public static void main(String[] args){
        SpringApplication.run(gatewaymain9002.class, args);
    }
}
