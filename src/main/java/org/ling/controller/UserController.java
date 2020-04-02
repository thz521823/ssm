package org.ling.controller;

import org.ling.config.MyErrorPage;
import org.ling.pojo.po.User;
import org.ling.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;


@Controller
public class UserController {
    private Logger logger = LoggerFactory.getLogger(UserController.class);
    @Autowired
    IUserService iUserService;
    @RequestMapping("/add")
    public String getAdd( User user){
        int num =iUserService.addUser(user);
        return "hello";
    }
    @RequestMapping("/hello")
    public String getHello(Integer aa) throws MyErrorPage {

        if(aa==1){
            throw new MyErrorPage();
        }
        logger.error("日志测试！");

        return "hello";
    }
    @RequestMapping(value = "/upload",produces = "application/json;charset=utf-8")
    public String getUpload(@RequestParam("files") MultipartFile files, HttpServletRequest request) throws IOException {
        HttpSession session = request.getSession();
        String url = session.getServletContext().getRealPath("/img/");

        String fileName =files.getOriginalFilename();
        File file1 = new File(url+fileName);
        files.transferTo(file1);

        return null;
    }
}
