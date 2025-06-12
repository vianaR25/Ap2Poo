package model;

import java.util.HashSet;
import java.util.Set;
import java.util.Date;

public abstract class Evento {
    private String titulo;
    private Date data;
    private int duracao;
    private double orcamento;
    private Local local;
    private Set<Participante> participantes;

    public Evento(String titulo, Date data, int duracao, double orcamento, Local local) {
        this.titulo = titulo;
        this.data = data;
        this.duracao = duracao;
        this.orcamento = orcamento;
        this.local = local;
        this.participantes = new HashSet<>();
    }

    public abstract void exibirDetalhes();

    public void addParticipante(Participante participante) {
        participantes.add(participante);
    }

    public void removeParticipante(Participante participante) {
        participantes.remove(participante);
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public double getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(double orcamento) {
        this.orcamento = orcamento;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Set<Participante> getParticipantes() {
        return participantes;
    }
}
