package cn.czboy.service;

import cn.czboy.entity.Menu;
import cn.czboy.entity.dto.ArticleSysDto;

import java.util.List;

public interface AdminService {

    /** 查询用户名*/
    int login(String username,String password);

    /** 查询菜单*/
    List<Menu> findMenu();

    /** 根据类别查询后台文章*/
    List<ArticleSysDto> findArticleSys(String type);

}
