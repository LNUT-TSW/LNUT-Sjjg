package com.lnut.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by L on 16/5/11.
 */
@Controller

public class UserController {



    /**
     * 查找所用用户控制器方法
     * @return
     * @throws Exception
     */
    @RequestMapping("/findUser")
    public ModelAndView findUser()throws Exception{

        ModelAndView modelAndView = new ModelAndView();

        //调用service方法得到用户列表
//        List<User> users = userService.findUser();

//        userService.dataTransfer();



        //将得到的用户列表内容添加到ModelAndView中
//        modelAndView.addObject("users",users);
        //设置响应的jsp视图




        modelAndView.setViewName("findUser");
        //fuck you





        return modelAndView;
    }
}
