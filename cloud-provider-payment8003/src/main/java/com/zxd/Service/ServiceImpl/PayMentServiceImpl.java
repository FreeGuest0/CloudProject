package com.zxd.Service.ServiceImpl;

import com.zxd.Dao.PayMentDao.PayMentDao;
import com.zxd.Pojo.PayMent;
import com.zxd.Service.PayMentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


/**
 * @CLASS_NAME PayMentServiceImpl
 * @CLASS_EXPLAIN 此处填写说明
 * @Author zxd
 * @Date 2021/8/29 上午1:11
 */
@Service
public class PayMentServiceImpl implements PayMentService {

    @Autowired
    PayMentDao payMentDao;

    @Override
    public PayMent orderGetById(Long id) {
        return payMentDao.orderGetById(id);
    }

    @Override
    public Integer create(PayMent payment) {
        return payMentDao.create(payment);
    }
}
