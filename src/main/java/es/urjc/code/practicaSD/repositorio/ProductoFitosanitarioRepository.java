package es.urjc.code.practicaSD.repositorio;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import es.urjc.code.practicaSD.clases.ProductoFitosanitario;

@Component
public interface ProductoFitosanitarioRepository extends JpaRepository<ProductoFitosanitario, Long> {
	ProductoFitosanitario findById(long id);
	ProductoFitosanitario findByNombre(String nombre);
	ProductoFitosanitario findByUrl(String url);
	
}
