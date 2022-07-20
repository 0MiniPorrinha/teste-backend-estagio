package com.hugo.testebackendestagio.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.hugo.testebackendestagio.entities.pk.EquipmentPositionHistoryPK;

@Entity
@Table(name = "equipment_position_history", schema = "operation")
public class EquipmentPositionHistory implements Serializable{
    private static final long serialVersionUID = 1L;
    
    @EmbeddedId
    private EquipmentPositionHistoryPK id = new EquipmentPositionHistoryPK();

    private Date date;
    private Float lat;
    private Float lon;

    public EquipmentPositionHistory() {
    }

    public EquipmentPositionHistory(Date date, Float lat, Float lon, Equipment equipment) {
        id.setEquipment(equipment);
        this.date = date;
        this.lat = lat;
        this.lon = lon;
    }


    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Float getLat() {
        return lat;
    }

    public void setLat(Float lat) {
        this.lat = lat;
    }

    public Float getLon() {
        return lon;
    }

    public void setLon(Float lon) {
        this.lon = lon;
    }

    public Equipment getEquipment() {
        return id.getEquipment();
    }

    public void setEquipment(Equipment equipment) {
        id.setEquipment(equipment);
    }
     
}
