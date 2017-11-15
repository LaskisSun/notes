package com.sunhaiyang.controller.viwe;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by SunHaiyang on 2017/11/14.
 */
@Controller
@RequestMapping(value = "/",method = {RequestMethod.GET,RequestMethod.POST})
public class IndexController {

    @RequestMapping(value = {"/index","/","/home"})
    public String toIndex(){
        return "index";
    }
}
