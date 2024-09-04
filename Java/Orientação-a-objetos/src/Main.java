import java.time.LocalDate;

import desafio.Bootcamp;
import desafio.Cursos;
import desafio.Devs;
import desafio.Mentorias;

public class Main {
    public static void main(String[] args) {
        Cursos curso1 = new Cursos();
        curso1.setTitulo("Linguagem Java");
        curso1.setDescricao("Aprendendo do Básico ao Avançado");
        curso1.setCargaHoraria(80);

        Cursos curso2 = new Cursos();
        curso2.setTitulo("Linguagem Python");
        curso2.setDescricao("Aprendendo do Básico ao Avançado");
        curso2.setCargaHoraria(48);

        Mentorias mentoria1 = new Mentorias();
        mentoria1.setTitulo("Como a Linguagem Java é usada nas empresas");
        mentoria1.setDescricao("Dicas de profissionais ao usar Java nas empresas");
        mentoria1.setData(LocalDate.now());
    /*
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);
    */

    Bootcamp bootcamp = new Bootcamp();
    bootcamp.setNome("Bootcamp Java Developer");
    bootcamp.setDescricao("Descubra o mundo da programação com a linguagem Java");
    bootcamp.getConteudos().add(curso1);
    bootcamp.getConteudos().add(mentoria1);
    
        Devs devWendell = new Devs();
        devWendell.setNome("Wendell");
        devWendell.increverBootcamp(bootcamp);
        devWendell.progredir();
        devWendell.progredir();

        System.out.println("-");
        System.out.println("Conteúdos Inscritos de " + devWendell.getNome() + ": " + devWendell.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos de " + devWendell.getNome() + ": " + devWendell.getConteudosConcluidos());
        System.out.println("XP: " + devWendell.calcularTotalXp());

        System.out.println("-------------");


        Devs devMarcos = new Devs();
        devMarcos.setNome("Marcos");
        devMarcos.increverBootcamp(bootcamp);

        devMarcos.progredir();
        System.out.println("-");


        System.out.println("Conteúdos Inscritos de " + devMarcos.getNome() + ": " + devMarcos.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos de " + devMarcos.getNome() + ": " + devMarcos.getConteudosConcluidos());
        System.out.println("XP: " + devMarcos.calcularTotalXp());

        System.out.println("------------");

    }
   
}
