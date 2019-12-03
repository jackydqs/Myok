package com.zking.oa.mapper;

import com.zking.oa.model.Peoper;

import java.util.List;

public interface PeoperMapper {
    int deleteByPrimaryKey(Integer sid);

    int delall(Peoper record);

    int insert(Peoper record);

    int insertSelective(Peoper record);

    Peoper selectByPrimaryKey(Integer sid);

    int updateByPrimaryKeySelective(Peoper record);

    int updateByPrimaryKey(Peoper record);

    List<Peoper> list(Peoper peoper);


}