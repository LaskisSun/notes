package com.sunhaiyang.controller.restful;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by SunHaiyang on 2017/11/16.
 */
@RestController
@RequestMapping(value = "/app")
public class TestController {

    @RequestMapping(value = "/info")
    public Object info(){
        Map<String,Object> map = new HashMap<>();
        map.put("info","Hello World.");
        return map;
    }
}
