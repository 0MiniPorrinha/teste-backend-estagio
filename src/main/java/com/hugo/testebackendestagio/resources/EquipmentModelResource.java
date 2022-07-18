package com.hugo.testebackendestagio.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hugo.testebackendestagio.entities.EquipmentModel;
import com.hugo.testebackendestagio.services.EquipmentModelService;

@RestController
@RequestMapping(value = "/equipmentmodel")
public class EquipmentModelResource {
    
    @Autowired
    private EquipmentModelService service;

    @GetMapping
    public ResponseEntity<List<EquipmentModel>> findAll(){
        List<EquipmentModel> list = service.findAll();
        return ResponseEntity.ok(list);
    }
}
