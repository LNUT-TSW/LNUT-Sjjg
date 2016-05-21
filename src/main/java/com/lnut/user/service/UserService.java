package com.lnut.user.service;

import com.lnut.user.entity.User;

import java.util.List;

/**
 * Created by L on 16/5/11.
 */
public interface UserService {
    /**
     * 查找所有用户
     * @return
     * @throws Exception
     */
    List<User> findUser()throws Exception;



}
