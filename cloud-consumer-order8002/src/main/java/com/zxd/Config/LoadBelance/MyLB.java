package com.zxd.Config.LoadBelance;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @CLASS_NAME MyLB
 * @CLASS_EXPLAIN 此处填写说明
 * @Author zxd
 * @Date 2021/9/12 上午11:21
 */
public interface MyLB {
    public ServiceInstance instance(List<ServiceInstance> instances);
}
