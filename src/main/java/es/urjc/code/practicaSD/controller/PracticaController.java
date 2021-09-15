package es.urjc.code.practicaSD.controller;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;

import es.urjc.code.practicaSD.clases.*;
import es.urjc.code.practicaSD.repositorio.*;

@RestController
public class PracticaController {

	@Autowired
	CategoriaCultivoRepository cultivoRepositorio;

	@Autowired
	EspecieRepository especieRepositorio;

	@Autowired
	PlagaRepository plagaRepositorio;

	@Autowired
	ProductoFitosanitarioRepository productoRepositorio;

	@Autowired
	SustanciaActivaRepository sustanciaRepositorio;

	@RequestMapping(value = "/cultivo", method = RequestMethod.GET)
	public List<CategoriaCultivo> getCultivo() {
		try {
			List<CategoriaCultivo> aux = cultivoRepositorio.findAll();
			return (aux);
		} catch (Exception e) {
			return null;
		}
	}

	@RequestMapping(value = "/cultivo/{cultivo}", method = RequestMethod.GET)
	public List<Especie> getEspecies(@PathVariable("cultivo") String cultivo) {

		try {
			long id = Long.parseLong(cultivo);
			List<Especie> aux = cultivoRepositorio.findById(id).getEspecies();
			return (aux);
		} catch (Exception e) {
			return null;
		}
	}

	@RequestMapping(value = "/cultivo/especie/{especie}", method = RequestMethod.GET)
	public List<Plaga> getPlagas(@PathVariable("especie") String especie) {

		try {
			long id = Long.parseLong(especie);
			List<Plaga> aux = especieRepositorio.findById(id).getPlagas();
			return (aux);
		}

		catch (Exception e) {
			return null;
		}

	}

	@RequestMapping(value = "/cultivo/sustancia/{sustancia}", method = RequestMethod.GET)
	public List<SustanciaActiva> getSustancias(@PathVariable("sustancia") String sustancia) {
		
		try {
		long id = Long.parseLong(sustancia);
		List<SustanciaActiva> aux = plagaRepositorio.findById(id).getSustanciasActivas();
		return aux;}
		
		catch(Exception e){return null;}
		
	}

	@RequestMapping(value = "/cultivo/producto/{producto}", method = RequestMethod.GET)
	public List<ProductoFitosanitario> getProductos(@PathVariable("producto") String producto) {
		
		try {
		long id = Long.parseLong(producto);
		List<ProductoFitosanitario> aux = sustanciaRepositorio.findById(id).getProductos();
		return aux;}
		catch(Exception e) {
			return null;
		}
	}

}