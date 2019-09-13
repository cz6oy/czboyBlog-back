package cn.czboy.entity.dto;


import org.springframework.stereotype.Component;

/***
 * 后台获取文章管理  实体类
 */
@Component
public class ArticleSysDto {

    /** 文章ID*/
    private String id;

    /** 所属类别*/
    private String classname;

    /** 文章标题*/
    private String title;

    /** 创建时间*/
    private String createtime;

    /** 热度*/
    private String hotvalue;

    /** 是否可见*/
    private String visible;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public String getHotvalue() {
        return hotvalue;
    }

    public void setHotvalue(String hotvalue) {
        this.hotvalue = hotvalue;
    }

    public String getVisible() {
        return visible;
    }

    public void setVisible(String visible) {
        this.visible = visible;
    }

    @Override
    public String toString() {
        return "ArticleSysDto{" +
                "id='" + id + '\'' +
                ", classname='" + classname + '\'' +
                ", title='" + title + '\'' +
                ", createtime='" + createtime + '\'' +
                ", hotvalue='" + hotvalue + '\'' +
                ", visible='" + visible + '\'' +
                '}';
    }
}
