package com.hugo.testebackendestagio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hugo.testebackendestagio.entities.EquipmentState;

@Repository
public interface EquipmentStateRepository extends JpaRepository<EquipmentState, String>{
    
}
