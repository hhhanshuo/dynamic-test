package com.example.demo.service;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.config.DownloadBeanFactory;
import com.example.demo.entity.DailyTest;
import com.example.demo.mapper.DailyTestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
@DS(value = "test1")
public class DailyTestServiceImpl extends ServiceImpl<DailyTestMapper, DailyTest> implements DailyTestService {

    @Autowired
    private DailyTestMapper dailyTestMapper;

    @Override
    public List<Object> invokeStrategy() {
        return Collections.singletonList(dailyTestMapper.selectList(new QueryWrapper<>()));
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        DownloadBeanFactory.register("DAILY",this);
    }
}
