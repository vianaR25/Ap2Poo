package model;

public class Sala extends Local {
    private int numeroSala;
    private boolean temMultimidia;

    public Sala(String nome, int capacidadeMaxima, String bloco, int numeroSala, boolean temMultimidia) {
        super(nome, capacidadeMaxima, bloco);
        this.numeroSala = numeroSala;
        this.temMultimidia = temMultimidia;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Sala: " + getNome() + ", Número: " + numeroSala + ", Multimídia: " + (temMultimidia ? "Sim" : "Não"));
    }

    public int getNumeroSala() {
        return numeroSala;
    }

    public void setNumeroSala(int numeroSala) {
        this.numeroSala = numeroSala;
    }

    public boolean isTemMultimidia() {
        return temMultimidia;
    }

    public void setTemMultimidia(boolean temMultimidia) {
        this.temMultimidia = temMultimidia;
    }
}
