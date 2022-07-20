package com.hugo.testebackendestagio.entities.pk;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.hugo.testebackendestagio.entities.Equipment;
import com.hugo.testebackendestagio.entities.EquipmentState;

@Embeddable
public class EquipmentStateHistoryPK implements Serializable{
    private static final long serialVersionUID = 1L;
    @ManyToOne
    @JoinColumn(name = "equipment_id")
    private Equipment equipment;

    @ManyToOne
    @JoinColumn(name = "equipment_state_id")
    private EquipmentState equipmentState;

    @Column(name = "date")
    private Date date;

    public EquipmentStateHistoryPK() {
    }

    public EquipmentStateHistoryPK(Equipment equipment, EquipmentState equipmentState, Date date) {
        this.equipment = equipment;
        this.equipmentState = equipmentState;
        this.date = date;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    public EquipmentState getEquipmentState() {
        return equipmentState;
    }

    public void setEquipmentState(EquipmentState equipmentState) {
        this.equipmentState = equipmentState;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((date == null) ? 0 : date.hashCode());
        result = prime * result + ((equipment == null) ? 0 : equipment.hashCode());
        result = prime * result + ((equipmentState == null) ? 0 : equipmentState.hashCode());
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
        EquipmentStateHistoryPK other = (EquipmentStateHistoryPK) obj;
        if (date == null) {
            if (other.date != null)
                return false;
        } else if (!date.equals(other.date))
            return false;
        if (equipment == null) {
            if (other.equipment != null)
                return false;
        } else if (!equipment.equals(other.equipment))
            return false;
        if (equipmentState == null) {
            if (other.equipmentState != null)
                return false;
        } else if (!equipmentState.equals(other.equipmentState))
            return false;
        return true;
    }

    
}
