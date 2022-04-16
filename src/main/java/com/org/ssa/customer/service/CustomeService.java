package com.org.ssa.customer.service;

import com.org.ssa.customer.model.Customer;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface CustomeService {

    public void createCustomer(Customer customer);

    public void updateCustomer(Customer customer);

    public List<Customer> getAllCustomer();

    public Customer findById(Integer id);

    public String delateById(Integer id);

    public Customer findByName(String name);

    public Customer findByCustomerAddress(String customerAddress);
}
