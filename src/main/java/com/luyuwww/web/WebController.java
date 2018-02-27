package com.luyuwww.web;

import com.luyuwww.entity.TestA;
import com.luyuwww.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * 公开页面控制器
 */
@Controller
public class WebController {

    @RequestMapping(value = "/")
    public String index( Model model) {
        model.addAttribute("testa" , testService.listAll());
        return "index";
    }

    /**
     * 测试分页
     * http://localhost:8080/dfile?page=1&size=18&sort=syscode
     * @param pageable
     * @param model
     * @return
     */
    @RequestMapping(value = "/dfile")
    public String dfile(Pageable pageable , Model model) {
        model.addAttribute("dfileList" , testService.ListDfile2(pageable));
        return "dfileList";
    }


    @RequestMapping(value = "xl/list/data", method = RequestMethod.POST)
    @ResponseBody
    public Page<TestA> search(Pageable pageable , Model model){
        return null;
    }

    @Autowired
    private TestService testService;
}
