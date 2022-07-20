package com.hugo.testebackendestagio.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hugo.testebackendestagio.entities.Equipment;
import com.hugo.testebackendestagio.entities.EquipmentState;
import com.hugo.testebackendestagio.entities.EquipmentStateHistory;
import com.hugo.testebackendestagio.entities.pk.EquipmentStateHistoryPK;

@Repository
public interface EquipmentStateHistoryRepository 
    extends JpaRepository<EquipmentStateHistory, EquipmentStateHistoryPK>{
    
    List<EquipmentStateHistory> findByIdEquipmentAndIdEquipmentState(Equipment equipment, EquipmentState equipmentState);
}
