package com.zxd.Controller;

import com.zxd.Pojo.Commont.CommonResult.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @CLASS_NAME OrderController
 * @CLASS_EXPLAIN 此处填写说明
 * @Author zxd
 * @Date 2021/9/5 下午8:48
 */
@RestController
@RequestMapping("/consul")
public class OrderController {

    public static final String INVOKE_URL = "http://cloud-consul-provider-payment8006";

    @Autowired
    RestTemplate restTemplate;


    @GetMapping("/order")
    public CommonResult oreder(){
        return restTemplate.getForObject(INVOKE_URL+"/consul/payment", CommonResult.class);
    }
}
