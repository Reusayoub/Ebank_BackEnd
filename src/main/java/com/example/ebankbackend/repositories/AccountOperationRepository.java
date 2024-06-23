package com.example.ebankbackend.repositories;

import com.example.ebankbackend.entites.AccountOperation;
import com.example.ebankbackend.entites.Customer;
import com.example.ebankbackend.enumes.OperationType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountOperationRepository  extends JpaRepository<AccountOperation,Long> {
    List<AccountOperation> findByBankAccountId(String accountId);
    Page<AccountOperation> findByBankAccountIdOrderByOperationDateDesc(String accountId, Pageable pageable);

}