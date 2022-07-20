package com.hugo.testebackendestagio.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hugo.testebackendestagio.entities.EquipmentState;
import com.hugo.testebackendestagio.repositories.EquipmentStateRepository;

@Service
public class EquipmentStateService {
    
    @Autowired
    private EquipmentStateRepository repository;

    public List<EquipmentState> findAll(){
        return repository.findAll();
    }
}
