package br.com.DIO.desafio.domínio;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java ");
        curso1.setDescrição("descrição curso java: ");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso js ");
        curso2.setDescrição("descrição curso js: ");
        curso2.setCargaHoraria(4);


        Conteúdo conteudo = new Curso();
        Conteúdo conteudo1 = new Mentoria();


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Curso java ");
        mentoria.setDescrição("descrição curso java: ");
        mentoria.setData(LocalDate.now());



       /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescrição("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila" + devCamila.getConteudosInscritos());
        System.out.println("-");
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("Conteúdos Inscritos Camila" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila" + devCamila.getConteudosConluidos());
        System.out.println("XP: " + devCamila.calcularTotalXp());
        System.out.println("---------");

        Dev devJoão = new Dev();
        devJoão.setNome("João");
        devJoão.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João" + devJoão.getConteudosInscritos());
        devJoão.progredir();
        devJoão.progredir();
        devJoão.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João" + devJoão.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos João" + devJoão.getConteudosConluidos());
        System.out.println("XP: " + devJoão.calcularTotalXp());


    }

}

