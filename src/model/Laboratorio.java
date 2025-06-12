package model;

public class Laboratorio extends Local {
    private int numeroComputadores;
    private String tipoLaboratorio;

    public Laboratorio(String nome, int capacidadeMaxima, String bloco, int numeroComputadores, String tipoLaboratorio) {
        super(nome, capacidadeMaxima, bloco);
        this.numeroComputadores = numeroComputadores;
        this.tipoLaboratorio = tipoLaboratorio;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Laboratório: " + getNome() + ", Computadores: " + numeroComputadores +
                ", Tipo: " + tipoLaboratorio);
    }

    public int getNumeroComputadores() {
        return numeroComputadores;
    }

    public void setNumeroComputadores(int numeroComputadores) {
        this.numeroComputadores = numeroComputadores;
    }

    public String getTipoLaboratorio() {
        return tipoLaboratorio;
    }

    public void setTipoLaboratorio(String tipoLaboratorio) {
        this.tipoLaboratorio = tipoLaboratorio;
    }
}
