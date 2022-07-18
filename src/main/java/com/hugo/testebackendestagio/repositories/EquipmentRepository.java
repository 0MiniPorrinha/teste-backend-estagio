package com.hugo.testebackendestagio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hugo.testebackendestagio.entities.Equipment;

@Repository
public interface EquipmentRepository extends JpaRepository<Equipment, String>{
    
}
