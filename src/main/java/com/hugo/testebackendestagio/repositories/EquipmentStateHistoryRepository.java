package com.hugo.testebackendestagio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hugo.testebackendestagio.entities.EquipmentStateHistory;
import com.hugo.testebackendestagio.entities.pk.EquipmentStateHistoryPK;

public interface EquipmentStateHistoryRepository 
    extends JpaRepository<EquipmentStateHistory, EquipmentStateHistoryPK>{
    
}
