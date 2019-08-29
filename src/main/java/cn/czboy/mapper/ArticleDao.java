package cn.czboy.mapper;

import cn.czboy.entity.Article;

import java.util.List;

public interface ArticleDao {
    List<Article> queryArticle();
}
