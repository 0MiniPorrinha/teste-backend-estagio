package com.hugo.testebackendestagio.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.hugo.testebackendestagio.entities.pk.EquipmentPositionHistoryPK;

@Entity
@Table(name = "equipment_position_history", schema = "operation")
public class EquipmentPositionHistory implements Serializable{
    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private EquipmentPositionHistoryPK id = new EquipmentPositionHistoryPK();


    public EquipmentPositionHistory() {
    }

    public EquipmentPositionHistory(Date date, Float lat, Float lon, Equipment equipment) {
        id.setDate(date);
        id.setLat(lat);
        id.setLon(lon);
        id.setEquipment(equipment);
    }




    public Equipment getEquipment() {
        return id.getEquipment();
    }

    public void setEquipment(Equipment equipment) {
        id.setEquipment(equipment);
    }
     
}
