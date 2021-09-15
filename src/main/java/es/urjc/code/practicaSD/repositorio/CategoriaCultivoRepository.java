package es.urjc.code.practicaSD.repositorio;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import es.urjc.code.practicaSD.clases.CategoriaCultivo;

@Component
public interface CategoriaCultivoRepository extends JpaRepository<CategoriaCultivo, Long> {
	CategoriaCultivo findById(long id);
	CategoriaCultivo findByNombre(String nombre);

	
}
