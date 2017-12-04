package org.fbz.web.service;

import java.util.List;
import java.util.Map;

import org.fbz.web.helper.DatabaseHelper;
import org.fbz.web.model.Customer;

public class CustomerService {

    public List<Customer> getCustomerList(){
        String sql = "SELECT * FROM customer";
        return DatabaseHelper.queryList(Customer.class, sql);
    }
    
    public Customer getCustomer(long id){
        String sql = "SELECT * FROM customer WHERE id=?";
        return DatabaseHelper.queryEntity(Customer.class, sql, id);
    }
    
    public boolean createCustomer(Map<String, Object> filedMap){
        return DatabaseHelper.insertEntity(Customer.class, filedMap);
    }
    
    public boolean updateCustomer(Map<String, Object> filedMap, long id){
        return DatabaseHelper.updateEntity(Customer.class, filedMap, id);
    }
    
    public boolean deleteCustomer(long id) {
        return DatabaseHelper.deleteEntity(Customer.class, id);
    }
}
