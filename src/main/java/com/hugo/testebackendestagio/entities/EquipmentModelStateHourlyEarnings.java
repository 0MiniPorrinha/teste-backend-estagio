package com.hugo.testebackendestagio.entities;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.hugo.testebackendestagio.entities.pk.EquipmentModelStateHourlyEarningsPK;

@Entity
@Table(name = "equipment_model_state_hourly_earnings", schema = "operation")
public class EquipmentModelStateHourlyEarnings implements Serializable{
    private static final long serialVersionUID = 1L;
    
    private float value;

    @EmbeddedId
    private EquipmentModelStateHourlyEarningsPK id = new EquipmentModelStateHourlyEarningsPK();

    public EquipmentModelStateHourlyEarnings(){
    }

    public EquipmentModelStateHourlyEarnings(float value, EquipmentModel equipmentModel, EquipmentState equipmentState) {
        this.value = value;
        id.setEquipmentModel(equipmentModel);
        id.setEquipmentState(equipmentState);
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public EquipmentState getEquipmentState() {
        return id.getEquipmentState();
    }

    public void setEquipmentState(EquipmentState equipmentState) {
        id.setEquipmentState(equipmentState);
    }

    public EquipmentModel getEquipmentModel() {
        return id.getEquipmentModel();
    }

    public void setEquipmentModel(EquipmentModel equipmentModel) {
        id.setEquipmentModel(equipmentModel);
    }
}
