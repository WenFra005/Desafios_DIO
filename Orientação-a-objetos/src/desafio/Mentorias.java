package desafio;

import java.time.LocalDate;

public class Mentorias extends Conteudo {

   private LocalDate data;
   
    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
    return "====Mentorias====" + "\n" + 
    "Título: " + getTitulo() + "\n" +
    "Descricao: " + getDescricao() + 
    "Data: " + data;
}
    @Override
    public double calcularXp() {
        return XP_PADRAO + 20;
    }


}
