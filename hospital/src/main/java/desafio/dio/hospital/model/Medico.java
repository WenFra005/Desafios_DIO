package desafio.dio.hospital.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotNull;

@Entity
public class Medico extends Usuario {

    @OneToOne
    @NotNull(message = "Dados profissionais são obrigatórios.")
    private DadosProfissionais dadosProfissionais;

    public DadosProfissionais getDadosProfissionais() {
        return dadosProfissionais;
    }

    public void setDadosProfissionais(DadosProfissionais dadosProfissionais) {
        this.dadosProfissionais = dadosProfissionais;
    }


}
