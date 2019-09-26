package com.zpark.neimin.first.service;

import com.zpark.neimin.first.dao.DynicMapper;
import com.zpark.neimin.first.model.DynicUser;
import com.zpark.neimin.first.model.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DynicService {
    @Autowired
    DynicMapper dynicMapper;

    public List<DynicUser> getDynicUser(DynicUser dynicUser) {
        return dynicMapper.getDyicUser(dynicUser);
    }

    public List<DynicUser> selMore(UserVo userVo) {
        return dynicMapper.selMore(userVo);
    }

    public void updateDynicUser(DynicUser dynicUser) {
        dynicMapper.updateDynicUser(dynicUser);
    }
}

















