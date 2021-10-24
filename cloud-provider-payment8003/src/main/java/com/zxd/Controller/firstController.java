package com.zxd.Controller;

import com.zxd.Pojo.Commont.CommonResult.CommonResult;
import com.zxd.Pojo.User;
import com.zxd.Service.UserInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @CLASS_NAME firstController
 * @CLASS_EXPLAIN 此处填写说明
 * @Author zxd
 * @Date 2021/8/26 下午10:47
 */
@Slf4j
@RestController
@RequestMapping("/user")
public class firstController {

    @Autowired
    UserInfoService userInfoService;

    @GetMapping("hello/{id}")
    public String test(@PathVariable("id")Integer id){
        return "Hello World! "+ id;
    }

    @PostMapping("postH/{id}")
    public String test2(@PathVariable("id")Integer id){
        User user = new User(1l, "wzt", "123", 20);
        return "Fuck!" +id+"  "+user.toString();
    }

    @GetMapping("/get/{id}")
    public CommonResult test3 (@PathVariable("id") Long id){
        User user = userInfoService.getuserById(id);
        log.info("传入id为："+id);
        if(null != user){
            return new CommonResult<User>(200, "查询成功！", user);
        }else{
            return new CommonResult(444, "查询失败");
        }
    }

    @PostMapping("/add")
    public CommonResult test4(@RequestBody User user){
        log.info("传入对象是："+user.toString());
        Integer code = userInfoService.addUserInfo(user);
        log.info("插入成功。code: "+code+" 回传的id是："+user.getId());
        if(0<code){
            return new CommonResult(200, "插入数据成功", code);
        }else{
            return new CommonResult(444, "插入失败");
        }
    }
}
