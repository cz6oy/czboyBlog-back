package cn.czboy.controller;

import cn.czboy.entity.Article;
import cn.czboy.mapper.ArticleDao;
import cn.czboy.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
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
        List<Article> articles = articleService.queryArticle();
        return articles;
    }
}