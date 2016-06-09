package com.lnut.problem.service;

import com.lnut.common.base.BaseService;
import com.lnut.problem.entity.Problem;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by L on 16/6/5.
 */
@Service
public class ProblemServiceImpl extends BaseService implements ProblemService {
    public List<Problem> findProblems() throws Exception {
        System.out.println("loading problems...");
        //调用mapper类中的selectByExample方法，如果传入类型为null，则表示无条件查找
        List<Problem> problems = problemMapper.selectByExample(null);
        return problems;
    }
}
