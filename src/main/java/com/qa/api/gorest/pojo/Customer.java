package com.qa.api.gorest.pojo;

public class Customer {

    public Customer(int limit) {
        this.limit = limit;
    }

    int limit;

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getLimit() {
        return limit;
    }
}
