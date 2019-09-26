package com.zpark.neimin.first.dao;

import com.zpark.neimin.first.model.DynicUser;
import com.zpark.neimin.first.model.UserVo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DynicMapper {
    List<DynicUser> getDyicUser(DynicUser dynicUser);

    void updateDynicUser(DynicUser dynicUser);

    List<DynicUser> selMore(UserVo userVo);
}
