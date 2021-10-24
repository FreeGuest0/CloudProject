package com.zxd.springcloud.com.zxd.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @CLASS_NAME ConfigClientController
 * @CLASS_EXPLAIN 此处填写说明
 * @Author zxd
 * @Date 2021/10/24 下午4:16
 */
@RestController
@RequestMapping("/config")
@RefreshScope
public class ConfigClientController {
    @Value("${config.info}")
    private String configInfo ;

    @GetMapping("/getInfo")
    public String getConfigInfo(){
        return configInfo;
    }
}
