package com.zking.oa.service;

import com.zking.oa.model.Peoper;
import com.zking.oa.util.PageBean;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
public interface IPeoperService {
    int add(Peoper peoper);

    int edit(Peoper peoper);

    int delall(Peoper peoper);

    int del(Peoper Peoper);

    int editselective(Peoper peoper);

    @Transactional(readOnly = true)
    Peoper load(Peoper Peoper);

    @Transactional(readOnly = true)
    List<Peoper> list(Peoper peoper, PageBean pageBean);

    @Transactional(readOnly = true)
    Peoper selectmessage(Peoper peoper);
}
