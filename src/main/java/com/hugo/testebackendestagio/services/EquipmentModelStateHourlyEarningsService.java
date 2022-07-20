package com.hugo.testebackendestagio.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hugo.testebackendestagio.entities.EquipmentModelStateHourlyEarnings;
import com.hugo.testebackendestagio.repositories.EquipmentModelStateHourlyEarningsRepository;

@Service
public class EquipmentModelStateHourlyEarningsService {
    
    @Autowired
    private EquipmentModelStateHourlyEarningsRepository repository;

    public List<EquipmentModelStateHourlyEarnings> findAll(){
        return repository.findAll();
    }
}
