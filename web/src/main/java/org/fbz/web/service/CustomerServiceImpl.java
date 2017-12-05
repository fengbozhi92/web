package org.fbz.web.service;

import java.util.List;
import java.util.Map;

import org.fbz.microframework.annotation.Service;
import org.fbz.web.helper.DatabaseHelper;
import org.fbz.web.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public List<Customer> getCustomerList() {
        String sql = "SELECT * FROM customer";
        return DatabaseHelper.queryList(Customer.class, sql);
    }

    @Override
    public Customer getCustomer(long id) {
        String sql = "SELECT * FROM customer WHERE id=?";
        return DatabaseHelper.queryEntity(Customer.class, sql, id);
    }

    @Override
    public boolean createCustomer(Map<String, Object> filedMap) {
        return DatabaseHelper.insertEntity(Customer.class, filedMap);
    }

    @Override
    public boolean updateCustomer(Map<String, Object> filedMap, long id) {
        return DatabaseHelper.updateEntity(Customer.class, filedMap, id);
    }

    @Override
    public boolean deleteCustomer(long id) {
        return DatabaseHelper.deleteEntity(Customer.class, id);
    }
}
