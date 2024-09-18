package me.jcs.CarWash.domain.enums;

public enum Profissional {

    JULIO(0, "JULIO"),
    ALBERTO(1, "CESAR"),
    AUXILIAR(2, "AUXILIAR");

    private Integer codigo;
    private String descricao;

    Profissional(Integer codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }
}