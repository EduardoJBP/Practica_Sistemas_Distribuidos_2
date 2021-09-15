package es.urjc.code.practicaSD.clases;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class CategoriaCultivo {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id = null;
	private String nombre;
	private boolean plegado = true;
	//Creamos la relación ManyToMany con la clase especie, que estara mapeada por la variable categoriaCultivos
	@ManyToMany(mappedBy="categoriaCultivos")
	private List<Especie> especies;
	
	public CategoriaCultivo(){}
	//Generamos los constructores con los distintos getters y setters que se utilizarán para la creación de la base de datos  
	public CategoriaCultivo(String nombre, List<Especie> especies) {
		super();
		this.nombre = nombre;
		this.especies = especies;
	}

	public CategoriaCultivo(String nombre) {
		super();
		this.nombre = nombre;
		this.especies=new ArrayList<>();
		
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

	public boolean isPlegado() {
		return plegado;
	}

	public void setPlegado(boolean plegado) {
		this.plegado = plegado;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Especie> getEspecies() {
		return especies;
	}

	public void setEspecies(List<Especie> especies) {
		this.especies = especies;
	}

	@Override
	public String toString() {
		return "CategoriaCultivo id=" + id + ", nombre=" + nombre + ", especies=" + especies.toString() + "";
	}

}