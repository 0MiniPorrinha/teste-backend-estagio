package com.hugo.testebackendestagio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hugo.testebackendestagio.entities.EquipmentStateHistory;
import com.hugo.testebackendestagio.entities.pk.EquipmentStateHistoryPK;

@Repository
public interface EquipmentStateHistoryRepository 
    extends JpaRepository<EquipmentStateHistory, EquipmentStateHistoryPK>{
    
}
