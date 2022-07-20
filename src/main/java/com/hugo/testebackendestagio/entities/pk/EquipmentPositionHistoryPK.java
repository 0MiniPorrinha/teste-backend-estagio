package com.hugo.testebackendestagio.entities.pk;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.hugo.testebackendestagio.entities.Equipment;

@Embeddable
public class EquipmentPositionHistoryPK implements Serializable{
    private static final long serialVersionUID = 1L;
    
    @ManyToOne
    @JoinColumn(name = "equipment_id")
    private Equipment equipment;

    @Column(name = "date")
    private Date date;
    @Column(name = "lat")
    private Float lat;
    @Column(name = "lon")
    private Float lon;

    public EquipmentPositionHistoryPK() {
    }

    public EquipmentPositionHistoryPK(Equipment equipment, Date date, Float lat, Float lon) {
        this.equipment = equipment;
        this.date = date;
        this.lat = lat;
        this.lon = lon;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
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

    
}
