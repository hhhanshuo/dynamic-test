package com.example.demo.config;

import com.example.demo.service.IBaseService;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class DownloadBeanFactory{

    private static final Map<String, IBaseService> map = new HashMap<>();

    public static IBaseService getInvokeStrategy(String type){
        return map.get(type);
    }

    public static void register(String name, IBaseService iDownloadBaseService){
        map.put(name,iDownloadBaseService);
    }

}
