package com.zxd.Controller;

import com.zxd.Service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @CLASS_NAME PaymentController
 * @CLASS_EXPLAIN 此处填写说明
 * @Author zxd
 * @Date 2021/9/20 下午3:24
 */
@Slf4j
@RestController
@RequestMapping("/Hystrix")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @Value("${server.port}")
    private String port;

    @GetMapping("/payment/ok/{id}")
    public String paymentInfo_ok(@PathVariable("id") Integer id){
        String result = paymentService.paymentInfo_ok(id);
        log.info("********result "+result);
        return result;
    }

    @GetMapping("/payment/timeout/{id}")
    public String paymentInfo_out(@PathVariable("id") Integer id){
        String result = paymentService.paymentInfo_timeout(id);
        log.info("********result "+result);
        return result;
    }

    @GetMapping("/payment/test/{id}")
    public String test(@PathVariable("id") Integer id){
        return paymentService.paymentCircuitBreaker(id);
    }
}
