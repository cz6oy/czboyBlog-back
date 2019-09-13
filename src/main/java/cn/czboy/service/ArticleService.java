package cn.czboy.service;

import cn.czboy.entity.Article;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ArticleService {

    /**获取热度高的前6篇文章*/
    List<Article> listArticle();

    /**获取文章详情*/
    Article getArticleDetails(String articleId);

    /**获取指定类别的文章*/
    List<Article> listTypeArticle(String articleType);
}
