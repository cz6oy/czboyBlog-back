package cn.czboy.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Article {
    /**主键ID*/
    private String id;

    /**文章标题*/
    private String title;

    /**文章封面*/
    private String cover;

    /**文章描述*/
    private String description;

    /**文章内容*/
    private String content;

    /**创建时间*/
    private Date createTime;

    /**热度*/
    private int hotValue;

    /**是否可见  YES-可见，NO-不可见*/
    private String visible;

    /**点赞数*/
    private int star;

    /**文章所属类别*/
    private String classId;

    /**文章标签*/
    private String label;
}
