package model;
import java.util.Date;

public class Seminario extends Evento {
    private String tema;
    private String alunoApresentador;
    private String orientador;

    public Seminario(String titulo, Date data, int duracao, double orcamento, Local local,
                     String tema, String alunoApresentador, String orientador) {
        super(titulo, data, duracao, orcamento, local);
        this.tema = tema;
        this.alunoApresentador = alunoApresentador;
        this.orientador = orientador;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Seminário: " + getTitulo() + ", Tema: " + tema + ", Aluno Apresentador: " + alunoApresentador +
                ", Orientador: " + orientador + ", Duração: " + getDuracao() + " horas");
    }

    // Getters e Setters
    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getAlunoApresentador() {
        return alunoApresentador;
    }

    public void setAlunoApresentador(String alunoApresentador) {
        this.alunoApresentador = alunoApresentador;
    }

    public String getOrientador() {
        return orientador;
    }

    public void setOrientador(String orientador) {
        this.orientador = orientador;
    }
}
