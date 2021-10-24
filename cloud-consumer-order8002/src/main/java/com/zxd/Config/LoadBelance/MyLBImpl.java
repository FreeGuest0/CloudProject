package com.zxd.Config.LoadBelance;

import com.MyRule.MyRule;
import com.sun.org.apache.regexp.internal.RE;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @CLASS_NAME MyLBImp
 * @CLASS_EXPLAIN 此处填写说明
 * @Author zxd
 * @Date 2021/9/12 上午11:22
 */
@Slf4j
@Service
public class MyLBImpl implements MyLB {

    private AtomicInteger atomicInteger = new AtomicInteger(0);

    public final int getAndIncrement(){

        int current, next;
        do{
            current = this.atomicInteger.get();
            next = current >= 10 ? 0 : current+1;
        }while(this.atomicInteger.compareAndSet(current, next));
        log.info("访问次数为："+next);
        return next;
    }

    @Override
    public ServiceInstance instance(List<ServiceInstance> instances) {
        int index = getAndIncrement()%instances.size();
        log.info(getAndIncrement()+" % "+instances.size()+" = "+index);
        return instances.get(index);
    }

}
