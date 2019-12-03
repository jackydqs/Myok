package com.zking.oa.service;

import com.zking.oa.model.Customer;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface ICustomerService {
    @Transactional(readOnly = true)
    Customer loadCasecode(Customer customer);


}
