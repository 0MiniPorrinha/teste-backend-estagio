package com.hugo.testebackendestagio.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hugo.testebackendestagio.entities.Equipment;
import com.hugo.testebackendestagio.entities.EquipmentModel;
import com.hugo.testebackendestagio.entities.dto.EquipmentDTO;
import com.hugo.testebackendestagio.exceptions.ResourceNotFoundException;
import com.hugo.testebackendestagio.repositories.EquipmentRepository;

@Service
public class EquipmentService {
    
    @Autowired
    private EquipmentRepository repository;

    @Autowired
    private EquipmentModelService equipmentModelService;

    public List<Equipment> findAll(){
        return  repository
        .findAll()
        .stream()
        .map(x->new Equipment(x,x.getEquipmentModel())).collect(Collectors.toList());
    }

    public Equipment findById(UUID id){
        Optional<Equipment> equipment = repository.findById(id);
        return equipment.orElseThrow(() -> new ResourceNotFoundException(id));
    }

    public Equipment insert(EquipmentDTO equipmentDTO){
        EquipmentModel equipmentModel = equipmentModelService.findById(equipmentDTO.getEquipmentModelId());
        Equipment equipment = new Equipment(null, equipmentDTO.getName(), equipmentModel);
        return repository.save(equipment);
    }
}
