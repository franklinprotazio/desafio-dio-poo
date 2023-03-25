import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();

        curso2.setTitulo("Curso js");
        curso2.setDescricao("Descrição Curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentória de Java");
        mentoria.setDescricao("Descrição Mentória Java");
        mentoria.setData(LocalDate.now());

       /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devFranklin = new Dev();
        devFranklin.setNome("Franklin");
        devFranklin.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Franklin " + devFranklin.getConteudosInscritos());

        devFranklin.progredir();
        devFranklin.progredir();
        devFranklin.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Franklin " + devFranklin.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Franklin " + devFranklin.getConteudoConcluido());
        System.out.println("XP: " + devFranklin.calcularTotalXp());


        System.out.println("----------------------------");

        Dev devMady = new Dev();
        devMady.setNome("Mady");
        devMady.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Mady " + devMady.getConteudosInscritos());

        devMady.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Mady " + devMady.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Mady " + devMady.getConteudoConcluido());
        System.out.println("XP: " + devMady.calcularTotalXp());

    }
}