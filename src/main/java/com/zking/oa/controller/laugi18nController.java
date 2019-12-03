package com.zking.oa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;
import org.springframework.web.servlet.support.RequestContext;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Locale;

@Controller
@RequestMapping("/laug")
public class laugi18nController {
    @RequestMapping("/mks/{messages}")
    public String mytest(@PathVariable("messages") String messages, HttpSession session, HttpServletRequest request){

        RequestContext requestContext = new RequestContext(request);
        String errorMsg = requestContext.getMessage("username.label");
        if("zh".equals(messages)){
            session.setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME, Locale.CHINA);
        }else{
            session.setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME, Locale.US);

        }
        session.setAttribute("hello",errorMsg);
        return "laug";
    }
}
