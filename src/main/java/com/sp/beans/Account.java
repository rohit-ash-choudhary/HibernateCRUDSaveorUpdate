package com.sp.beans;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "account_information")
public class Account {

    @Id
    @Column(name = "account_num")
    private int account_num;

    @Column(name = "first_name")
    private String first_name;

    @Column(name = "last_name")
    private String last_name;

    @Column(name = "account_balance")
    private Long account_balance;

    @Column(name = "City")
    private String City;

    // Getters and setters
    public int getAccount_num() {
        return account_num;
    }

    public void setAccount_num(int account_num) {
        this.account_num = account_num;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public Long getAccount_balance() {
        return account_balance;
    }

    public void setAccount_balance(Long account_balance) {
        this.account_balance = account_balance;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }
}
