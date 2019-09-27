package cn.czboy.controller;

import cn.czboy.entity.Article;
import cn.czboy.entity.Menu;
import cn.czboy.entity.dto.ArticleSysDto;
import cn.czboy.service.AdminService;
import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;


@Controller
@RequestMapping("/sys")
public class AdminController {

    private static Logger log = LoggerFactory.getLogger(AdminController.class);

    @Autowired
    private AdminService adminService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(String username, String password) {
        int result = adminService.login(username, password);
        if (result == 0) {
            return "redirect:/sys/index";
        }
        return "redirect:/error.jsp";
    }

    /** 跳转到主页*/
    @RequestMapping(value = "/index")
    public String queryMenu(Model model, String type) {
        List<Menu> menus = adminService.findMenu();
        log.info("--------index--------------：{}", menus);
        model.addAttribute("menus", menus);
        return "forward:/views/index.jsp";
    }

    /** 查询文章*/
    @RequestMapping(value = "/article",method = RequestMethod.POST)
    public @ResponseBody List<ArticleSysDto> queryArticleSys(String type) {
        List<ArticleSysDto> articleSys = adminService.findArticleSys(type);
        log.info("----------article---------------：{}",articleSys);
        return articleSys;
    }

    /** 添加文章上传的图片*/
    @RequestMapping(value = "/addArticleImage",method = RequestMethod.POST)
    @ResponseBody
    public JSONObject addArticleImage(@RequestParam(value = "editormd-image-file",required = true) MultipartFile file, HttpServletRequest request, HttpServletResponse response) {
        String fileName = file.getOriginalFilename();
        System.out.println("---------------"+fileName);
        JSONObject res = new JSONObject();
        res.put("url", fileName);
        res.put("success", 1);
        res.put("message", "upload success!");
        return res;
    }

    /** 添加文章*/
    @RequestMapping(value = "/addArticle",method = RequestMethod.POST)
    public void addArticle(String title, String cover, MultipartFile upload,String content,String type) {
        System.out.println(upload);
        System.out.println(content);

//        adminService.addArticle(title,cover,content,type);
    }
}
