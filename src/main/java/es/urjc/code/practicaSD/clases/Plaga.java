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
public class Plaga {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id = null;
	private boolean plegado = true;
	private String nombreVulgar;
	private String nombreCientifico;
	private String url; 
	@JsonIgnore
	@ManyToMany
	private List<Especie> especies;
	//Mapeamos la lista sustanciaActiva con la variable plagas
	@ManyToMany (mappedBy="plagas")
	private List<SustanciaActiva> sustanciasActivas;
	//Generamos los constructores con los distintos getters y setters que se utilizarán para la creación de la base de datos  
	public Plaga () {}

	public Plaga(String nombreVulgar, String nombreCientifico, String url, List<Especie> especies,
			List<SustanciaActiva> sustanciasActivas) {
		super();
		this.nombreVulgar = nombreVulgar;
		this.nombreCientifico = nombreCientifico;
		this.url = url;
		this.especies = especies;
		this.sustanciasActivas = sustanciasActivas;
	}

	public Plaga(String nombreVulgar, String nombreCientifico, String url) {
        super();
        this.nombreVulgar = nombreVulgar;
        this.nombreCientifico = nombreCientifico;
        this.url = url;
        this.especies = new ArrayList<>();
        this.sustanciasActivas = new ArrayList<>();
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

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public List<Especie> getEspecies() {
		return especies;
	}

	public void setEspecies(List<Especie> especies) {
		this.especies = especies;
	}

	public boolean isPlegado() {
		return plegado;
	}

	public void setPlegado(boolean plegado) {
		this.plegado = plegado;
	}

	public List<SustanciaActiva> getSustanciasActivas() {
		return sustanciasActivas;
	}


	public void setSustanciasActivas(List<SustanciaActiva> sustanciasActivas) {
		this.sustanciasActivas = sustanciasActivas;
	}

	@Override
	public String toString() {
		return "Plaga [id=" + id + ", nombreVulgar=" + nombreVulgar + ", nombreCientifico=" + nombreCientifico
				+ ", url=" + url  + ", sustanciasActivas=" + sustanciasActivas.toString()  + "]";
	}
	
	
	
}