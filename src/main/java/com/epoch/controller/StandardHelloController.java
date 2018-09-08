package com.epoch.controller;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.support.BindingAwareModelMap;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.UUID;


@Controller
@RequestMapping("/standard/hello")
public class StandardHelloController {
    protected final Log logger = LogFactory.getLog(this.getClass());


    @RequestMapping("/index")
    public String index(String name) {
        Model model = new BindingAwareModelMap();
        model.addAttribute("nameUid", UUID.randomUUID().toString());
        return "test";
    }

    @RequestMapping("/indexWithModel")
    public String index(Model model) {
        model.addAttribute("nameUid", UUID.randomUUID().toString());
        logger.info(model.toString());
        return "test";
    }

    @RequestMapping("/indexWithModelAndView")
    public ModelAndView handleRequest() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("nameUid", UUID.randomUUID().toString());
        mv.setViewName("test");
        return mv;
    }


}