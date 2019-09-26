package com.zpark.neimin.first.service;

import com.zpark.neimin.first.common.BaseModelExample;
import com.zpark.neimin.first.dao.SchoolMapper;
import com.zpark.neimin.first.model.School;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolService {
    @Autowired
    SchoolMapper schoolMapper;

    //在service服务中，需要做两件事
    //1. 声明方法（提供给客户（controller）调用）
    public List<School> getSchoolData(BaseModelExample baseModelExample) {
        //2.  让。。。。真正去数据库查询
        return schoolMapper.getSchoolData(baseModelExample);
    }

    public int updateSchool(School schoolInfo) {
        return schoolMapper.updateSchool(schoolInfo);
    }
}























