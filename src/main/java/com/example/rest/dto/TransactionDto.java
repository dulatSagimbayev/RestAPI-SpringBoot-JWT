package com.example.rest.dto;

import java.time.LocalDate;

public class TransactionDto {

    private Long id;
    private LocalDate date;
    private boolean expense;
    private String title;
    private double sum;
    private double flow;

    public TransactionDto(){

    }
    public TransactionDto(LocalDate date, boolean expense, String title, double sum){
        this.date=date;
        this.expense=expense;
        this.title= title;
        this.sum=sum;
        this.flow=expense? -sum :sum;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public boolean isExpense() {
        return expense;
    }

    public void setExpense(boolean expense) {
        this.expense = expense;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public double getFlow() {
        return flow;
    }

    public void setFlow(double flow) {
        this.flow = flow;
    }




}
