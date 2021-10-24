package com.zxd.Dao.PayMentDao;

import com.zxd.Pojo.PayMent;

/**
 * @CLASS_NAME PayMentDao
 * @CLASS_EXPLAIN 此处填写说明
 * @Author zxd
 * @Date 2021/8/29 上午1:12
 */
public interface PayMentDao {
    public PayMent orderGetById(Long id);
    public Integer create(PayMent payment);
}
