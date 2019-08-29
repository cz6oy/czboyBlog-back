package cn.czboy.service;

import cn.czboy.entity.Article;

import java.util.List;

public interface ArticleService {
    /**获取热度高的前6篇文章*/
    List<Article> queryArticle();
}
