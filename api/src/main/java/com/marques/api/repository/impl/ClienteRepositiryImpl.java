package com.marques.api.repository.impl;

import com.marques.api.domain.Cliente;
import com.marques.api.repository.ClienteRepository;
import org.springframework.stereotype.Repository;

@Repository
public class ClienteRepositiryImpl implements ClienteRepository {
    @Override
    public Cliente obterUsuario() {

        Cliente cliente1 = new Cliente();

        cliente1.setId(1L);
        cliente1.setDocumento("12278698798");
        cliente1.setName("Davi Teste");

        return cliente1;
    }
}
