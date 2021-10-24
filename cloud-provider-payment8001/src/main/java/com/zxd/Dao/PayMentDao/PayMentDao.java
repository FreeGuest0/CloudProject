package com.zxd.Dao.PayMentDao;

import com.zxd.Pojo.PayMent;
import com.zxd.Pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @CLASS_NAME PayMentDao
 * @CLASS_EXPLAIN 此处填写说明
 * @Author zxd
 * @Date 2021/8/29 上午1:12
 */
@Mapper
public interface PayMentDao {
    public PayMent orderGetById(Long id);
    public Integer create(PayMent payment);
}
