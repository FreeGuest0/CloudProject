package com.zxd.Controller;

import com.zxd.Config.LoadBelance.MyLB;
import com.zxd.Pojo.Commont.CommonResult.CommonResult;
import com.zxd.Pojo.PayMent;
import com.zxd.Pojo.Test;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @CLASS_NAME OrderController
 * @CLASS_EXPLAIN 此处填写说明
 * @Author zxd
 * @Date 2021/8/29 上午1:56
 */
@Slf4j
@RestController
@RequestMapping("order")
public class OrderController {

//    public static final String PAYMENT_URL = "http://localhost:8001";
    public static final String PAYMENT_URL = "http://CLOUD-PROVIDER-PAYMENT";
    @Autowired
    MyLB myLB;
    @Autowired
    DiscoveryClient discoveryClient;


    @Autowired
    RestTemplate restTemplate;

    @GetMapping(value = "/get/{id}", produces = {"application/json;charset=UTF-8"})
    public CommonResult<PayMent> test(@PathVariable("id") Long id){
        Test test = new Test(2l,"zzz");
        log.info(test.toString());
        return restTemplate.getForObject(PAYMENT_URL+"/payment/get/"+id, CommonResult.class);
    }
    @GetMapping(value = "/create",produces = {"application/json;charset=UTF-8"})
    public CommonResult<PayMent> test2(@RequestBody PayMent payMent){
        return restTemplate.postForObject(PAYMENT_URL+"payment/create", payMent, CommonResult.class);
    }
    @GetMapping("/getServerPort")
    public String getServerPort(){
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PROVIDER-PAYMENT");
        if(null == instances || 0 == instances.size()){
            return null;
        }
        ServiceInstance serviceInstance = myLB.instance(instances);
        return restTemplate.getForObject(serviceInstance.getUri()+"/payment/getPort", String.class);
    }
}
