package com.transport.user.web.user;

import com.transport.user.pojo.vo.ResultData;
import com.transport.user.web.BaseController;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@RestController
public class UserController extends BaseController{

    @GetMapping("/user/login")
    public ResultData login(@RequestParam(value = "username", required = false) String username, @RequestParam(value = "password", required = false) String password) {
        log.info("输入的用户信息：username:{}, password:{}", username, password);
        Map<String,String> map =new HashMap<String,String>();
        map.put("token", "token123");
        ResultData resultData = ResultData.succ(map);
        return resultData;
    }

    @GetMapping("/info")
    public ResultData userInfo(@RequestParam("token") String token) {
        log.info("传入的token:{}", token);
        String[] roles = new String[]{"123","456"};
        Map<String, Object> userInfo = new HashMap<String, Object>();
        userInfo.put("name", "admin");
        userInfo.put("avatar","admin");
        userInfo.put("roles",roles);
        ResultData resultData = ResultData.succ(userInfo);
        return resultData;
    }
}
