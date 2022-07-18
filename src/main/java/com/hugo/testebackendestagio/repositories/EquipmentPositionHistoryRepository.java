package com.hugo.testebackendestagio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hugo.testebackendestagio.entities.EquipmentPositionHistory;
import com.hugo.testebackendestagio.entities.pk.EquipmentPositionHistoryPK;

@Repository
public interface EquipmentPositionHistoryRepository 
    extends JpaRepository<EquipmentPositionHistory, EquipmentPositionHistoryPK>{
    
}
