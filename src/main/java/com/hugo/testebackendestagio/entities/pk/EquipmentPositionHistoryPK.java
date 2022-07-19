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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((equipment == null) ? 0 : equipment.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        EquipmentPositionHistoryPK other = (EquipmentPositionHistoryPK) obj;
        if (equipment == null) {
            if (other.equipment != null)
                return false;
        } else if (!equipment.equals(other.equipment))
            return false;
        return true;
    }
}
