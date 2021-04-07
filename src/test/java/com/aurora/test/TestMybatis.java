package com.aurora.test;

import com.aurora.service.impl.UserOnlineTimeServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author Yao
 * @Date 2021/4/7 20:33
 * @Description
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:conf/spring-mvc.xml", "classpath:conf/spring-mybatis.xml"})
public class TestMybatis {
    @Autowired
    UserOnlineTimeServiceImpl userOnlineTimeService;

    @Test
    public void testLastXWeek() {
        userOnlineTimeService.lastXWeekData(1);
    }
}
