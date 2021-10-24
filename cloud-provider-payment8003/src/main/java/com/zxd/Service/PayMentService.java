package com.zxd.Service;

import com.zxd.Pojo.PayMent;
import com.zxd.Pojo.User;

/**
 * @CLASS_NAME PayMentService
 * @CLASS_EXPLAIN 此处填写说明
 * @Author zxd
 * @Date 2021/8/29 上午1:09
 */
public interface PayMentService {
    public PayMent orderGetById(Long id);
    public Integer create(PayMent payment);
}
