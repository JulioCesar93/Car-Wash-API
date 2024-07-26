package me.jcs.CarWash.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import me.jcs.CarWash.domain.enums.Prioridade;
import me.jcs.CarWash.domain.enums.Profissional;
import me.jcs.CarWash.domain.enums.Status;
import me.jcs.CarWash.domain.enums.TipoLavagem;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class OrdemDeServico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private TipoLavagem tipoLavagem;
    private BigDecimal price;
    private Prioridade prioridade;
    private Status status;
    private String veiculo;

    @ManyToOne
    @JoinColumn(name= "profissional_id")
    private Profissional profissional;

    private String observações;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataAbertura = LocalDate.now();
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataFechamento;

    @JsonFormat(pattern = "HH:mm:ss")
    private LocalTime horarioAbertura;
    @JsonFormat(pattern = "HH:mm:ss")
    private LocalTime horarioFechamento;
}
