package com.zking.oa.service;

import com.zking.oa.model.Order;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class IOrderServiceTest extends BaseTestCase{

    @Autowired
    private  IOrderService orderService;

    private Order order;



    @Override
    public void before() {
        super.before();
        order=new Order();
    }



    @Test
    public void loadCasecode() throws Exception {
        order.setOrderId(1);
        Order orders = orderService.loadCasecode(this.order);

        System.out.println(orders);
        System.out.println(orders.getCustomer());
    }

}