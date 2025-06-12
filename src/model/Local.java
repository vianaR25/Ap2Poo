package model;

public abstract class Local {

    private String nome;
    private int capacidadeMaxima;
    private String bloco;

    public Local(String nome, int capacidadeMaxima, String bloco) {
        this.nome = nome;
        this.capacidadeMaxima = capacidadeMaxima;
        this.bloco = bloco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public void setCapacidadeMaxima(int capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
    }

    public String getBloco() {
        return bloco;
    }

    public void setBloco(String bloco) {
        this.bloco = bloco;
    }

    public abstract void exibirDetalhes();
}
