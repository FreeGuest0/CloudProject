package com.zxd.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @CLASS_NAME EurekaMain
 * @CLASS_EXPLAIN 此处填写说明
 * @Author zxd
 * @Date 2021/8/29 下午5:47
 */
@EnableEurekaServer
@SpringBootApplication(scanBasePackages = "com.zxd")
public class EurekaMain7001 {
    public static void main(String[] args){
        SpringApplication.run(EurekaMain7001.class, args);
    }
}
