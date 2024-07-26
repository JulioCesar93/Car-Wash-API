package me.jcs.CarWash.domain;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Integer id;

    protected String veiculo;

    @Column(unique = true)
    protected String placa;
    protected String cor;
    protected CategoriaVeiculo categoriaVeiculo;
}
