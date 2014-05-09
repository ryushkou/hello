package com.ry.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
public class HelloServlet {

    public HelloServlet() {

    }

    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public ModelAndView hello(@RequestParam Map params) {
        Map attr = new HashMap();
        attr.put("attr", params);
        attr.put("version", "3");
        return new ModelAndView("hello", attr);
    }
}
