package model;

public class Auditorio extends Local {
    private boolean temSistemaSom;
    private boolean temTraducaoSimultanea;

    public Auditorio(String nome, int capacidadeMaxima, String bloco, boolean temSistemaSom, boolean temTraducaoSimultanea) {
        super(nome, capacidadeMaxima, bloco);
        this.temSistemaSom = temSistemaSom;
        this.temTraducaoSimultanea = temTraducaoSimultanea;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Auditório: " + getNome() + ", Sistema de Som: " + (temSistemaSom ? "Sim" : "Não") +
                ", Tradução Simultânea: " + (temTraducaoSimultanea ? "Sim" : "Não"));
    }

    public boolean isTemSistemaSom() {
        return temSistemaSom;
    }

    public void setTemSistemaSom(boolean temSistemaSom) {
        this.temSistemaSom = temSistemaSom;
    }

    public boolean isTemTraducaoSimultanea() {
        return temTraducaoSimultanea;
    }

    public void setTemTraducaoSimultanea(boolean temTraducaoSimultanea) {
        this.temTraducaoSimultanea = temTraducaoSimultanea;
    }
}
