package com.example.ebankbackend.repositories;

import com.example.ebankbackend.entites.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository  extends JpaRepository<Customer,Long> {
}
