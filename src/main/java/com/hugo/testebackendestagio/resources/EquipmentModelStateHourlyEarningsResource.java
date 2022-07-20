package com.hugo.testebackendestagio.resources;

import java.net.URI;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.hugo.testebackendestagio.entities.EquipmentModelStateHourlyEarnings;
import com.hugo.testebackendestagio.entities.dto.EquipmentModelStateHourlyEarningsDTO;
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

    @GetMapping(value = "/{id_model}/{id_state}")
    public ResponseEntity<EquipmentModelStateHourlyEarnings> findById(@PathVariable UUID id_model, @PathVariable UUID id_state){
        EquipmentModelStateHourlyEarnings equipmentModelStateHourlyEarnings = service.findById(id_model, id_state);

        return ResponseEntity.ok(equipmentModelStateHourlyEarnings);
    }

    @PostMapping
    public ResponseEntity<EquipmentModelStateHourlyEarnings> insert(@RequestBody EquipmentModelStateHourlyEarningsDTO earningsDTO){
        EquipmentModelStateHourlyEarnings earnings = service.insert(earningsDTO);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
            .path("/{id}").build().toUri();

        return ResponseEntity.created(uri).body(earnings);
    }
}
