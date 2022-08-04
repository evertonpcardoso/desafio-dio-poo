package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso();

        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();

        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Carlos");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdo Inscritos Carlos: " + dev1.getConteudosInscritos());
        dev1.progredir();
        System.out.println("Conteúdo Concluidos Carlos: " + dev1.getConteudosConcluidos());
        System.out.println("Conteúdo Inscritos Carlos: " + dev1.getConteudosInscritos());
        System.out.println("XP:" + dev1.calcularTotalXP());

        Dev dev2 = new Dev();
        dev2.setNome("Juca Toledo");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdo Inscritos Juca Toledo: " + dev2.getConteudosInscritos());
        dev2.progredir();
        System.out.println("Conteúdo Concluidos Juca Toledo:" + dev2.getConteudosConcluidos());
        System.out.println("Conteúdo Inscritos Juca Toledo: " + dev2.getConteudosInscritos());
        System.out.println("XP:" + dev2.calcularTotalXP());

    }

}
