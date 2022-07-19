package com.hugo.testebackendestagio.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hugo.testebackendestagio.entities.Equipment;
import com.hugo.testebackendestagio.entities.EquipmentPositionHistory;
import com.hugo.testebackendestagio.entities.pk.EquipmentPositionHistoryPK;
import com.hugo.testebackendestagio.exceptions.ResourceNotFoundException;
import com.hugo.testebackendestagio.repositories.EquipmentPositionHistoryRepository;
import com.hugo.testebackendestagio.repositories.EquipmentRepository;

@Service
public class EquipmentPositionHistoryService {
    
    @Autowired
    private EquipmentPositionHistoryRepository repository;

    @Autowired
    private EquipmentRepository equipmentRepository;

    public List<EquipmentPositionHistory> findAll(){
        return repository.findAll();
    }

    public EquipmentPositionHistory findById(UUID id_equip){
        Equipment equipment = equipmentRepository.findById(id_equip).get();
        EquipmentPositionHistoryPK id = new EquipmentPositionHistoryPK(equipment);
        Optional<EquipmentPositionHistory> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ResourceNotFoundException(id_equip));
    }
}
