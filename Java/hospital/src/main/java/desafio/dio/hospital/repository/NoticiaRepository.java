package desafio.dio.hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import desafio.dio.hospital.model.Noticia;

public interface NoticiaRepository extends JpaRepository<Noticia, Long>{
}
