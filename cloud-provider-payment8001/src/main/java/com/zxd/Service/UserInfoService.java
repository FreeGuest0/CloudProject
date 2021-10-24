package com.zxd.Service;

import com.zxd.Pojo.User;

/**
 * @CLASS_NAME UserInfoService
 * @CLASS_EXPLAIN 此处填写说明
 * @Author zxd
 * @Date 2021/8/27 下午10:37
 */
public interface UserInfoService {
    public User getuserById(Long id);
    public Integer addUserInfo(User user);
}
