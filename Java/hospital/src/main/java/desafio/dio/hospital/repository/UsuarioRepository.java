package desafio.dio.hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import desafio.dio.hospital.model.Usuario;

public interface UsuarioRepository extends JpaRepository <Usuario, Long> {

}
