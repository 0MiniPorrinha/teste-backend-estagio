package com.hugo.testebackendestagio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hugo.testebackendestagio.entities.EquipmentPositionHistory;
import com.hugo.testebackendestagio.entities.pk.EquipmentPositionHistoryPK;

public interface EquipmentPositionHistoryRepository 
    extends JpaRepository<EquipmentPositionHistory, EquipmentPositionHistoryPK>{
    
}
