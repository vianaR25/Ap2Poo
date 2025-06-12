package control;

import model.*;

import java.util.HashSet;
import java.util.Set;
import java.util.Date;

public class Programa {

    public static void main(String[] args) {


        Local sala101 = new Sala("Sala 101", 30, "Bloco A", 101, true);
        Local auditorioA = new Auditorio("Auditório A", 100, "Bloco B", true, false);
        Local labInformatica = new Laboratorio("Laboratório de Informática", 20, "Bloco C", 15, "Informática");
        Local labQuimica = new Laboratorio("Laboratório de Química", 15, "Bloco D", 10, "Química");


        Instrutor instrutor1 = new Instrutor("Carlos Silva", "carlos@uni.com", "Mestre", "Programação");
        Instrutor instrutor2 = new Instrutor("Fernanda Lima", "fernanda@uni.com", "Doutora", "Matemática");
        Organizador organizador1 = new Organizador("Ana Costa", "ana@uni.com", "Coordenadora de eventos");
        Organizador organizador2 = new Organizador("Rafael Martins", "rafael@uni.com", "Responsável por inscrições");


        Participante participante1 = new Participante("Lucas Oliveira", "12345678901", "lucas@aluno.com", "Ciência da Computação");
        Participante participante2 = new Participante("Maria Fernandes", "98765432100", "maria@aluno.com", "Engenharia de Software");


        Set<Instrutor> instrutoresMinicurso1 = new HashSet<>();
        instrutoresMinicurso1.add(instrutor1);

        Set<Instrutor> instrutoresMinicurso2 = new HashSet<>();
        instrutoresMinicurso2.add(instrutor2);


        Set<String> materiaisApoioMinicurso1 = new HashSet<>();
        materiaisApoioMinicurso1.add("Material 1");
        materiaisApoioMinicurso1.add("Material 2");

        Set<String> materiaisApoioMinicurso2 = new HashSet<>();
        materiaisApoioMinicurso2.add("Guia Scrum");
        materiaisApoioMinicurso2.add("Livro de Referência");


        Evento palestra1 = new Palestra("Como Programar em Java", new Date(), 2, 500.0, sala101,
                "Roberto Santos", "roberto@empresa.com", "Empresa X");

        Evento palestra2 = new Palestra("Inteligência Artificial para Iniciantes", new Date(), 3, 800.0, auditorioA,
                "Mariana Costa", "mariana@empresa.com", "TechLabs");

        Evento minicurso1 = new MiniCurso("Introdução ao Machine Learning", new Date(), 4, 1000.0, auditorioA,
                instrutoresMinicurso1, 8, materiaisApoioMinicurso1);

        Evento minicurso2 = new MiniCurso("Desenvolvimento Ágil com Scrum", new Date(), 4, 1200.0, sala101,
                instrutoresMinicurso2, 6, materiaisApoioMinicurso2);

        Evento seminario1 = new Seminario("Tendências em IA", new Date(), 3, 0.0, labInformatica,
                "Inteligência Artificial", "Pedro Alves", "Maria Clara");

        Evento seminario2 = new Seminario("Blockchain e suas Aplicações", new Date(), 3, 0.0, labQuimica,
                "Blockchain", "Lucas Pereira", "José Antonio");


        palestra1.addParticipante(participante1);
        minicurso1.addParticipante(participante2);
        seminario1.addParticipante(participante1);
        seminario2.addParticipante(participante2);


        System.out.println("Detalhes do evento: " + palestra1.getTitulo());
        palestra1.exibirDetalhes();
        System.out.println("-------------------------------------------");
        System.out.println("Detalhes do evento: " + minicurso1.getTitulo());
        minicurso1.exibirDetalhes();
        System.out.println("-------------------------------------------");
        System.out.println("Detalhes do evento: " + seminario1.getTitulo());
        seminario1.exibirDetalhes();
        System.out.println("-------------------------------------------");
        System.out.println("Detalhes do evento: " + palestra2.getTitulo());
        palestra2.exibirDetalhes();
        System.out.println("-------------------------------------------");
        System.out.println("Detalhes do evento: " + minicurso2.getTitulo());
        minicurso2.exibirDetalhes();
        System.out.println("-------------------------------------------");
        System.out.println("Detalhes do evento: " + seminario2.getTitulo());
        seminario2.exibirDetalhes();
    }
}
