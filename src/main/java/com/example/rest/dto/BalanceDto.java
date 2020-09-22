package com.example.rest.dto;

import java.time.LocalDate;

public class BalanceDto {


    private LocalDate date;
    private double balance;

    public BalanceDto(){
    }
    public BalanceDto(LocalDate date, double balance){
        this.date = date;
        this.balance = balance;
    }
    public LocalDate getDate() {return date; }

    public void setDate(LocalDate date) { this.date = date; }

    public double getBalance() {return balance; }

    public void setBalance(double balance) { this.balance = balance; }
}
