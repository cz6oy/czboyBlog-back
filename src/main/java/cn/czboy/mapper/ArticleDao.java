package cn.czboy.mapper;

import cn.czboy.entity.Article;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ArticleDao {
    /**初始化热点前6的文章*/
    List<Article> listArticle();

    /**获取文章详情*/
    Article getArticleDetails(@Param("id") String articleId);

    /**获取指定类别的文章*/
    List<Article> listTypeArticle(@Param("classId") String articleType);
}
