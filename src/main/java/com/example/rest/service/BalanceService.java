package com.example.rest.service;

import com.example.rest.dto.BalanceDto;

import java.time.LocalDate;

public interface BalanceService {
    BalanceDto getBalance();

    BalanceDto getBalanceByDate (LocalDate date);
}
