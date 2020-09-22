package com.example.rest.service;

import com.example.rest.dto.TransactionDto;

import java.time.LocalDate;
import java.util.List;

public interface TransactionService {
    List<TransactionDto> getAll();

    List<TransactionDto> getByPeriod(LocalDate start, LocalDate end);

    List<TransactionDto> getIncomes();
    List<TransactionDto> getExpenses();
    TransactionDto findById(long id);
    void save(TransactionDto dto);
    void deleteById(long id);
}
