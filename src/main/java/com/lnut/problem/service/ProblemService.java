package com.lnut.problem.service;

import com.lnut.problem.entity.Problem;

import java.util.List;

/**
 * Created by L on 16/6/5.
 */
public interface ProblemService {
    public List<Problem> findProblems() throws Exception;
}
