package cn.czboy.service;

import cn.czboy.entity.Admin;
import cn.czboy.entity.Menu;
import cn.czboy.mapper.AdminDao;
import cn.czboy.entity.dto.ArticleSysDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminDao adminDao;

    @Override
    public int login(String username,String password) {
        Admin admin = null;
        try {
            admin = adminDao.findByUserName(username);
            if (admin.getPassword().equals(password)) {
                return 0;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 1;
    }

    @Override
    public List<Menu> findMenu() {
        List<Menu> menus = null;
        try {
            menus = adminDao.findMenu();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return menus;
    }

    @Override
    public List<ArticleSysDto> findArticleSys(String type) {
        List<ArticleSysDto> articleSys = null;
        try {
            articleSys = adminDao.findArticleSys(type);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return articleSys;
    }

    @Override
    public void addArticle(String title, String coverImg, String content, String type) {

    }
}
