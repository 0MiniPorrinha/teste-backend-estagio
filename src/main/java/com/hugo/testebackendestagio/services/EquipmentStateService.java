package com.hugo.testebackendestagio.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hugo.testebackendestagio.entities.EquipmentState;
import com.hugo.testebackendestagio.entities.dto.EquipmentStateDTO;
import com.hugo.testebackendestagio.exceptions.ResourceNotFoundException;
import com.hugo.testebackendestagio.repositories.EquipmentStateRepository;

@Service
public class EquipmentStateService {
    
    @Autowired
    private EquipmentStateRepository repository;

    public List<EquipmentState> findAll(){
        return repository.findAll();
    }

    public EquipmentState findById(UUID id){
        Optional<EquipmentState> obj = repository.findById(id);

        return obj.orElseThrow(() -> new ResourceNotFoundException(id));
    }

    public EquipmentState insert(EquipmentStateDTO equipmentStateDTO){
        EquipmentState equipmentState = new EquipmentState(null, equipmentStateDTO.getName(), equipmentStateDTO.getColor());

        return repository.save(equipmentState);
    }
}
