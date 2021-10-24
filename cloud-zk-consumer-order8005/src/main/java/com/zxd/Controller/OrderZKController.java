package com.zxd.Controller;

import com.zxd.Pojo.Commont.CommonResult.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @CLASS_NAME OrderZKController
 * @CLASS_EXPLAIN 此处填写说明
 * @Author zxd
 * @Date 2021/9/5 下午5:21
 */
@Slf4j
@RestController
@RequestMapping("/zk")
public class OrderZKController {
    private static final String INVOKE_URL = "http://cloud-zk-provider-payment8004";

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/order")
    public CommonResult paymentInfo(){
        return restTemplate.getForObject(INVOKE_URL+"/zk/payment", CommonResult.class);
    }
}
