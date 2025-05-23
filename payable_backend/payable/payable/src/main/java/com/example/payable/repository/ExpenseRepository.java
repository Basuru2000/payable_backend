package com.example.payable.repository;

import com.example.payable.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface ExpenseRepository extends JpaRepository<Expense, UUID> {
}
