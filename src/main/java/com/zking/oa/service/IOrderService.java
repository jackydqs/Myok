package com.zking.oa.service;

import com.zking.oa.model.Order;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface IOrderService {

    @Transactional(readOnly = true)
    Order loadCasecode(Order order);
}
