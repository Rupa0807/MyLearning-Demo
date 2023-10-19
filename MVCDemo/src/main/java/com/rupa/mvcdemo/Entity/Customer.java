package com.rupa.mvcdemo.Entity;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public class Customer {
    @NotNull(message = "is Required")
    @Size(min=1 ,max=15,message="value between 1 and 15 characters")
    private String firstName;

    private String lastName;
    @Positive(message ="enter a valid value")
    private String CustomerID;

    public Customer() {
    }

    public Customer(String firstName, String lastName, String customerID) {
        this.firstName = firstName;
        this.lastName = lastName;
        CustomerID = customerID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(String customerID) {
        CustomerID = customerID;
    }
}
