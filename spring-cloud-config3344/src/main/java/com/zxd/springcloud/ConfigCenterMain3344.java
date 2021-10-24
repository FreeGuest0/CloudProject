package com.zxd.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @CLASS_NAME MainAppConfigCenter3344
 * @CLASS_EXPLAIN 此处填写说明
 * @Author zxd
 * @Date 2021/10/22 上午12:09
 */
@SpringBootApplication(scanBasePackages = "com.zxd")
@EnableConfigServer
public class ConfigCenterMain3344 {
    public static void main(String[] args){
        SpringApplication.run(ConfigCenterMain3344.class, args);
    }
}
