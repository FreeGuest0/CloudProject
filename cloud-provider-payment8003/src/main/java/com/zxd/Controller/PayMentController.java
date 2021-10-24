package com.zxd.Controller;

import com.zxd.Pojo.Commont.CommonResult.CommonResult;
import com.zxd.Pojo.PayMent;
import com.zxd.Service.PayMentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @CLASS_NAME PayMentController
 * @CLASS_EXPLAIN 此处填写说明
 * @Author zxd
 * @Date 2021/9/7 上午12:31
 */
@Slf4j
@RestController
@RequestMapping("/payment")
public class PayMentController {
    @Autowired
    PayMentService payMentService;
    @Autowired
    private DiscoveryClient discoveryClient;
    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/get/{id}")
    public CommonResult test3 (@PathVariable("id") Long id){
        PayMent payMent = payMentService.orderGetById(id);
        log.info("传入id为："+id);
        if(null != payMent){
            return new CommonResult<PayMent>(200, "查询成功！Server为："+serverPort, payMent);
        }else{
            return new CommonResult(444, "查询失败");
        }
    }

    @PostMapping("/create")
    public CommonResult test4(@RequestBody PayMent payMent){
        log.info("传入对象是："+payMent.toString());
        Integer code = payMentService.create(payMent);
        log.info("插入成功。code: "+code+" 回传的id是："+payMent.getId());
        if(0<code){
            return new CommonResult(200, "插入数据成功", code);
        }else{
            return new CommonResult(444, "插入失败");
        }
    }

    @GetMapping("/getServer")
    public Object discovery(){
        List<String> service = discoveryClient.getServices();
        for(String element : service){
            log.info("暴露对象："+element);
        }
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PROVIDER-PAYMENT");
        for(ServiceInstance element : instances){
            log.info("当前 CLOUD-PROVIDER-PAYMENT 下的实例："+ element.getInstanceId());
        }
        return this.discoveryClient;
    }

    @GetMapping("/getPort")
    public String getPort()throws Exception{
        Thread.sleep(3000);
        return serverPort;
    }
}
