package com.example.payable.service.impl;

import com.example.payable.model.Expense;
import com.example.payable.repository.ExpenseRepository;
import com.example.payable.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ExpenseServiceImpl implements ExpenseService {

    @Autowired
    private ExpenseRepository repository;

    @Override
    public Expense addExpense(Expense expense) {
        return repository.save(expense);
    }

    @Override
    public List<Expense> getAllExpenses() {
        return repository.findAll();
    }

    @Override
    public Expense getExpenseById(UUID id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Expense not found"));
    }

    @Override
    public Expense updateExpense(UUID id, Expense updated) {
        Expense existing = getExpenseById(id);
        existing.setTitle(updated.getTitle());
        existing.setAmount(updated.getAmount());
        existing.setCategory(updated.getCategory());
        existing.setDate(updated.getDate());
        return repository.save(existing);
    }

    @Override
    public void deleteExpense(UUID id) {
        repository.deleteById(id);
    }
}
