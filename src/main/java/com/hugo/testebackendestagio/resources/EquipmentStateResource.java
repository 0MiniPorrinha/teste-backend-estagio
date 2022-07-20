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

import com.hugo.testebackendestagio.entities.EquipmentState;
import com.hugo.testebackendestagio.entities.dto.EquipmentStateDTO;
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

    @GetMapping("/{id}")
    public ResponseEntity<EquipmentState> findById(@PathVariable UUID id){
        EquipmentState equipmentState = service.findById(id);

        return ResponseEntity.ok(equipmentState);
    }

    @PostMapping
    public ResponseEntity<EquipmentState> insert(@RequestBody EquipmentStateDTO equipmentStateDTO){
        EquipmentState equipmentState = service.insert(equipmentStateDTO);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
            .path("/{id}").buildAndExpand(equipmentState.getId()).toUri();
        
        return ResponseEntity.created(uri).body(equipmentState);
    }
}
