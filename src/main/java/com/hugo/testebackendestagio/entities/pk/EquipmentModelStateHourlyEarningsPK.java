package com.hugo.testebackendestagio.entities.pk;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.hugo.testebackendestagio.entities.EquipmentModel;
import com.hugo.testebackendestagio.entities.EquipmentState;

@Embeddable
public class EquipmentModelStateHourlyEarningsPK implements Serializable{
    private static final long serialVersionUID = 1L;
    
    @ManyToOne
    @JoinColumn(name = "equipment_state_id")
    private EquipmentState equipmentState;

    @ManyToOne
    @JoinColumn(name = "equipment_model_id")
    private EquipmentModel equipmentModel;

    public EquipmentModelStateHourlyEarningsPK() {
    }

    public EquipmentModelStateHourlyEarningsPK(EquipmentState equipmentState, EquipmentModel equipmentModel) {
        this.equipmentState = equipmentState;
        this.equipmentModel = equipmentModel;
    }

    public EquipmentState getEquipmentState() {
        return equipmentState;
    }

    public void setEquipmentState(EquipmentState equipmentState) {
        this.equipmentState = equipmentState;
    }

    public EquipmentModel getEquipmentModel() {
        return equipmentModel;
    }

    public void setEquipmentModel(EquipmentModel equipmentModel) {
        this.equipmentModel = equipmentModel;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((equipmentModel == null) ? 0 : equipmentModel.hashCode());
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
        EquipmentModelStateHourlyEarningsPK other = (EquipmentModelStateHourlyEarningsPK) obj;
        if (equipmentModel == null) {
            if (other.equipmentModel != null)
                return false;
        } else if (!equipmentModel.equals(other.equipmentModel))
            return false;
        if (equipmentState == null) {
            if (other.equipmentState != null)
                return false;
        } else if (!equipmentState.equals(other.equipmentState))
            return false;
        return true;
    }

    
}
