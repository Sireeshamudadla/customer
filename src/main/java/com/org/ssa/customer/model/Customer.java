package com.org.ssa.customer.model;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table
@Data
public class Customer implements Serializable {

    @Id
    private int id;
    private String name;
    private String customerAddress;
    private Double customerPhoneNo;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public Double getCustomerPhoneNo() {
        return customerPhoneNo;
    }

    public void setCustomerPhoneNo(Double customerPhoneNo) {
        this.customerPhoneNo = customerPhoneNo;
    }
}
