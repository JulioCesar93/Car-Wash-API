package me.jcs.CarWash.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import me.jcs.CarWash.domain.enums.Prioridade;
import me.jcs.CarWash.domain.enums.Profissional;
import me.jcs.CarWash.domain.enums.Status;
import me.jcs.CarWash.domain.enums.TipoLavagem;
import me.jcs.CarWash.domain.enums.Veiculo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

@Entity
public class OrdemDeServico implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name= "nomeCliente_id")
    private Cliente nomeCliente;

    @ManyToOne
    @JoinColumn(name= "veiculo_id")
    private Veiculo veiculo;

    @Enumerated(EnumType.STRING)
    private TipoLavagem tipoLavagem;

    @Enumerated(EnumType.STRING)
    private Status status;

    private BigDecimal price;
    private Prioridade prioridade;

    private Profissional profissional;

    private String observacoes;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataAbertura = LocalDate.now();

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataFechamento;

    @JsonFormat(pattern = "HH:mm:ss")
    private LocalTime horarioAbertura;

    @JsonFormat(pattern = "HH:mm:ss")
    private LocalTime horarioFechamento;

    public OrdemDeServico(){
        super();
    }

    public OrdemDeServico (Integer id, Cliente nomeCliente, Veiculo veiculo, TipoLavagem tipoLavagem, BigDecimal price, Prioridade prioridade, Status status, Profissional profissional, String observacoes) {
        this.id = id;
        this.nomeCliente = nomeCliente;
        this.veiculo = veiculo;
        this.tipoLavagem = tipoLavagem;
        this.price = price;
        this.prioridade = prioridade;
        this.status = status;
        this.profissional = profissional;
        this.observacoes = observacoes;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return nomeCliente;
    }

    public void setCliente(Cliente nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public TipoLavagem getTipoLavagem() {
        return tipoLavagem;
    }

    public void setTipoLavagem(TipoLavagem tipoLavagem) {
        this.tipoLavagem = tipoLavagem;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Prioridade getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(Prioridade prioridade) {
        this.prioridade = prioridade;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Profissional getProfissional() {
        return profissional;
    }

    public void setProfissional(Profissional profissional) {
        this.profissional = profissional;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public LocalDate getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(LocalDate dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public LocalDate getDataFechamento() {
        return dataFechamento;
    }

    public void setDataFechamento(LocalDate dataFechamento) {
        this.dataFechamento = dataFechamento;
    }

    public LocalTime getHorarioAbertura() {
        return horarioAbertura;
    }

    public void setHorarioAbertura(LocalTime horarioAbertura) {
        this.horarioAbertura = horarioAbertura;
    }

    public LocalTime getHorarioFechamento() {
        return horarioFechamento;
    }

    public void setHorarioFechamento(LocalTime horarioFechamento) {
        this.horarioFechamento = horarioFechamento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrdemDeServico ordemDeServico = (OrdemDeServico) o;
        return Objects.equals(id, ordemDeServico.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}