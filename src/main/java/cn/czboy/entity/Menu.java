package cn.czboy.entity;

public class Menu {

    /** ID*/
    private String id;

    /** 菜单名称*/
    private String menuName;

    /** 菜单访问路径*/
    private String url;

    /** 菜单icon*/
    private String menuSty;

    public String getMenuSty() {
        return menuSty;
    }

    public void setMenuSty(String menuSty) {
        this.menuSty = menuSty;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "id='" + id + '\'' +
                ", menuName='" + menuName + '\'' +
                ", url='" + url + '\'' +
                ", menuSty='" + menuSty + '\'' +
                '}';
    }
}
