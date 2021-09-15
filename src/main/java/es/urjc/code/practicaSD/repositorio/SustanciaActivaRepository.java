package es.urjc.code.practicaSD.repositorio;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import es.urjc.code.practicaSD.clases.SustanciaActiva;

@Component
public interface SustanciaActivaRepository extends JpaRepository<SustanciaActiva, Long> {
	SustanciaActiva findById(long id);
	SustanciaActiva findByNombre(String nombre);

	
}
