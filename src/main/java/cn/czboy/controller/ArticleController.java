package cn.czboy.controller;

import cn.czboy.entity.Article;
import cn.czboy.mapper.ArticleDao;
import cn.czboy.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 文章管理
 * liuchao
 * 2019-08-29 22:19
 */

@RestController
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public List<Article> queryArticle() {
        List<Article> articles = articleService.listArticle();
        return articles;
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Article queryArticleDetails(@PathVariable("id") String id) {
        Article articles = articleService.getArticleDetails(id);
        return articles;
    }

    @RequestMapping(value = "/type/{type}",method = RequestMethod.GET)
    public List<Article> queryTypeArticle(@PathVariable("type") String type) {
        List<Article> articles = articleService.listTypeArticle(type);
        return articles;
    }
}