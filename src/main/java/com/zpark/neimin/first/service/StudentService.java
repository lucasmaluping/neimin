package com.zpark.neimin.first.service;

import com.zpark.neimin.first.dao.StudentMapper;
import com.zpark.neimin.first.model.Student;
import com.zpark.neimin.first.model.StudentExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentMapper studentMapper;

    public List<Student> selectByExample(StudentExample studentExample) {
        return studentMapper.selectByExample(studentExample);
    }
}






















