package com.example.demo.controller;

import com.example.demo.config.DownloadBeanFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public List<Object> get(String type){
        return DownloadBeanFactory.getInvokeStrategy(type).invokeStrategy();
    }
}
