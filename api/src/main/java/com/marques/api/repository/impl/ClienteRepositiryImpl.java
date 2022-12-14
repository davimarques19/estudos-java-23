package com.marques.api.repository.impl;

import com.marques.api.domain.Cliente;
import com.marques.api.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ClienteRepositiryImpl {

    @Autowired
    ClienteRepository repository;

    public Object findClienteById(Long id) {

        Cliente cliente1 = new Cliente();

        cliente1.setId(1L);
        cliente1.setDocumento("12278698798");
        cliente1.setName("Davi Teste");

        return repository.findClienteById(id);
    }

    public List<Cliente> getTodosOsClientes() {
        return repository.findAll();
    }

}
