package com.marques.api.domain;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name="Endereco")
public class Endereco implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_ENDERECO")
    private Long idEndereco;

    @OneToOne(cascade = {CascadeType.ALL})
    private Cliente cliente;

    @Column(name = "RUA", nullable = false, length = 50)
    private String rua;

    @Column(name = "NUMERO", nullable = false, length = 10)
    private Integer numero;

    @Column(name = "BAIRRO", nullable = false, length = 20)
    private String bairro;

    @Column(name = "CEP", nullable = false, length = 12)
    private String cep;

    @Column(name = "DATA", nullable = false)
    private LocalDateTime data;

}
