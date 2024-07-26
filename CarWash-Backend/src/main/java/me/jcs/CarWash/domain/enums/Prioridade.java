package me.jcs.CarWash.domain.enums;

public enum Prioridade {

    BAIXA(0, "BAIXA"), 
    MEDIA(1, "MEDIA"), 
    ALTA(2, "ALTA");

    private Integer codigo;
    private String descricao;

    Prioridade(Integer codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }
}