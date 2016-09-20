package com.luyuwww.web;

import com.luyuwww.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 公开页面控制器
 */
@Controller
public class WebController {

    @RequestMapping(value = "/")
    public String index() {
//        System.out.println(testService.test());
        return "index";
    }
    @Autowired
    private TestService testService;
}
