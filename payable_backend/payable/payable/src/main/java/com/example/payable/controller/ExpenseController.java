package com.example.payable.controller;

import com.example.payable.model.Expense;
import com.example.payable.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/expenses")
@CrossOrigin(origins = "*")
public class ExpenseController {

    @Autowired
    private ExpenseService service;

    @PostMapping
    public Expense create(@RequestBody Expense expense) {
        return service.addExpense(expense);
    }

    @GetMapping
    public List<Expense> getAll() {
        return service.getAllExpenses();
    }

    @GetMapping("/{id}")
    public Expense getById(@PathVariable UUID id) {
        return service.getExpenseById(id);
    }

    @PutMapping("/{id}")
    public Expense update(@PathVariable UUID id, @RequestBody Expense expense) {
        return service.updateExpense(id, expense);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) {
        service.deleteExpense(id);
    }
}
