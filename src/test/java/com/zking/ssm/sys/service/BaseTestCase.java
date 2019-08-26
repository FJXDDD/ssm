package com.zking.ssm.sys.service;

import com.zking.ssm.sys.util.PageBean;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//读取上下文
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml"})
public class BaseTestCase {

    protected PageBean pageBean;

    @Before
    public void before() throws Exception{
        pageBean = new PageBean();
    }

}
