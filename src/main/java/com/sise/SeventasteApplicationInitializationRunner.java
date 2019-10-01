package com.sise;

import com.sise.utils.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @program: QIWEI->QIWEIApplicationRunner
 * @author: ZJ
 * @create: 2019-10-01 08:40
 * @description:
 **/
@Component
@Order(1)
public class SeventasteApplicationInitializationRunner implements ApplicationRunner {

    @Autowired
    private RedisUtil redisUtil;

    /**
     * 系统初始化将将Mysql数据导入到Redis
     * */
    @Override
    public void run(ApplicationArguments args) throws Exception {

    }
}
