package com.armazemv2.armazemv2_spring.model;

@Entity

@Table(name = "compartimento")
public class Compartimento {

    private TipoIngrediente tipoIngrediente;
    private TipoOperacao tipoOperacao;
    private Long capacidade;

    @ID
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
}
