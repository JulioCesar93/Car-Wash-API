package me.jcs.CarWash.domain.enums;

public enum Profissional {

    JULIO(1, "JULIO"),
    CESAR(0, "CESAR"),
    SILVEIRA(2, "SILVEIRA");

    private Integer codigo;
    private String descricao;

    Profissional(Integer codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }
}
