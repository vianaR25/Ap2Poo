package model;


import java.util.Set;
import java.util.Date;
import java.util.HashSet;

public class MiniCurso extends Evento {
    private Set<Instrutor> instrutores;
    private int cargaHoraria;
    private Set<String> materiaisApoio;

    public MiniCurso(String titulo, Date data, int duracao, double orcamento, Local local,
                     Set<Instrutor> instrutores, int cargaHoraria, Set<String> materiaisApoio) {
        super(titulo, data, duracao, orcamento, local);
        this.instrutores = instrutores;
        this.cargaHoraria = cargaHoraria;
        this.materiaisApoio = materiaisApoio;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Minicurso: " + getTitulo() + ", Carga Horária: " + cargaHoraria +
                " horas, Instrutores: " + instrutores.size() + ", Materiais de Apoio: " + materiaisApoio);
    }


    public Set<Instrutor> getInstrutores() {
        return instrutores;
    }

    public void setInstrutores(Set<Instrutor> instrutores) {
        this.instrutores = instrutores;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Set<String> getMateriaisApoio() {
        return materiaisApoio;
    }

    public void setMateriaisApoio(Set<String> materiaisApoio) {
        this.materiaisApoio = materiaisApoio;
    }
}
