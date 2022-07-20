package com.hugo.testebackendestagio.entities.dto;

import java.io.Serializable;
import java.util.UUID;

public class EquipmentModelStateHourlyEarningsDTO implements Serializable{
    private static final long serialVersionUID = 1L;
    
    
    private float value;
    private UUID equipmentStateId;
    private UUID equipmentModelId;
    
    public EquipmentModelStateHourlyEarningsDTO() {
    }
    public EquipmentModelStateHourlyEarningsDTO(float value, UUID equipmentStateId, UUID equipmentModelId) {
        this.value = value;
        this.equipmentStateId = equipmentStateId;
        this.equipmentModelId = equipmentModelId;
    }
    public float getValue() {
        return value;
    }
    public void setValue(float value) {
        this.value = value;
    }
    public UUID getEquipmentStateId() {
        return equipmentStateId;
    }
    public void setEquipmentStateId(UUID equipmentStateId) {
        this.equipmentStateId = equipmentStateId;
    }
    public UUID getEquipmentModelId() {
        return equipmentModelId;
    }
    public void setEquipmentModelId(UUID equipmentModelId) {
        this.equipmentModelId = equipmentModelId;
    }

    
}
