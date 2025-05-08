package com.example.payable.service;

import com.example.payable.model.Expense;
import java.util.List;
import java.util.UUID;

public interface ExpenseService {
    Expense addExpense(Expense expense);
    List<Expense> getAllExpenses();
    Expense getExpenseById(UUID id);
    Expense updateExpense(UUID id, Expense expense);
    void deleteExpense(UUID id);
}
