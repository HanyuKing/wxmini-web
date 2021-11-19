package com.why.wxminin.domain.customer.gateway;

import com.why.wxminin.domain.customer.Customer;

public interface CustomerGateway {
    public Customer getByById(String customerId);
}
