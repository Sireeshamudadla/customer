package com.org.ssa.customer.service;


import com.org.ssa.customer.model.Customer;
import com.org.ssa.customer.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomeService{

    @Autowired
    CustomerRepo customerRepo;

    @Override
    public void createCustomer(Customer customer) {
        customerRepo.save(customer);
    }

    @Override
    public void updateCustomer(Customer customer) {
        customerRepo.save(customer);
    }

    @Override
    public List<Customer> getAllCustomer() {
        List<Customer> list=customerRepo.findAll();
        return list;
    }

    @Override
    public Customer findById(Integer id) {
        Customer customer=customerRepo.getById(id);
        return customer;
    }

    @Override
    public String delateById(Integer id) {
        customerRepo.deleteById(id);
        return "success";
    }

    @Override
    public Customer findByName(String name) {
        Customer cuatName=customerRepo.findByName(name);
        return cuatName;
    }

    @Override
    public Customer findByCustomerAddress(String customerAddress) {
        Customer ccc=customerRepo.findByCustomerAddress(customerAddress);
        return ccc;
    }
}
