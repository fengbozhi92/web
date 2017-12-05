package org.fbz.web.controller.customer;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.fbz.microframework.annotation.Action;
import org.fbz.microframework.annotation.Controller;
import org.fbz.microframework.bean.Data;
import org.fbz.microframework.bean.Param;
import org.fbz.microframework.bean.View;
import org.fbz.web.model.Customer;
import org.fbz.web.service.CustomerServiceImpl;

@Controller
public class CustomerController {
    //@Inject
    //private CustomerService customerService;
    
    @Action("get:/customer")
    public View index(Param param){
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        List<Customer> customerList = customerService.getCustomerList();
        return new View("customer.jsp").addModel("customerList", customerList);
    }
    
    @Action("get:/customer_show")
    public View show(Param param){
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        Customer customer = customerService.getCustomer(param.getLong("id"));
        return new View("customer_show.jsp").addModel("customer", customer);
    }
    
    @Action("get:/doit")
    public Data doit(Param param){
        Map<String, Object> model = new HashMap<String, Object>();
        model.put("result", "micro");
        return new Data(model);
    }
}
