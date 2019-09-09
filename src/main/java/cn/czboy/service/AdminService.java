package cn.czboy.service;

import cn.czboy.entity.Admin;
import cn.czboy.entity.Menu;

import java.util.List;

public interface AdminService {

    /** 查询用户名*/
    int login(String username,String password);

    /** 查询菜单*/
    List<Menu> findMenu();
}
