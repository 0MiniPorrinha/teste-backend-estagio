package com.hugo.testebackendestagio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hugo.testebackendestagio.entities.pk.EquipmentModelStateHourlyEarningsPK;

public interface EquipmentModelStateHourlyEarningsRepository extends 
    JpaRepository<EquipmentModelStateHourlyEarningsRepository, EquipmentModelStateHourlyEarningsPK>{
    
}
