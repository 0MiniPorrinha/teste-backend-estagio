package com.hugo.testebackendestagio.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hugo.testebackendestagio.entities.EquipmentModelStateHourlyEarnings;
import com.hugo.testebackendestagio.services.EquipmentModelStateHourlyEarningsService;

@RestController
@RequestMapping(value = "/hourlyearnings")
public class EquipmentModelStateHourlyEarningsResource {
    
    @Autowired
    private EquipmentModelStateHourlyEarningsService service;

    @GetMapping
    public ResponseEntity<List<EquipmentModelStateHourlyEarnings>> findAll(){
        List<EquipmentModelStateHourlyEarnings> list = service.findAll();

        return ResponseEntity.ok(list);
    }
}
