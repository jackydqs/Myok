package com.zking.oa.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zking.oa.mapper.PeoperMapper;
import com.zking.oa.model.Peoper;
import com.zking.oa.service.IPeoperService;
import com.zking.oa.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
//@Component
//@Scope(value = "propotype")
public class PeoperServiceImpl implements IPeoperService {
    @Autowired //根据对象类型找到bean，@resource 根据名字（ID）找bean
    private PeoperMapper peoperMapper;

    public PeoperMapper getPeoperMapper() {
        return peoperMapper;
    }

    public void setPeoperMapper(PeoperMapper peoperMapper) {
        this.peoperMapper = peoperMapper;
    }

    @Override
    public int add(Peoper peoper) {
        return peoperMapper.insert(peoper);
    }

    @Override
    public int edit(Peoper peoper) {
        return peoperMapper.updateByPrimaryKey(peoper);
    }

    @Override
    public int delall(Peoper peoper) {
        return peoperMapper.delall(peoper);
    }

    @Override
    public int del(Peoper Peoper) {
        return peoperMapper.deleteByPrimaryKey(Peoper.getSid());
    }

    @Override
    public int editselective(Peoper peoper) {
        return peoperMapper.updateByPrimaryKeySelective(peoper);
    }

    @Override
    public Peoper load(Peoper Peoper) {
        return peoperMapper.selectByPrimaryKey(Peoper.getSid());
    }

    @Override
    public List<Peoper> list(Peoper peoper, PageBean pageBean) {
//        if (null != pageBean && pageBean.isPagination()) {
//            PageHelper.startPage(pageBean.getPage(), pageBean.getRows());
//
//        }
//

        List<Peoper> list = this.peoperMapper.list(peoper);
//        System.out.println("list的类型:"+list.getClass());
//        if (null != pageBean && pageBean.isPagination()) {
//            PageInfo pageInfo=new PageInfo(list);
//            pageBean.setTotal(pageInfo.getTotal()+"");
//
//        }

        return list;
    }

    @Override
    public Peoper selectmessage(Peoper peoper) {
        return peoperMapper.selectByPrimaryKey(peoper.getSid());
    }
}
