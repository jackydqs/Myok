package com.zking.oa.controller;

import com.zking.oa.model.Order;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MyStartController {
    @ModelAttribute
    public void init(Model model, HttpServletRequest request){

        model.addAttribute("mykas","oks");
        Order order=new Order();
        model.addAttribute("pks",order);

    }


    @RequestMapping("/")
    public String init(HttpServletRequest request){
        request.setAttribute("myname","社会");
        return "index";
    }
    @RequestMapping("/toadd") //效果相同
    public String myaddsz(Model model){
//
//        redirectAttributes.addAttribute("skid",15);
//        model.setViewName("redirect:/test/toadd");
        return "index";


    }


}
