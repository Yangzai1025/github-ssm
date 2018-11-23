package com.baizhi.dao;

import com.baizhi.entity.User;

import java.util.List;

public interface UserDao {

    //查询全部数据
    public List<User> selectAll();
}
