package com.zking.oa.controller;

import com.zking.oa.model.Order;
import com.zking.oa.model.Peoper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

@Controller
@RequestMapping("/mytests")
public class AddRedisController {


    @ModelAttribute
    public void init(Model model,HttpServletRequest request){

        model.addAttribute("mykas","oks");
        Order order=new Order();
        model.addAttribute("pks",order);

    }



//    @GetMapping("/gets")
//    @PostMapping("/posts")
//    @RequestMapping(value = "/KPL",method = RequestMethod.GET.POST) //可允许get或post请求
    @RequestMapping("/KPL") //效果相同
    public String myok(ModelAndView model, HttpServletRequest request){
        Object mykas = model.getModelMap().get("mykas");//asMap().get("mykas");

//        System.out.println(request.getAttribute("mykas"));
//        System.out.println(request);lll
//        System.out.println(mykas);

        return "main";


    }

    @RequestMapping("/add") //效果相同
    public ModelAndView myadd(ModelAndView model, HttpServletRequest request, Order order, RedirectAttributes redirectAttributes){
        System.out.println("add");
        System.out.println(order.toString());

        redirectAttributes.addAttribute("skid",15);
        model.setViewName("redirect:/mytests/toadd");
        return model;

    }
    @RequestMapping("/toadd") //效果相同
    public String myaddsz(Model model){
//
//        redirectAttributes.addAttribute("skid",15);
//        model.setViewName("redirect:/test/toadd");
        return "index";
//重定向必须要有init（@ModelAttribute）当前页面，否则表单出错，不匹配

    }



}
