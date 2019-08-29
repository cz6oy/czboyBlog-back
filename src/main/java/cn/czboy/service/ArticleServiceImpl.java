package cn.czboy.service;

import cn.czboy.entity.Article;
import cn.czboy.mapper.ArticleDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleDao articleDao;

    @Override
    public List<Article> queryArticle() {
        List<Article> articles = null;
        try{
            articles = articleDao.queryArticle();
        }catch(Exception e){
            e.printStackTrace();
        }
        return articles;
    }
}
