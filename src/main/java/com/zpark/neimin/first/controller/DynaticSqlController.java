package com.zpark.neimin.first.controller;

import com.zpark.neimin.first.model.DynicUser;
import com.zpark.neimin.first.model.UserVo;
import com.zpark.neimin.first.service.DynicService;
import org.omg.DynamicAny.DynUnion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/dynic")
public class DynaticSqlController {
    @Autowired
    DynicService dynicService;

    @RequestMapping("/")
    @ResponseBody
    public List<DynicUser> dynic() {
        DynicUser dynicUser = new DynicUser();
        dynicUser.setId(1);
        dynicUser.setUsername("jack");
        dynicUser.setSex("nv");

        UserVo userVo = new UserVo();
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        userVo.setIds(integers);

        List<DynicUser> myUser = dynicService.getDynicUser(dynicUser);
        System.out.println("...da...." + myUser.size());
        return myUser;
    }

    @RequestMapping("/selmore")
    @ResponseBody
    public List<DynicUser> selMore() {

        UserVo userVo = new UserVo();
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        userVo.setIds(integers);

        List<DynicUser> myUser = dynicService.selMore(userVo);
        System.out.println("...more...." + myUser.size());
        return myUser;
    }

    @RequestMapping("/update")
    @ResponseBody
    public void updateUser() {
        DynicUser dynicUser = new DynicUser();
        dynicUser.setId(2);
        dynicUser.setSex("nv");
        dynicUser.setUsername("jack2");

        dynicService.updateDynicUser(dynicUser);

    }


}














