package es.urjc.code.practicaSD.clases;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;

@Entity
public class ProductoFitosanitario {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id = null;
	
    private String nombre; 
    private String url; 
    @JsonIgnore
    @ManyToMany
    private List<SustanciaActiva> sustancias;

	//Generamos los constructores con los distintos getters y setters que se utilizarán para la creación de la base de datos  
    public ProductoFitosanitario(){}

	public ProductoFitosanitario(String nombre, String url, List<SustanciaActiva> sustancias) {
		super();
		this.nombre = nombre;
		this.url = url;
		this.sustancias = sustancias;
	}
	public ProductoFitosanitario(String nombre, String url) {
		
		
		this.nombre = nombre;
		this.url = url;
		this.sustancias = new ArrayList<>();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public List<SustanciaActiva> getSustancias() {
		
		return sustancias;
	}

	public void setSustancias(List<SustanciaActiva> sustancias) {
		this.sustancias = sustancias;
	}

	@Override
	public String toString() {
		return "ProductoFitosanitario id=" + id + ", nombre=" + nombre + ", url=" + url 
				+ "";
	}



}