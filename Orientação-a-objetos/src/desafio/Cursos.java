package desafio;

public class Cursos {
    private String titulo;
    private String descricao;
    private int cargaHoraria;


    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    @Override
    public String toString() {
        return "====Cursos====" + "\n" + 
        "titulo: " + titulo + "\n" +
        "Descriçao: " + descricao + "\n" +
        "Carga Horaria: " + cargaHoraria;
    }

}
