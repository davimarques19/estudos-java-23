package com.marques.api.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Endereco {

    private Long id;
    private Cliente cliente;
    private String rua;
    private Integer numeroCasa;
    private String bairro;
    private String cep;

}
