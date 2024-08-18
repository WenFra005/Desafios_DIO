package desafio.dio.hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import desafio.dio.hospital.model.Medico;

public interface MedicoRepository extends JpaRepository<Medico, Long> {

}
