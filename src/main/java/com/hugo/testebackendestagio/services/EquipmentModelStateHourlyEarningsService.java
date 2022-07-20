package com.hugo.testebackendestagio.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hugo.testebackendestagio.entities.EquipmentModel;
import com.hugo.testebackendestagio.entities.EquipmentModelStateHourlyEarnings;
import com.hugo.testebackendestagio.entities.EquipmentState;
import com.hugo.testebackendestagio.entities.dto.EquipmentModelStateHourlyEarningsDTO;
import com.hugo.testebackendestagio.entities.pk.EquipmentModelStateHourlyEarningsPK;
import com.hugo.testebackendestagio.exceptions.ResourceNotFoundException;
import com.hugo.testebackendestagio.repositories.EquipmentModelRepository;
import com.hugo.testebackendestagio.repositories.EquipmentModelStateHourlyEarningsRepository;
import com.hugo.testebackendestagio.repositories.EquipmentStateRepository;

@Service
public class EquipmentModelStateHourlyEarningsService {
    
    @Autowired
    private EquipmentModelStateHourlyEarningsRepository repository;

    @Autowired
    private EquipmentModelRepository equipmentModelRepository;

    @Autowired
    private EquipmentStateRepository equipmentStateRepository;

    public List<EquipmentModelStateHourlyEarnings> findAll(){
        return repository.findAll();
    }

    public EquipmentModelStateHourlyEarnings findById(UUID id_model, UUID id_state){
        EquipmentState equipmentState = equipmentStateRepository.findById(id_state).get();
        EquipmentModel equipmentModel = equipmentModelRepository.findById(id_model).get();
        EquipmentModelStateHourlyEarningsPK id = new EquipmentModelStateHourlyEarningsPK(equipmentState, equipmentModel);

        Optional<EquipmentModelStateHourlyEarnings> obj = repository.findById(id);

        return obj.orElseThrow(() -> new ResourceNotFoundException(id));
    }

    public EquipmentModelStateHourlyEarnings insert(EquipmentModelStateHourlyEarningsDTO earningsDTO){
        EquipmentState equipmentState = equipmentStateRepository.findById(earningsDTO.getEquipmentStateId()).get();
        EquipmentModel equipmentModel = equipmentModelRepository.findById(earningsDTO.getEquipmentModelId()).get();

        EquipmentModelStateHourlyEarnings earnings = new EquipmentModelStateHourlyEarnings(earningsDTO.getValue(), equipmentModel, equipmentState);
        
        return repository.save(earnings);
    }
}
