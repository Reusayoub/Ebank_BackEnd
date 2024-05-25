package com.example.ebankbackend.repositories;

import com.example.ebankbackend.entites.BankAccount;
import com.example.ebankbackend.entites.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository  extends JpaRepository<BankAccount,String> {
}