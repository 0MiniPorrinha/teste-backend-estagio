package com.hugo.testebackendestagio.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "equipment", schema = "operation")
public class Equipment implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String name;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "equipment_model_id")
    private EquipmentModel equipmentModel;

    @OneToMany(orphanRemoval = true, cascade = CascadeType.REMOVE)
    private Set<EquipmentPositionHistory> equipmentPositionHistories = new HashSet<>();

    @OneToMany(orphanRemoval = true, cascade = CascadeType.REMOVE)
    private Set<EquipmentStateHistory> equipmentStateHistories = new HashSet<>();

    public Equipment(){
    }

    public Equipment(UUID id, String name, EquipmentModel equipmentModel) {
        this.id = id;
        this.name = name;
        this.equipmentModel = equipmentModel;
    }
    public Equipment( Equipment equipment,EquipmentModel equipmentModel){
        id = equipment.getId();
        name = equipment.getName();
        this.equipmentModel = equipmentModel;
    } 


    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        result = prime * result + ((id == null) ? 0 : id.hashCode());
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
        Equipment other = (Equipment) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }
}
