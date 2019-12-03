package com.zking.oa.service;

import com.zking.oa.model.Customer;
import com.zking.oa.model.Order;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class CustomerServiceTest extends  BaseTestCase{
    @Autowired
    private ICustomerService customerService;

    private Customer customer;

    @Before
    public void setUp() throws Exception {
    }

    @Override
    public void before() {
        super.before();
        customer=new Customer();
    }

    @Test
    public void loadCasecode() throws Exception {
        customer.setCustomerId(1);
        Customer customer2 = customerService.loadCasecode(this.customer);
        System.out.println(customer2);
        for (Order orders:customer2.getOrderList()) {
            System.out.println(orders);
        }



    }

}