package com.hugo.testebackendestagio.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hugo.testebackendestagio.entities.EquipmentModel;
import com.hugo.testebackendestagio.entities.dto.EquipmentModelDTO;
import com.hugo.testebackendestagio.exceptions.ResourceNotFoundException;
import com.hugo.testebackendestagio.repositories.EquipmentModelRepository;

@Service
public class EquipmentModelService {
    
    @Autowired
    private EquipmentModelRepository repository;

    public List<EquipmentModel> findAll(){
        return repository.findAll();
    }

    public EquipmentModel findById(UUID id){
        Optional<EquipmentModel> equipmentModel = repository.findById(id);
        return equipmentModel.orElseThrow(() -> new ResourceNotFoundException(id));
    }

    public EquipmentModel insert(EquipmentModelDTO equipmentModelDTO){
        EquipmentModel equipmentModel = new EquipmentModel(null, equipmentModelDTO.getName());
        return repository.save(equipmentModel);
    }
}
