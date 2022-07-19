package com.hugo.testebackendestagio.resources;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hugo.testebackendestagio.entities.EquipmentPositionHistory;
import com.hugo.testebackendestagio.services.EquipmentPositionHistoryService;

@RestController
@RequestMapping(value = "/positions")
public class EquipmentPositionHistoryResource {
    
    @Autowired
    private EquipmentPositionHistoryService service;

    @GetMapping
    public ResponseEntity<List<EquipmentPositionHistory>> findAll(){
        List<EquipmentPositionHistory> list = service.findAll();
        return ResponseEntity.ok(list);
    }

    @GetMapping(value = "/{id_equip}")
    public ResponseEntity<EquipmentPositionHistory> findById(@PathVariable UUID id_equip){
        EquipmentPositionHistory equipmentPositionHistory = service.findById(id_equip);
        return ResponseEntity.ok(equipmentPositionHistory);
    }

    @GetMapping(value = "/test/{id_equip}")
    public ResponseEntity<List<EquipmentPositionHistory>> findAllById(@PathVariable UUID id_equip){
        List<EquipmentPositionHistory> list = service.findAllById(id_equip);
        return ResponseEntity.ok(list);
    }
}
