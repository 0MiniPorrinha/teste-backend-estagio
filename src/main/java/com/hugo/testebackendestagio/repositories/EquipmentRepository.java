package com.hugo.testebackendestagio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hugo.testebackendestagio.entities.Equipment;

public interface EquipmentRepository extends JpaRepository<Equipment, String>{
    
}
