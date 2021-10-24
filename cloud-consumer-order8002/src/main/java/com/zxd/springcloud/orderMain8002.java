package com.zxd.springcloud;

import com.MyRule.MyRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @CLASS_NAME orderMain8002
 * @CLASS_EXPLAIN 此处填写说明
 * @Author zxd
 * @Date 2021/8/29 上午2:05
 */
@EnableEurekaClient
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = "com.zxd")
//@RibbonClient(name = "CLOUD-PROVIDER-PAYMENT", configuration = MyRule.class)
public class orderMain8002 {
    public static void main(String[] args){
        SpringApplication.run(orderMain8002.class, args);
    }
}
