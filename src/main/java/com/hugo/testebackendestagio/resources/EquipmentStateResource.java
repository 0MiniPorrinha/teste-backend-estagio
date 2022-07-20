package com.hugo.testebackendestagio.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hugo.testebackendestagio.entities.EquipmentState;
import com.hugo.testebackendestagio.services.EquipmentStateService;

@RestController
@RequestMapping(value = "/states")
public class EquipmentStateResource {
    
    @Autowired
    private EquipmentStateService service;

    @GetMapping
    public ResponseEntity<List<EquipmentState>> findAll(){
        List<EquipmentState> list = service.findAll();

        return ResponseEntity.ok(list);
    }
}
