package com.example.rest.bootstrap;

import com.example.rest.dto.TransactionDto;
import com.example.rest.service.TransactionService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {
    private final TransactionService transactionService;



    public DataLoader(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @Override
    public void run(String... args) throws Exception {
        initData();
    }
    private void initData(){
        LocalDate begin = LocalDate.of(2020, 1, 1);

        System.out.println("init data");

        transactionService.save(new TransactionDto(begin, false, "Wallet", 10000.0));
        transactionService.save(new TransactionDto(begin, true, "Beer", 300.0));
        transactionService.save(new TransactionDto(begin.plusDays(3), true, "Snacks", 450.0));
        transactionService.save(new TransactionDto(begin.plusDays(10), true, "Petrol", 450.0));
        transactionService.save(new TransactionDto(begin.plusDays(20), false, "Advance", 5000.0));
        transactionService.save(new TransactionDto(begin.plusDays(20), true, "Wine", 700.0));
        transactionService.save(new TransactionDto(begin.plusDays(25), true, "Shop", 1700.0));

    }
}
