package com.example.ebankbackend.mappers;

import com.example.ebankbackend.dtos.CustomerDTO;
import com.example.ebankbackend.entites.Customer;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

//mapStruct framework a la place de beanutils pour copier7
@Service
public class BankAccountMapperImpl {
    public CustomerDTO  fromCustomer(Customer customer){
        CustomerDTO customerDTO=new CustomerDTO();
        BeanUtils.copyProperties(customer,customerDTO);
// full set pour copier a la place beanUtils
        return customerDTO;
    }

    public Customer  fromCustomerDTO(CustomerDTO customerDTO){

        Customer customer=new Customer();
        BeanUtils.copyProperties(customerDTO,customer);

        return customer;
    }
}
