package desafio.dio.hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import desafio.dio.hospital.model.Paciente;

public interface PacienteRepository extends JpaRepository <Paciente, Long> {

}
