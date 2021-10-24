package com.zxd.Service.ServiceImpl;

import com.zxd.Dao.UserInfoDao.UserInfoDao;
import com.zxd.Pojo.User;
import com.zxd.Service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @CLASS_NAME UserInfoServiceImpl
 * @CLASS_EXPLAIN 此处填写说明
 * @Author zxd
 * @Date 2021/8/27 下午10:39
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    UserInfoDao userInfoDao;

    @Override
    public User getuserById(Long id) {
        return userInfoDao.getUserById(id);
    }

    @Override
    public Integer addUserInfo(User user) {
        return userInfoDao.addUserIndo(user);
    }
}
