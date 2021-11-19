package com.why.wxminin.domain.customer.gateway;

import com.why.wxminin.domain.customer.Customer;
import com.why.wxminin.domain.customer.Credit;

//Assume that the credit info is in antoher distributed Service
public interface CreditGateway {
    public Credit getCredit(String customerId);
}
