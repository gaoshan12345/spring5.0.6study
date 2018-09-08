package com.epoch.controller;

import com.epoch.entity.User;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.UUID;


@RestController
@RequestMapping("/rest/hello")
public class RestHelloController {
    protected final Log logger = LogFactory.getLog(this.getClass());
    @RequestMapping(value = "/index3",produces = "application/json")
    public User index3(@RequestBody User user){
        logger.info("index3");
        System.out.println("index3 = " + user.getName());
        User result = new User("wangwenlong + index3",37);
        return result;
    }

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



    @RequestMapping("/helloResponseBody")
    @ResponseBody
    public String helloResponseBody(){
        HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
        logger.info("request = " + request);
        return UUID.randomUUID().toString();
    }

    @RequestMapping("/helloResponseDefault")
    public String helloResponseDefault(){
        logger.info("helloVoid");
        System.out.println("helloVoid ");
        return UUID.randomUUID().toString();
    }
}