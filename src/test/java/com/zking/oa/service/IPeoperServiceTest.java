package com.zking.oa.service;

import com.zking.oa.mapper.PeoperMapper;
import com.zking.oa.model.Peoper;
import com.zking.oa.service.impl.PeoperServiceImpl;
import com.zking.oa.util.MybatisSessionFactoryUtils;
import com.zking.oa.util.PageBean;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.List;

import static org.junit.Assert.*;

public class IPeoperServiceTest extends BaseTestCase {
    @Autowired
    private RedisTemplate redisTemplate;

    private Peoper peoper;

    @Autowired
    private IPeoperService peoperServices;


//    private SqlSession sqlsession;


//    @Before
//    public void setUp() throws Exception {
//        this.sqlsession = MybatisSessionFactoryUtils.openSession();
//        PeoperMapper peoperMapper = this.sqlsession.getMapper(PeoperMapper.class);
//
//        PeoperServiceImpl peoperService = new PeoperServiceImpl();
//        peoperService.setPeoperMapper(peoperMapper);
//        this.peoperServices = peoperService;
//        this.peoper = new Peoper();
//
//    }


//    @After
//    public void tearDown() throws Exception {
//        this.sqlsession.commit();
//
//
//    }




    @Override
    public void before() {
        super.before();
        this.peoper = new Peoper();
    }

    @Test
    public void add() throws Exception {
        peoper.setSname("魔道非讼");
        peoper.setSid(10);
        int add = this.peoperServices.add(peoper);
        System.out.println("影响的行数" + add);
        System.out.println("添加的id" + peoper.getSid());


    }

    @Test
    public void edit() throws Exception {
        peoper.setSid(3);
        peoper.setSname("横刀一握");
//        peoper.setAge(12);
        peoperServices.edit(peoper);

    }

    @Test
    public void del() throws Exception {
        peoper.setSid(6);
        peoperServices.del(peoper);

    }

    @Test
    public void editselective() throws Exception {
        peoper.setSid(6);
        peoper.setSname("无");
        peoperServices.editselective(peoper);


    }

    @Test
    public void load() throws Exception {
        this.peoper.setSid(3);
        Peoper load = this.peoperServices.load(peoper);
        System.out.println("perple的all值:" + load);

    }

    @Test
    public void delall() throws Exception {
        this.peoper.setSids(new Integer[]{1, 4});
        int delall = this.peoperServices.delall(peoper);
        System.out.println("删除的行:" + delall);


    }

    @Test
    public void list() throws Exception {
        PageBean pageBean = new PageBean();
//        peoper.setMinage(15);
//        peoper.setMaxage(30);
        pageBean.setPage(1);
        pageBean.setRows(5);
//      pageBean.setPagination(false);

        List<Peoper> list = peoperServices.list(peoper, pageBean);
        for (Peoper peopers : list) {
            System.out.println(peopers);

        }
        System.out.println("YYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYY");
        list = peoperServices.list(peoper, pageBean);
        for (Peoper peopers : list) {
            System.out.println(peopers);

        }

    }

    @Test
    public void jianche(){
        redisTemplate.opsForValue().set("sname","zs");

    }

    @Test
    public void selectmessage() {
        peoper.setSid(2);
        Peoper selectmessage = peoperServices.selectmessage(peoper);
        System.out.println(selectmessage);
        System.out.println("*********************************");
        selectmessage = peoperServices.selectmessage(peoper);
        System.out.println(selectmessage);

    }

}