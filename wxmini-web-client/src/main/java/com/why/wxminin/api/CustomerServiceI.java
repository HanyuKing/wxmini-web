package com.why.wxminin.api;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import com.why.wxminin.dto.CustomerAddCmd;
import com.why.wxminin.dto.CustomerListByNameQry;
import com.why.wxminin.dto.data.CustomerDTO;

public interface CustomerServiceI {

    public Response addCustomer(CustomerAddCmd customerAddCmd);

    public MultiResponse<CustomerDTO> listByName(CustomerListByNameQry customerListByNameQry);
}
