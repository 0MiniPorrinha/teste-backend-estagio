package com.hugo.testebackendestagio.entities.dto;

import java.io.Serializable;

public class EquipmentModelDTO implements Serializable{
    private static final long serialVersionUID = 1L;
    
    private String name;

    public EquipmentModelDTO() {
    }

    public EquipmentModelDTO(String name) {
        this.name = name;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
