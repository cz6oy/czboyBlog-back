package cn.czboy.service;

import cn.czboy.entity.Admin;
import cn.czboy.entity.Article;
import cn.czboy.entity.Menu;
import cn.czboy.mapper.AdminDao;
import cn.czboy.entity.dto.ArticleSysDto;
import cn.czboy.mapper.ArticleDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminDao adminDao;
    @Autowired
    private ArticleDao articleDao;

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
    public void addArticle(String title,String content,String classId,String describe) {
        Article article = new Article();
        article.setTitle(title);
        article.setHotValue(0);
        article.setStar(0);
        article.setVisible("YES");
        article.setContent(content);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = sdf.format(new Date());
        article.setCreateTime(date);
        article.setId(UUID.randomUUID().toString());
        article.setDescription(content.substring(0,content.length()));
        article.setClassId(classId);
        article.setDescription(describe);
        articleDao.addArticle(article);
    }
}
