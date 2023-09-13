package me.dio.challenge.controller;

import me.dio.challenge.model.Smartphone;
import me.dio.challenge.service.Smartphone.SmartphoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/smartphone")
public class SmartphoneController {

    @Autowired
    SmartphoneService service;
    @PostMapping
    public ResponseEntity<Smartphone> criarSmartphone(@RequestBody Smartphone request) {
         Smartphone smartphone = service.criar(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(smartphone);
    }

}
