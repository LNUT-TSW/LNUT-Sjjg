package com.lnut.common.base;

import com.lnut.common.redis.RedisUtil;
import com.lnut.problem.dao.ProblemMapper;
import com.lnut.user.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by L on 16/6/5.
 */
public class BaseService {
    @Autowired
    protected UserMapper userMapper;//@resource
    @Autowired
    protected ProblemMapper problemMapper;//@resource

    @Autowired
    protected RedisUtil redisUtil;
}
