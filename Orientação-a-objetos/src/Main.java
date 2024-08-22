import java.time.LocalDate;

import desafio.Cursos;
import desafio.Mentorias;

public class Main {
    public static void main(String[] args) {
        Cursos curso1 = new Cursos();
        curso1.setTitulo("Linguagem Java");
        curso1.setDescricao("Aprendendo do Básico ao Avançado");
        curso1.setCargaHoraria(80);
        System.out.println(curso1);

        Cursos curso2 = new Cursos();
        curso2.setTitulo("Linguagem Python");
        curso2.setDescricao("Aprendendo do Básico ao Avançado");
        curso2.setCargaHoraria(48);
        System.out.println(curso2);

        Mentorias mentoria1 = new Mentorias();
        mentoria1.setTitulo("Como a Linguagem Java é usada nas empresas");
        mentoria1.setDescricao("Dicas de profissionais ao usar Java nas empresas");
        mentoria1.setData(LocalDate.now());
        System.out.println(mentoria1);
    }
   
}
