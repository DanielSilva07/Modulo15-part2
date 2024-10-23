package com.daniel.silva.cadastro_de_memes.entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table
public class Meme {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String descricao;

    @Column(nullable = false)
    private String categoria;

    @JoinColumn(name = "usuario" , nullable = false)
    private String usuario;

    private String dataDeCadastro;

    private String url;

}
