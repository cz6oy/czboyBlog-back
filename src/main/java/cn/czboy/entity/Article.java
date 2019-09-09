package cn.czboy.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


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

    @JsonFormat(pattern="yyyy-MM-dd HH:mm")
    private Date createTime;

    /**热度*/
    private int hotValue;

    /**是否可见  YES-可见，NO-不可见*/
    private String visible;

    /**点赞数*/
    private int star;

    /**文章所属类别 1-java，2-web前端，3-python，4-大数据*/
    private String classId;

    /**文章标签*/
    private String label;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public int getHotValue() {
        return hotValue;
    }

    public void setHotValue(int hotValue) {
        this.hotValue = hotValue;
    }

    public String getVisible() {
        return visible;
    }

    public void setVisible(String visible) {
        this.visible = visible;
    }

    public int getStar() {
        return star;
    }

    public void setStar(int star) {
        this.star = star;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", cover='" + cover + '\'' +
                ", description='" + description + '\'' +
                ", content='" + content + '\'' +
                ", createTime=" + createTime +
                ", hotValue=" + hotValue +
                ", visible='" + visible + '\'' +
                ", star=" + star +
                ", classId='" + classId + '\'' +
                ", label='" + label + '\'' +
                '}';
    }
}
