package org.fbz.web.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.fbz.web.model.Customer;
import org.fbz.web.service.CustomerService;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class CustomerServiceTest {
    private final CustomerService customService;

    public CustomerServiceTest() {
        customService = new CustomerService();
    }

    @Before
    public void init() {

    }

    @Test
    public void getCustomerListTest() throws Exception {
        List<Customer> customerList = customService.getCustomerList();
        Assert.assertEquals(2, customerList.size());
    }

    @Test
    public void getCustomerTest() throws Exception {
        long id = 1;
        Customer customer = customService.getCustomer(id);
        Assert.assertNotNull(customer);
    }
    
    @Test
    public void createCustomerTest() throws Exception {
        Map<String, Object> fileMap = new HashMap<String, Object>();
        fileMap.put("name", "custom100");
        fileMap.put("contact", "feng");
        fileMap.put("phone", "113");
        boolean result = customService.createCustomer(fileMap);
        Assert.assertTrue(result);
    }
    
    @Test
    public void deleteCustomerTest() throws Exception {
        long id = 1;
        boolean result = customService.deleteCustomer(id);
        Assert.assertTrue(result);
    }
}
