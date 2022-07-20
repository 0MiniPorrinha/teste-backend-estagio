package com.hugo.testebackendestagio.entities.dto;

import java.io.Serializable;

public class EquipmentStateDTO implements Serializable{
    private static final long serialVersionUID = 1L;
    
    private String name;
    private String color;
    
    public EquipmentStateDTO() {
    }
    public EquipmentStateDTO(String name, String color) {
        this.name = name;
        this.color = color;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
}
