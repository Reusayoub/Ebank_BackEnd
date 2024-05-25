package com.example.ebankbackend.repositories;

import com.example.ebankbackend.entites.AccountOperation;
import com.example.ebankbackend.entites.Customer;
import com.example.ebankbackend.enumes.OperationType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountOperationRepository  extends JpaRepository<AccountOperation,Long> {
}