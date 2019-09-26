package com.zpark.neimin.first.controller;

import com.zpark.neimin.first.model.Student;
import com.zpark.neimin.first.model.StudentExample;
import com.zpark.neimin.first.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentService studentService;

    @RequestMapping("/example")
    @ResponseBody
    public List<Student> example() {
        //    SELECT * FROM frame.student where sex = '女' order by id desc
        StudentExample studentExample = new StudentExample();
        //根据id  降序排列
        studentExample.setOrderByClause("id desc");

        StudentExample.Criteria criteria = studentExample.createCriteria();
        criteria.andSexEqualTo("女");
//        criteria.andRealNameEqualTo()

        List<Student> students = studentService.selectByExample(studentExample);
        return students;
    }
}



















