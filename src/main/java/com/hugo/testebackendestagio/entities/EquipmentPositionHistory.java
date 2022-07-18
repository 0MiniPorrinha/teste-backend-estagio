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
    
    private Date date;
    private float lat;
    private float lon;

    @EmbeddedId
    private EquipmentPositionHistoryPK id = new EquipmentPositionHistoryPK();
    
    public EquipmentPositionHistory() {
    }

    public EquipmentPositionHistory(Date date, float lat, float lon, Equipment equipment) {
        this.date = date;
        this.lat = lat;
        this.lon = lon;
        id.setEquipment(equipment);
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public float getLat() {
        return lat;
    }

    public void setLat(float lat) {
        this.lat = lat;
    }

    public float getLon() {
        return lon;
    }

    public void setLon(float lon) {
        this.lon = lon;
    }

    public Equipment getEquipment() {
        return id.getEquipment();
    }

    public void setEquipment(Equipment equipment) {
        id.setEquipment(equipment);
    }
}
