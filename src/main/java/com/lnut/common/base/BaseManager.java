package com.lnut.common.base;

import com.lnut.problem.dao.ProblemMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by L on 16/6/9.
 */

public class BaseManager {
    @Autowired
    protected ProblemMapper problemMapper;//@resource
}
