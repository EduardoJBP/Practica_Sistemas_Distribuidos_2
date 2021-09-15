package es.urjc.code.practicaSD.repositorio;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import es.urjc.code.practicaSD.clases.Plaga;

@Component
public interface PlagaRepository extends JpaRepository<Plaga, Long> {
	Plaga findById (long id);
    Plaga findByNombreVulgar (String nombreVulgar);
    Plaga findByNombreCientifico (String nombreCientifico);
    Plaga findByUrl (String url);
	
}
