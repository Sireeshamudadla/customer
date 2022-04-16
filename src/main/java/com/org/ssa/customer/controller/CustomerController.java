package com.org.ssa.customer.controller;


import com.org.ssa.customer.model.Customer;
import com.org.ssa.customer.service.CustomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.print.DocFlavor;
import java.util.List;

@RestController
@RequestMapping("/api")
public class CustomerController {

    /*
    * crud
    *
    * */

    @Autowired
    CustomeService customeService;

    @PostMapping("/create")
    public void createCustomer(@RequestBody Customer customer){
        customeService.createCustomer(customer);
    }


    @PutMapping("/update")
    public void updateCustomer(@RequestBody Customer customer){
        customeService.updateCustomer(customer);
    }

    @GetMapping("/getAll")
    public List<Customer> getAllCustomer(){
        List<Customer>custList=customeService.getAllCustomer();
        return custList;
    }

    @GetMapping("/findById/{id}")
    public Customer findById(@PathVariable Integer id){
        Customer cust=  customeService.findById(id);
        return cust;
    }

    @DeleteMapping("/deleteById/{id}")
    public String delateById(@PathVariable Integer id){
        String s=customeService.delateById(id);
        return s;
    }


    @GetMapping("/findByName/{name}")
    public Customer findByName(@PathVariable String name){
        Customer cts=customeService.findByName(name);
        return cts;
    }


    @GetMapping("/findByCustomerAddress/{customerAddress}")
    public Customer findByCustomerAddress(@PathVariable String customerAddress){
        Customer bbb=customeService.findByCustomerAddress(customerAddress);
        return bbb;
    }


}
