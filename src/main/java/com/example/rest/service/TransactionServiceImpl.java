package com.example.rest.service;

import com.example.rest.dto.TransactionDto;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class TransactionServiceImpl implements TransactionService {

    private long ind=1;
    private Map<Long, TransactionDto> repository = new LinkedHashMap<>();

    @Override
    public List<TransactionDto> getAll() {
        return new ArrayList<>(repository.values());
    }

    @Override
    public List<TransactionDto> getByPeriod(LocalDate start, LocalDate end) {
        return repository.values()
                .stream()
                .filter(entity-> dateBetween(entity.getDate(),start,end))
                .collect(Collectors.toList());
    }

    @Override
    public List<TransactionDto> getIncomes() {
        return repository.values().stream()
                .filter(entity-> !entity.isExpense())
                .collect(Collectors.toList());
    }

    @Override
    public List<TransactionDto> getExpenses() {
        return repository.values().stream()
                .filter(TransactionDto::isExpense)
                .collect(Collectors.toList());
    }

    @Override
    public TransactionDto findById(long id) {

        return repository.get(id);
    }

    @Override
    public void save(TransactionDto dto) {
        if(dto.getId()==null){
            dto.setId(ind++);
        }
        repository.put(dto.getId(),dto);
    }

    @Override
    public void deleteById(long id) {
        repository.remove(id);
    }

    private boolean dateBetween(LocalDate date, LocalDate start, LocalDate end){
        return !(date.isBefore(start) || date.isAfter(end));
    }
}
