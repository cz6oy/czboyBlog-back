package cn.czboy.mapper;

import cn.czboy.entity.Admin;
import cn.czboy.entity.Menu;
import cn.czboy.entity.dto.ArticleSysDto;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AdminDao {

    /** 查询用户名*/
    Admin findByUserName(@Param("username") String username);

    /** 查询菜单*/
    List<Menu> findMenu();

    List<ArticleSysDto> findArticleSys(@Param("type") String type);
}
