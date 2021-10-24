package com.zxd.springcloud;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;


/**
 * @CLASS_NAME PaymentHystrixMain8009
 * @CLASS_EXPLAIN 此处填写说明
 * @Author zxd
 * @Date 2021/9/20 下午3:12
 */
@SpringBootApplication(scanBasePackages = "com.zxd")
@EnableDiscoveryClient
@EnableCircuitBreaker
public class PaymentHystrixMain8009 {
    public static void main(String[] args){
        SpringApplication.run(PaymentHystrixMain8009.class, args);
    }

    @Bean
    public ServletRegistrationBean getServlet(){
        HystrixMetricsStreamServlet streamServlet = new HystrixMetricsStreamServlet();
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(streamServlet);
        registrationBean.setLoadOnStartup(1);
        registrationBean.addUrlMappings("/hystrix.stream");
        registrationBean.setName("HystrixMetricsStreamServlet");
        return registrationBean;
    }
}
