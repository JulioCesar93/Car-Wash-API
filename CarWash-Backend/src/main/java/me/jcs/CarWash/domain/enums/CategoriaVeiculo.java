package me.jcs.CarWash.domain.enums;

public enum CategoriaVeiculo {

    MOTO(0, "MOTO"),
    CARRO(1, "CARRO"),
    TRUCK(2, "TRUCK"),
    VAN(3, "VAN");

    private Integer codigo;
    private String descricao;

    CategoriaVeiculo(Integer codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }
}
