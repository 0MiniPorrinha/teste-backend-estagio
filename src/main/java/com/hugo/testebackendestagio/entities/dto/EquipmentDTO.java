package com.hugo.testebackendestagio.entities.dto;

import java.io.Serializable;
import java.util.UUID;

public class EquipmentDTO implements Serializable{
    private static final long serialVersionUID = 1L;
    
    private String name;
    private UUID equipmentModelId;
    
    public EquipmentDTO() {
    }

    public EquipmentDTO(String name, UUID equipmentModelId) {
        this.name = name;
        this.equipmentModelId = equipmentModelId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getEquipmentModelId() {
        return equipmentModelId;
    }

    public void setEquipmentModelId(UUID equipmentModelId) {
        this.equipmentModelId = equipmentModelId;
    }

    
}
