package com.zking.oa.service;

import com.zking.oa.mapper.PeoperMapper;
import com.zking.oa.model.Peoper;
import com.zking.oa.util.PageBean;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring.xml"})
public class BaseTestCase {
    protected PageBean pageBean;
    ;
    @Before
    public void before(){
       this.pageBean=new PageBean();

    }


}
