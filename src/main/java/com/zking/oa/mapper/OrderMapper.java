package com.zking.oa.mapper;

import com.zking.oa.model.Order;

public interface OrderMapper {
    int deleteByPrimaryKey(Integer orderId);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(Integer orderId);
    Order loadCustcode(Order order);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);
}