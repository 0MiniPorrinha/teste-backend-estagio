package com.hugo.testebackendestagio.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hugo.testebackendestagio.entities.EquipmentStateHistory;
import com.hugo.testebackendestagio.services.EquipmentStateHistoryService;

@RestController
@RequestMapping(value = "/states")
public class EquipmentStateHistoryResource {
    
    @Autowired
    private EquipmentStateHistoryService service;

    @GetMapping
    public ResponseEntity<List<EquipmentStateHistory>> findAll(){
        List<EquipmentStateHistory> list = service.findAll();

        return ResponseEntity.ok(list);
    }
}
