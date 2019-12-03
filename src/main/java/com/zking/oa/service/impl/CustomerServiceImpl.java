package com.zking.oa.service.impl;

import com.zking.oa.mapper.CustomerMapper;
import com.zking.oa.model.Customer;
import com.zking.oa.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements ICustomerService {
    @Autowired
    private CustomerMapper customerMapper;


    @Override
    public Customer loadCasecode(Customer customer) {
        return customerMapper.loadCasecode(customer);
    }
}
