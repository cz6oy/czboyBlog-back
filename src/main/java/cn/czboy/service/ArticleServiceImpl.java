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
    public List<Article> listArticle() {
        List<Article> articles = null;
        try {
            articles = articleDao.listArticle();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return articles;
    }

    @Override
    public Article getArticleDetails(String articleId) {
        Article article = null;
        try {
            article = articleDao.getArticleDetails(articleId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return article;
    }

    @Override
    public List<Article> listTypeArticle(String articleType) {
        List<Article> articles = null;
        try {
            articles =  articleDao.listTypeArticle(articleType);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return articles;
    }
}
