package desafio.dio.hospital.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class DadosHospitalares {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String numeroPronturio;
    private String alergias;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNumeroPronturio() {
        return numeroPronturio;
    }
    public void setNumeroPronturio(String numeroPronturio) {
        this.numeroPronturio = numeroPronturio;
    }
    public String getAlergias() {
        return alergias;
    }
    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }
}
