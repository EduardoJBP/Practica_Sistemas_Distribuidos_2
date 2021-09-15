package es.urjc.code.practicaSD.clases;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
public class Especie {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id = null;
	private boolean plegado = true;
	private String nombreVulgar;
	private String nombreCientifico;
	//Con JsonIgnore ignoramos el objeto json a la hora de escribirlo
	//Generamos la lista de categoria cultivo con el nombre de la variable elegida en la clase categoriaCultivo
	@JsonIgnore
	@ManyToMany
	private List<CategoriaCultivo> categoriaCultivos;
	//Mapeamos la lista plagas con la variable especies
	@ManyToMany(mappedBy="especies")
	private List<Plaga> plagas;
	//Generamos los constructores con los distintos getters y setters que se utilizarán para la creación de la base de datos  
	public Especie () {}
	
	public Especie(String nombreVulgar, String nombreCientifico, List<CategoriaCultivo> categoriaCultivos,
			List<Plaga> plagas) {
		super();
		this.nombreVulgar = nombreVulgar;
		this.nombreCientifico = nombreCientifico;
		this.categoriaCultivos = categoriaCultivos;
		this.plagas = plagas;
	}
	
	public Especie(String nombreVulgar, String nombreCientifico) {
		super();
		this.nombreVulgar = nombreVulgar;
		this.nombreCientifico = nombreCientifico;
		this.categoriaCultivos = new ArrayList<>();
		this.plagas = new ArrayList<>();
	}
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombreVulgar() {
		return nombreVulgar;
	}

	public void setNombreVulgar(String nombreVulgar) {
		this.nombreVulgar = nombreVulgar;
	}

	public String getNombreCientifico() {
		return nombreCientifico;
	}

	public void setNombreCientifico(String nombreCientifico) {
		this.nombreCientifico = nombreCientifico;
	}

	public List<CategoriaCultivo> getCategoriaCultivos() {
		return categoriaCultivos;
	}


	public void setCategoriaCultivos(List<CategoriaCultivo> categoriaCultivos) {
		this.categoriaCultivos = categoriaCultivos;
	}

	public boolean isPlegado() {
		return plegado;
	}

	public void setPlegado(boolean plegado) {
		this.plegado = plegado;
	}

	public List<Plaga> getPlagas() {
		return plagas;
	}

	public void setPlagas(List<Plaga> plagas) {
		this.plagas = plagas;
	}

	@Override
	public String toString() {
		return "Especie [id=" + id + ", nombreVulgar=" + nombreVulgar + ", nombreCientifico=" + nombreCientifico
				 + ", plagas=" + plagas.toString() + "]";
	}
	
	
}