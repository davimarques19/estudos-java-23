package com.marques.api.service;

import com.marques.api.domain.Cliente;
import com.marques.api.repository.ClienteRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class ClienteService {

    @Autowired
    private ClienteRepository repository;

    public Cliente obterUsuario() {
        return repository.obterUsuario();

    }

}
