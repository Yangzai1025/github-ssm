package com.baizhi.service;

import com.baizhi.entity.User;

import java.util.List;

public interface UserService {

    /**
     * 查询全部数据
     * @return
     */
    public List<User> selectAll();
}
