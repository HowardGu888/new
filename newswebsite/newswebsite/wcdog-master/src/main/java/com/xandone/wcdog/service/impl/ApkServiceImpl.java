package com.xandone.wcdog.service.impl;

import com.xandone.wcdog.mapper.ApkMapper;
import com.xandone.wcdog.pojo.ApkBean;
import com.xandone.wcdog.service.ApkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ：xandone
 * created on  ：2021/10/26 11:31
 * description：
 */
@Service
public class ApkServiceImpl implements ApkService {
    @Autowired
    ApkMapper apkMapper;

    @Override
    public ApkBean getLastApk() {
        return apkMapper.getLastApk();
    }
}
