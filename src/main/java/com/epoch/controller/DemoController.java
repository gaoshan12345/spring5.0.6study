package com.epoch.controller;

import com.epoch.entity.User;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/demo")
public class DemoController {
    protected final Log logger = LogFactory.getLog(this.getClass());

    @RequestMapping("/index")
    public String index(){
        return "test";
    }

    @RequestMapping("/index2")
    public User index2(){
        logger.info("index2");
        System.out.println("index2 ");
        return new User("wangwenlong",37);
    }

    @RequestMapping(value = "/index3",produces = "application/json")
    //@RequestMapping(value = "/index3")
    //@RequestMapping(value = "/transfer", method=RequestMethod.POST)
    public User index3(@RequestBody User user){
        logger.info("index3");
        System.out.println("index3 = " + user.getName());
        User result = new User("wangwenlong + index3",37);
        return result;
    }


}