/**
 * 元年软件
 *
 * @author 王文龙
 * @date 2018/8/17 16:35
 * @version V1.0
 */
package com.epoch.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.UUID;

/**
 * <类描述>
 * @author 王文龙
 * @date 2018/8/17 16:35
 * @version V1.0
 */
//public class SimpleUrlHandlerMappingController implements Controller {
public class SimpleUrlHandlerMappingController implements Controller {
//public class SimpleUrlHandlerMappingController{
    protected final Log logger = LogFactory.getLog(this.getClass());
    //@Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        logger.info("run here");
        ModelAndView mv = new ModelAndView();
        mv.addObject("nameUid",UUID.randomUUID().toString());
        mv.setViewName("test");
        return mv;
    }
}
