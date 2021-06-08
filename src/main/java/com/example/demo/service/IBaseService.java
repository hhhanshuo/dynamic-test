package com.example.demo.service;

import com.example.demo.entity.VpnTest;
import org.springframework.beans.factory.InitializingBean;

import java.util.List;

public interface IBaseService extends InitializingBean {

    List<Object> invokeStrategy();
}
