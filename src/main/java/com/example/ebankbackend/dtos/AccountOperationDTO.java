package com.example.ebankbackend.dtos;

import com.example.ebankbackend.entites.BankAccount;
import com.example.ebankbackend.enumes.OperationType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
public class AccountOperationDTO {
    private Long id;
    private Date operationDate;
    private double amount;
    private OperationType type;
    private  String description;
}
