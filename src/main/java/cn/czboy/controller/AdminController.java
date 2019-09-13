package cn.czboy.controller;

import cn.czboy.entity.Menu;
import cn.czboy.entity.dto.ArticleSysDto;
import cn.czboy.service.AdminService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(value = "/index")
    public String queryMenu(Model model, String type) {
        List<Menu> menus = adminService.findMenu();
        log.info("--------index--------------：{}", menus);
        model.addAttribute("menus", menus);
        return "forward:/views/index.jsp";
    }

    @RequestMapping(value = "/article",method = RequestMethod.POST)
    public @ResponseBody List<ArticleSysDto> queryArticleSys(String type){
        List<ArticleSysDto> articleSys = adminService.findArticleSys(type);
        log.info("----------article---------------：{}",articleSys);
        return articleSys;
    }
}
