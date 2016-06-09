package com.lnut.common.manager;

import com.lnut.problem.dao.ProblemMapper;
import com.lnut.problem.entity.Problem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by L on 16/6/9.
 */
@Service
public class ProblemManager{
    private static ProblemManager instance;
    private static HashMap<Integer,Problem> problemMap = null;

    @Autowired
    private ProblemMapper problemMapper;

    private ProblemManager(){
        instance=this;
        problemMap = new HashMap<Integer,Problem>();

    }

    public static ProblemManager getInstance(){
        if(instance==null){
            instance = new ProblemManager();
        }
        return instance;
    }

    public void init() {
        Map<Integer,Problem> tempProblemMap = new HashMap<Integer,Problem>();
        List<Problem> allProblem = problemMapper.selectByExample(null);
        for (Problem problem : allProblem) {
            System.out.println("读取题目id:" + problem.getId());
            tempProblemMap.put(problem.getId(), problem);
        }
        synchronized (problemMap) {
            problemMap.clear();
            problemMap.putAll(tempProblemMap);
        }
    }
}
