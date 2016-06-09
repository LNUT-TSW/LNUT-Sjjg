package com.lnut.common.base;

import com.lnut.problem.service.ProblemService;
import com.lnut.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by L on 16/6/5.
 */
public class BaseController {
    @Autowired
    protected UserService userService;
    @Autowired
    protected ProblemService problemService;
}
