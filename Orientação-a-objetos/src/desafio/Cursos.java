package desafio;

public class Cursos extends Conteudo {
    
    private int cargaHoraria;

    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    
    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }
    @Override
    public String toString() {
        return "====Cursos====" + "\n" + 
        "titulo: " + getTitulo() + "\n" +
        "Descriçao: " + getDescricao() + "\n" +
        "Carga Horaria: " + cargaHoraria;
    }
    
}
