package es.urjc.code.practicaSD.clases;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;

@Entity
public class SustanciaActiva {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id = null;
	private boolean plegado = true;
	private String nombre; 
	@JsonIgnore
	@ManyToMany 
	private List<Plaga> plagas;
	//Mapeamos la lista productos con la variable sustancias
	@ManyToMany(mappedBy="sustancias")
	private List<ProductoFitosanitario> productos;
	
	//Generamos los constructores con los distintos getters y setters que se utilizarán para la creación de la base de datos  
	public SustanciaActiva() {}

	public SustanciaActiva(String nombre, List<Plaga> plagas, List<ProductoFitosanitario> productos) {
		super();
		this.nombre = nombre;
		this.plagas = plagas;
		this.productos = productos;
	}
	
	
	public SustanciaActiva(String nombre) {
		super();
		this.nombre = nombre;
		this.plagas = new ArrayList<>();
		this.productos = new ArrayList<>();
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

	public List<Plaga> getPlagas() {
		return plagas;
	}


	public void setPlagas(List<Plaga> plagas) {
		this.plagas = plagas;
	}

	public boolean isPlegado() {
		return plegado;
	}

	public void setPlegado(boolean plegado) {
		this.plegado = plegado;
	}

	public List<ProductoFitosanitario> getProductos() {
		return productos;
	}

	public void setProductos(List<ProductoFitosanitario> productos) {
		this.productos = productos;
	}

	@Override
	public String toString() {
		return "SustanciaActiva id=" + id + ", nombre=" + nombre  + ""+", productos="+productos.toString();
	}
	
	
	
}