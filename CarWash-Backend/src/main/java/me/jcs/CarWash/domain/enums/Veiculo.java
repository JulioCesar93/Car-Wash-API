package me.jcs.CarWash.domain.enums;

public enum Veiculo {

    FIAT_ARGO("Fiat Argo"),
    FIAT_MOBI("Fiat Mobi"),
    FIAT_UNO("Fiat Uno"),
    CHEVROLET_ONIX("Chevrolet Onix"),
    CHEVROLET_S10("Chevrolet S10"),
    CHEVROLET_CHEVETTE("Chevrolet Chevette"),
    VOLKSWAGEN_GOL("Volkswagen Gol"),
    VOLKSWAGEN_POLO("Volkswagen Polo"),
    RENAULT_KWID("Renault Kwid"),
    HYUNDAI_HB20("Hyundai HB20"),
    FIAT_PULSE("Fiat Pulse"),
    CHEVROLET_TRACKER("Chevrolet Tracker"),
    RENAULT_SANDERO("Renault Sandero"),
    VOLKSWAGEN_T_CROSS("Volkswagen T-Cross"),
    NISSAN_KICKS("Nissan Kicks"),
    HONDA_CIVIC("Honda Civic"),
    TOYOTA_COROLLA("Toyota Corolla"),
    JEEP_RENEGADE("Jeep Renegade");

    private final String nome;

    Veiculo (String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
