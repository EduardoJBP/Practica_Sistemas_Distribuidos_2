package es.urjc.code.practicaSD.repositorio;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import es.urjc.code.practicaSD.clases.Especie;

@Component
public interface EspecieRepository extends JpaRepository<Especie, Long> {
	Especie findById(long id);
	Especie findByNombreVulgar(String nombreVulgar);
	Especie findByNombreCientifico(String nombreCientifico);
	
}
