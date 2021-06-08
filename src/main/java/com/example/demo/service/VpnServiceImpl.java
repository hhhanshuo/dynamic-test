package com.example.demo.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.config.DownloadBeanFactory;
import com.example.demo.entity.VpnTest;
import com.example.demo.mapper.VpnMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class VpnServiceImpl extends ServiceImpl<VpnMapper, VpnTest> implements VpnService {

    @Autowired
    private VpnMapper vpnMapper;

    @Override
    public List<Object> invokeStrategy() {
        return Collections.singletonList(vpnMapper.selectList(new QueryWrapper<>()));
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        DownloadBeanFactory.register("VPN",this);
    }
}
