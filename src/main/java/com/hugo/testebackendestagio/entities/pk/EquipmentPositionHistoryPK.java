package com.hugo.testebackendestagio.entities.pk;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.hugo.testebackendestagio.entities.Equipment;

@Embeddable
public class EquipmentPositionHistoryPK implements Serializable{
    private static final long serialVersionUID = 1L;
    
    @ManyToOne
    @JoinColumn(name = "equipment_id")
    private Equipment equipment;

    public EquipmentPositionHistoryPK() {
    }

    public EquipmentPositionHistoryPK(Equipment equipment) {
        this.equipment = equipment;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }
}
