package com.hugo.testebackendestagio.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.hugo.testebackendestagio.entities.pk.EquipmentStateHistoryPK;

@Entity
@Table(name = "equipment_state_history", schema = "operation")
public class EquipmentStateHistory implements Serializable{
    private static final long serialVersionUID = 1L;
    

    @EmbeddedId
    private EquipmentStateHistoryPK id = new EquipmentStateHistoryPK();

    public EquipmentStateHistory() {
    }

    public EquipmentStateHistory(Date date, Equipment equipment, EquipmentState equipmentState) {
        id.setDate(date);
        id.setEquipment(equipment);
        id.setEquipmentState(equipmentState);
    }

    public Equipment getEquipment() {
        return id.getEquipment();
    }

    public void setEquipment(Equipment equipment) {
        id.setEquipment(equipment);
    }

    public EquipmentState getEquipmentState() {
        return id.getEquipmentState();
    }

    public void setEquipmentState(EquipmentState equipmentState) {
        id.setEquipmentState(equipmentState);
    }
}
