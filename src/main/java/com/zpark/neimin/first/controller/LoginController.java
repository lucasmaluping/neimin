package com.zpark.neimin.first.controller;

import com.zpark.neimin.first.common.BaseResult;
import com.zpark.neimin.first.common.BootstrapTable;
import com.zpark.neimin.first.model.School;
import com.zpark.neimin.first.model.User;
import com.zpark.neimin.first.service.SchoolService;
import com.zpark.neimin.first.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class LoginController {
    @Autowired
    private UserService userService;
    
    @Autowired
    private SchoolService schoolService;

    @RequestMapping("/")
    public String Login(){
        return "login";
    }

    @RequestMapping("/login.json")
    @ResponseBody
    public BaseResult recieveDate(@RequestBody Map<String, Object> loginData) {
//        Map<String, Object> map = new HashMap<>();
//        String loginName = loginData.get("loginName").toString();
//        System.out.println(".......controller");
//        return map;

        BaseResult baseResult = new BaseResult();
        String loginName = loginData.get("loginName").toString();
        String loginPwd = loginData.get("loginPwd").toString();
        if (loginName != null) {

            User user = userService.selByName(loginName);
            System.out.println("....from mysql....." + user);
            if(user.getPassWord().equals(loginPwd)) {
                baseResult.setResultCode("200");
                baseResult.setSuccess(true);
            } else {
                baseResult.setResultCode("500");
                baseResult.setSuccess(false);
            }
        }
        return baseResult;
    }

    @RequestMapping(value = "/index.html")
    public String test() {
        System.out.println("......index");
        return "index";
    }

    @RequestMapping("/table")
    public String table() {
        return "table";
    }

    @RequestMapping("/getData")
    @ResponseBody
    public BootstrapTable getData() {
        //从数据库查数据
        //找service，service这个服务会提供从数据库查询的功能
        List<School> schoolData = schoolService.getSchoolData(null);
        System.out.println("..." + schoolData.size());

        return new BootstrapTable(30, schoolData);
    }
}


















