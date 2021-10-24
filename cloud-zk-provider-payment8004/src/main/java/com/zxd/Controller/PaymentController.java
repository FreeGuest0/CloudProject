package com.zxd.Controller;

import com.zxd.Pojo.Commont.CommonResult.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @CLASS_NAME PaymentController
 * @CLASS_EXPLAIN 此处填写说明
 * @Author zxd
 * @Date 2021/9/4 下午5:35
 */
@Slf4j
@RestController
@RequestMapping("/zk")
public class PaymentController {

    @Value("${server.port}")
    private String serverport;

    @GetMapping("/payment")
    public CommonResult Payment(){
        String Message = "springcloud with zookeeper: "+serverport+"\t"+ UUID.randomUUID().toString();
        return new CommonResult(200, Message);
    }
}
