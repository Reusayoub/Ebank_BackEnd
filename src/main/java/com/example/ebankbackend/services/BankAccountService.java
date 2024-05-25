package com.example.ebankbackend.services;

import com.example.ebankbackend.dtos.CustomerDTO;
import com.example.ebankbackend.entites.BankAccount;
import com.example.ebankbackend.entites.CurrentAccount;
import com.example.ebankbackend.entites.Customer;
import com.example.ebankbackend.entites.SavingAccount;
import com.example.ebankbackend.enumes.AccountStatus;
import com.example.ebankbackend.exception.BalanceNotSufficentException;
import com.example.ebankbackend.exception.BankAccountNotFoundException;
import com.example.ebankbackend.exception.CustomerNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

public interface BankAccountService {
    CustomerDTO saveCustomer(CustomerDTO customerDTO);
     CurrentAccount saveCurrentBankAccount(double initialBalance, double overDraft,  Long customerID) throws CustomerNotFoundException;
    SavingAccount saveSavingBankAccount(double initialBalance, double interestRate,  Long customerID) throws CustomerNotFoundException;

    List<CustomerDTO> ListCustomer();
     BankAccount getBankAccount(String accountId) throws BankAccountNotFoundException;

     void debit(String accountID,double amount,String description) throws BankAccountNotFoundException, BalanceNotSufficentException;

    void credit(String accountID,double amount,String description) throws BankAccountNotFoundException;
    void transfer(String accountIdSource, String accountIdDestination,double amount) throws BankAccountNotFoundException, BalanceNotSufficentException;

    List<BankAccount>  bankAccountList();

    CustomerDTO getCustomer(long customerId) throws CustomerNotFoundException;

    CustomerDTO updateCustomer(CustomerDTO customerDTO);

    void deleteCustomer(Long customerId);
}
