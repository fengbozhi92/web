package org.fbz.web.service;

import java.util.List;
import java.util.Map;

import org.fbz.web.model.Customer;

public interface CustomerService {
    List<Customer> getCustomerList();
    Customer getCustomer(long id);
    boolean createCustomer(Map<String, Object> filedMap);
    boolean updateCustomer(Map<String, Object> filedMap, long id);
    boolean deleteCustomer(long id);
}
