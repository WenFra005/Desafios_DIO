package desafio.dio.hospital.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotNull;

@Entity
public class Paciente extends Usuario {

    @OneToOne
    @NotNull(message = "Dados pessoais são obrigatórios.")
    private DadosPessoais dadosPessoais;

    @OneToOne
    private DadosHospitalares dadosHospitalares;

    public DadosPessoais getDadosPessoais() {
        return dadosPessoais;
    }

    public void setDadosPessoais(DadosPessoais dadosPessoais) {
        this.dadosPessoais = dadosPessoais;
    }

    public DadosHospitalares getDadosHospitalares() {
        return dadosHospitalares;
    }

    public void setDadosHospitalares(DadosHospitalares dadosHospitalares) {
        this.dadosHospitalares = dadosHospitalares;
    }


}
