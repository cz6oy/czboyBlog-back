package cn.czboy.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户管理
 * liuchao
 * 2019-08-29 22:19
 */

@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping(value = "/",method = RequestMethod.POST)
    public void login(String username,String password) {
        System.out.println(username);
    }
}
