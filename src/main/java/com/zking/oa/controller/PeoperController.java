package com.zking.oa.controller;

import org.apache.ibatis.annotations.Result;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@Controller
@RequestMapping("/test")
public class PeoperController {

    @RequestMapping("/hello")
    public String helle(String name, HttpServletRequest request) {
//        System.out.println("HelloWorld"+name+"哈哈"+new Date().toLocaleString());
        return "redirect:/test/tomain";
    }
    @RequestMapping("/tomain")
    public String kaix(String name, HttpServletRequest request) {
//        System.out.println("HelloWorld"+name+"哈哈"+new Date().toLocaleString());
        request.setAttribute("mykl","武道");
        return "main";
    }
    @RequestMapping("/toadd") //效果相同
    public String myaddsz(Model model){
//
//        redirectAttributes.addAttribute("skid",15);
//        model.setViewName("redirect:/test/toadd");
        return "index";


    }





    ;

}
