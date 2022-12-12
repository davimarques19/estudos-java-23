package com.marques.api.controller;

import com.marques.api.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/cliente")
public class ClienteController {

    @Autowired
    public ClienteService service;

    @GetMapping
    public ResponseEntity obterUsuario() {
        return ResponseEntity.ok(service.obterUsuario());
    }

}
