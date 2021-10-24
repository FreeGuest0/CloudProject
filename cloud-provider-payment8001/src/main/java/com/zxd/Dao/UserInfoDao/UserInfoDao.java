package com.zxd.Dao.UserInfoDao;

import com.zxd.Pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @CLASS_NAME UserinfoDao
 * @CLASS_EXPLAIN 此处填写说明
 * @Author zxd
 * @Date 2021/8/27 下午9:02
 */

public interface UserInfoDao {
   public User getUserById(@Param("id")Long Id);
   public Integer addUserIndo(User user);
}
