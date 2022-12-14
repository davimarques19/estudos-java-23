package com.marques.api.domain;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name="Cliente")
public class Cliente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_CLIENTE")
    private Long id;

    @Column(name = "NOME", nullable = false, length = 100)
    private String name;

    @Column(name = "DOCUMENTO", nullable = false, length = 20)
    private String documento;

    @Column(name = "DATA", nullable = false)
    private LocalDateTime data;

    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "ID_ENDERECO")
    private Endereco endereco;

    @OneToMany(cascade = {CascadeType.ALL})
    @JoinColumn(name = "ID_CONTATO")
    private List<Contato> contatos;

}
