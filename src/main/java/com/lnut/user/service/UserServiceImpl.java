package com.lnut.user.service;

import com.lnut.common.base.BaseService;
import com.lnut.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by L on 16/5/11.
 */
@Service
public class UserServiceImpl extends BaseService implements UserService {

    public List<User> findUser() throws Exception {
        System.out.println("init finish");
        redisUtil.hset("Test","TestByLzj","Sjjg",50);
        //调用mapper类中的selectByExample方法，如果传入类型为null，则表示无条件查找
        List<User> users = userMapper.selectByExample(null);
        return users;
    }

    public void addUser(User user) throws Exception {
        this.userMapper.insert(user);
    }

    public void delUser(User user) throws Exception {
        this.userMapper.deleteByPrimaryKey(user.getId());
    }

    public User findUserById(int id) {
        return this.userMapper.selectByPrimaryKey(id);
    }

    public void addUserBatch(List<User> users) {

    }

}
