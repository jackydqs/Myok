package com.zking.oa.service.impl;

import com.zking.oa.mapper.OrderMapper;
import com.zking.oa.model.Order;
import com.zking.oa.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements IOrderService {
    @Autowired
    private OrderMapper orderMapper;


    @Override
    public Order loadCasecode(Order order) {
        return orderMapper.loadCustcode(order);
    }
}
