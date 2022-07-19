package com.hugo.testebackendestagio.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hugo.testebackendestagio.entities.Equipment;
import com.hugo.testebackendestagio.entities.EquipmentState;
import com.hugo.testebackendestagio.entities.EquipmentStateHistory;
import com.hugo.testebackendestagio.entities.pk.EquipmentStateHistoryPK;
import com.hugo.testebackendestagio.exceptions.ResourceNotFoundException;
import com.hugo.testebackendestagio.repositories.EquipmentRepository;
import com.hugo.testebackendestagio.repositories.EquipmentStateHistoryRepository;
import com.hugo.testebackendestagio.repositories.EquipmentStateRepository;

@Service
public class EquipmentStateHistoryService {
    
    @Autowired
    private EquipmentStateHistoryRepository repository;

    @Autowired
    private EquipmentRepository equipmentRepository;

    @Autowired
    private EquipmentStateRepository equipmentStateRepository;

    public List<EquipmentStateHistory> findAll(){
        return repository.findAll();
    }

    public EquipmentStateHistory findById(UUID id_equip, UUID id_state){
        Equipment equipment = equipmentRepository.findById(id_equip).get();
        EquipmentState equipmentState = equipmentStateRepository.findById(id_state).get();
        EquipmentStateHistoryPK id = new EquipmentStateHistoryPK(equipment, equipmentState);
        Optional<EquipmentStateHistory> obj = repository.findById(id);

        return obj.orElseThrow(() -> new ResourceNotFoundException(id));
    }
}
