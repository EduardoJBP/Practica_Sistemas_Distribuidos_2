package es.urjc.code.practicaSD;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import es.urjc.code.practicaSD.clases.CategoriaCultivo;
import es.urjc.code.practicaSD.clases.Especie;
import es.urjc.code.practicaSD.clases.Plaga;
import es.urjc.code.practicaSD.clases.ProductoFitosanitario;
import es.urjc.code.practicaSD.clases.SustanciaActiva;
import es.urjc.code.practicaSD.repositorio.CategoriaCultivoRepository;
import es.urjc.code.practicaSD.repositorio.EspecieRepository;
import es.urjc.code.practicaSD.repositorio.PlagaRepository;
import es.urjc.code.practicaSD.repositorio.ProductoFitosanitarioRepository;
import es.urjc.code.practicaSD.repositorio.SustanciaActivaRepository;


@Component
public class BasedeDatos {
	@Autowired
	EspecieRepository especieRepositorio;

	@Autowired
	PlagaRepository plagaRepositorio;

	@Autowired
	ProductoFitosanitarioRepository productoRepositorio;

	@Autowired
	SustanciaActivaRepository sustanciaRepositorio;
	
	@Autowired
	CategoriaCultivoRepository categoriaCultivoRepositorio;

	@PostConstruct
	public void init() {

		//CULTIVOS
		CategoriaCultivo cultivo1 = new CategoriaCultivo("CultivoA");
		CategoriaCultivo cultivo2 = new CategoriaCultivo("CultivoB");
        CategoriaCultivo cultivo3 = new CategoriaCultivo("CultivoC");
        CategoriaCultivo cultivo4 = new CategoriaCultivo("CultivoD");
        
        //ESPECIES
		Especie especie1 = new Especie("EspecieVulgar1", "EspecieCientifico1");
		Especie especie2 = new Especie("EspecieVulgar2", "EspecieCientifico2");
		Especie especie3 = new Especie("EspecieVulgar3", "EspecieCientifico3");
		Especie especie4 = new Especie("EspecieVulgar4", "EspecieCientifico4");
		Especie especie5 = new Especie("EspecieVulgar5", "EspecieCientifico5");
		Especie especie6 = new Especie("EspecieVulgar6", "EspecieCientifico6");
		Especie especie7 = new Especie("EspecieVulgar7", "EspecieCientifico7");
		Especie especie8 = new Especie("EspecieVulgar8", "EspecieCientifico8");
		
		//PLAGAS
		Plaga plaga1 = new Plaga("PlagaVulgar1", "PlagaCientifico1", "urlplaga1");
		Plaga plaga2 = new Plaga("PlagaVulgar2", "PlagaCientifico2", "urlplaga2");
		Plaga plaga3 = new Plaga("PlagaVulgar3", "PlagaCientifico3", "urlplaga3");
		Plaga plaga4 = new Plaga("PlagaVulgar4", "PlagaCientifico4", "urlplaga4");
		Plaga plaga5 = new Plaga("PlagaVulgar5", "PlagaCientifico5", "urlplaga5");
		Plaga plaga6 = new Plaga("PlagaVulgar6", "PlagaCientifico6", "urlplaga6");
		Plaga plaga7 = new Plaga("PlagaVulgar7", "PlagaCientifico7", "urlplaga7");
		Plaga plaga8 = new Plaga("PlagaVulgar8", "PlagaCientifico8", "urlplaga8");
		Plaga plaga9 = new Plaga("PlagaVulgar9", "PlagaCientifico9", "urlplaga9");
		Plaga plaga10 = new Plaga("PlagaVulgar10", "PlagaCientifico10", "urlplaga10");
		Plaga plaga11 = new Plaga("PlagaVulgar11", "PlagaCientifico11", "urlplaga11");
		Plaga plaga12 = new Plaga("PlagaVulgar12", "PlagaCientifico12", "urlplaga12");
		Plaga plaga13 = new Plaga("PlagaVulgar13", "PlagaCientifico13", "urlplaga13");
		Plaga plaga14 = new Plaga("PlagaVulgar14", "PlagaCientifico14", "urlplaga14");
		Plaga plaga15 = new Plaga("PlagaVulgar15", "PlagaCientifico15", "urlplaga15");
		Plaga plaga16 = new Plaga("PlagaVulgar16", "PlagaCientifico16", "urlplaga16");
		
		//SUSTANCIAS ACTIVAS
		SustanciaActiva sustancia1 = new SustanciaActiva("NombreSustancia1");
		SustanciaActiva sustancia2 = new SustanciaActiva("NombreSustancia2");
		SustanciaActiva sustancia3 = new SustanciaActiva("NombreSustancia3");
		SustanciaActiva sustancia4 = new SustanciaActiva("NombreSustancia4");
		SustanciaActiva sustancia5 = new SustanciaActiva("NombreSustancia5");
		SustanciaActiva sustancia6 = new SustanciaActiva("NombreSustancia6");
		SustanciaActiva sustancia7 = new SustanciaActiva("NombreSustancia7");
		SustanciaActiva sustancia8 = new SustanciaActiva("NombreSustancia8");
		SustanciaActiva sustancia9 = new SustanciaActiva("NombreSustancia9");
		SustanciaActiva sustancia10 = new SustanciaActiva("NombreSustancia10");
		SustanciaActiva sustancia11 = new SustanciaActiva("NombreSustancia11");
		SustanciaActiva sustancia12 = new SustanciaActiva("NombreSustancia12");
		SustanciaActiva sustancia13 = new SustanciaActiva("NombreSustancia13");
		SustanciaActiva sustancia14 = new SustanciaActiva("NombreSustancia14");
		SustanciaActiva sustancia15 = new SustanciaActiva("NombreSustancia15");
		SustanciaActiva sustancia16 = new SustanciaActiva("NombreSustancia16");
		SustanciaActiva sustancia17 = new SustanciaActiva("NombreSustancia17");
		SustanciaActiva sustancia18 = new SustanciaActiva("NombreSustancia18");
		SustanciaActiva sustancia19 = new SustanciaActiva("NombreSustancia19");
		SustanciaActiva sustancia20 = new SustanciaActiva("NombreSustancia20");
		
		//PRODUCTOS FITOSANITARIOS
		ProductoFitosanitario producto1 = new ProductoFitosanitario("NombreProducto1", "urlproducto1");
		ProductoFitosanitario producto2 = new ProductoFitosanitario("NombreProducto2", "urlproducto2");
		ProductoFitosanitario producto3 = new ProductoFitosanitario("NombreProducto3", "urlproducto3");
		ProductoFitosanitario producto4 = new ProductoFitosanitario("NombreProducto4", "urlproducto4");
		ProductoFitosanitario producto5 = new ProductoFitosanitario("NombreProducto5", "urlproducto5");
		ProductoFitosanitario producto6 = new ProductoFitosanitario("NombreProducto6", "urlproducto6");
		ProductoFitosanitario producto7 = new ProductoFitosanitario("NombreProducto7", "urlproducto7");
		ProductoFitosanitario producto8 = new ProductoFitosanitario("NombreProducto8", "urlproducto8");
		ProductoFitosanitario producto9 = new ProductoFitosanitario("NombreProducto9", "urlproducto9");
		ProductoFitosanitario producto10 = new ProductoFitosanitario("NombreProducto10", "urlproducto10");
		ProductoFitosanitario producto11 = new ProductoFitosanitario("NombreProducto11", "urlproducto11");
		ProductoFitosanitario producto12 = new ProductoFitosanitario("NombreProducto12", "urlproducto12");
		ProductoFitosanitario producto13 = new ProductoFitosanitario("NombreProducto13", "urlproducto13");
		ProductoFitosanitario producto14 = new ProductoFitosanitario("NombreProducto14", "urlproducto14");
		ProductoFitosanitario producto15 = new ProductoFitosanitario("NombreProducto15", "urlproducto15");
		ProductoFitosanitario producto16 = new ProductoFitosanitario("NombreProducto16", "urlproducto16");
		ProductoFitosanitario producto17 = new ProductoFitosanitario("NombreProducto17", "urlproducto17");
		ProductoFitosanitario producto18 = new ProductoFitosanitario("NombreProducto18", "urlproducto18");
		ProductoFitosanitario producto19 = new ProductoFitosanitario("NombreProducto19", "urlproducto19");
		ProductoFitosanitario producto20 = new ProductoFitosanitario("NombreProducto20", "urlproducto20");
		ProductoFitosanitario producto21 = new ProductoFitosanitario("NombreProducto21", "urlproducto21");
		ProductoFitosanitario producto22 = new ProductoFitosanitario("NombreProducto22", "urlproducto22");
		ProductoFitosanitario producto23 = new ProductoFitosanitario("NombreProducto23", "urlproducto23");
		ProductoFitosanitario producto24 = new ProductoFitosanitario("NombreProducto24", "urlproducto24");
		ProductoFitosanitario producto25 = new ProductoFitosanitario("NombreProducto25", "urlproducto25");
		ProductoFitosanitario producto26 = new ProductoFitosanitario("NombreProducto26", "urlproducto26");
		ProductoFitosanitario producto27 = new ProductoFitosanitario("NombreProducto27", "urlproducto27");
		ProductoFitosanitario producto28 = new ProductoFitosanitario("NombreProducto28", "urlproducto28");
		ProductoFitosanitario producto29 = new ProductoFitosanitario("NombreProducto29", "urlproducto29");
		ProductoFitosanitario producto30 = new ProductoFitosanitario("NombreProducto30", "urlproducto30");
	
		//////////////////////////////////////////////////////////////////////
		
		//LISTAS DE CADA UNO DE LOS OBJETOS
		
		//CATEGORIAS Y ESPECIES
		//Al menos una de ellas debera pertenecer a dos o mas categorías.
		//En nuestro caso, la especie 1 pertenece a dos categorías de cultivo
		
		especie1.getCategoriaCultivos().add(cultivo1);
		especie2.getCategoriaCultivos().add(cultivo1);
		especie3.getCategoriaCultivos().add(cultivo1);
		especie4.getCategoriaCultivos().add(cultivo1);
		especie1.getCategoriaCultivos().add(cultivo2);
		especie5.getCategoriaCultivos().add(cultivo2);
		especie6.getCategoriaCultivos().add(cultivo3);
		especie7.getCategoriaCultivos().add(cultivo3);
		especie8.getCategoriaCultivos().add(cultivo4);
		
		//ESPECIES Y PLAGAS
		//Al menos una plaga debera afectar a 3 especies diferentes, y dos plagas a al menos dos especies diferentes.
		//La plaga1 afecta a las especies 1,2 y 3, y las plagas 2 y 3 afectan
		//a las especies 1 y 2.
		plaga1.getEspecies().add(especie1);
		plaga2.getEspecies().add(especie1);
		plaga3.getEspecies().add(especie1);
		
		plaga1.getEspecies().add(especie2);
		plaga2.getEspecies().add(especie2);
		plaga3.getEspecies().add(especie2);
		plaga4.getEspecies().add(especie2);
		plaga5.getEspecies().add(especie2);
		
		plaga1.getEspecies().add(especie3);
		plaga6.getEspecies().add(especie3);
		plaga7.getEspecies().add(especie3);

		plaga8.getEspecies().add(especie4);
		plaga9.getEspecies().add(especie4);

		plaga10.getEspecies().add(especie5);
		plaga11.getEspecies().add(especie5);
		plaga12.getEspecies().add(especie5);
		plaga13.getEspecies().add(especie5);
		
		plaga14.getEspecies().add(especie6);
		plaga15.getEspecies().add(especie6);
		
		//PLAGAS Y SUSTANCIAS
		// Al menos dos sustancias deberan ser aplicables a 3 plagas diferentes, y 4 sustancias a al menos dos plagas diferentes.
		//Las sustancia 1 y 2 afectan a cuatro plagas distintas cada una
		//en el caso de la sustancia 1,  a las plagas 1,2 y 3, y en el de
		//la segunda a las plagas 1,4 y 5. 
		//Las sustancias 3,4,5 y 6 afectan todas ellas a al menos dos plagas diferentes.
		sustancia1.getPlagas().add(plaga1);
		sustancia1.getPlagas().add(plaga2);
		sustancia1.getPlagas().add(plaga3);
		sustancia2.getPlagas().add(plaga1);
		sustancia2.getPlagas().add(plaga4);
		sustancia2.getPlagas().add(plaga5);
		sustancia3.getPlagas().add(plaga4);
		sustancia3.getPlagas().add(plaga2);
		sustancia3.getPlagas().add(plaga7);
		sustancia3.getPlagas().add(plaga8);
		sustancia4.getPlagas().add(plaga3);
		sustancia4.getPlagas().add(plaga9);
		sustancia4.getPlagas().add(plaga10);
		sustancia5.getPlagas().add(plaga1);
		sustancia5.getPlagas().add(plaga5);
		sustancia5.getPlagas().add(plaga8);
		sustancia5.getPlagas().add(plaga11);
		sustancia5.getPlagas().add(plaga12);
		sustancia6.getPlagas().add(plaga13);
		sustancia6.getPlagas().add(plaga14);
		sustancia7.getPlagas().add(plaga15);
		sustancia8.getPlagas().add(plaga16);
		sustancia9.getPlagas().add(plaga16);
		sustancia10.getPlagas().add(plaga16);
		sustancia11.getPlagas().add(plaga16);
		sustancia12.getPlagas().add(plaga16);
		sustancia13.getPlagas().add(plaga16);
		sustancia14.getPlagas().add(plaga16);
		sustancia15.getPlagas().add(plaga16);
		sustancia16.getPlagas().add(plaga16);
		sustancia17.getPlagas().add(plaga16);
		sustancia18.getPlagas().add(plaga16);
		sustancia19.getPlagas().add(plaga16);
		sustancia20.getPlagas().add(plaga16);
		
		//SUSTANCIAS Y PRODUCTOS
		//Al menos 5 productos deberan contener al menos 2 sustancias activas diferentes.
		//Los productos 1,2,3,4,5 y 6 afectan a al menos 2 sustancias diferentes cada una.
		producto1.getSustancias().add(sustancia1);
		producto1.getSustancias().add(sustancia2);
		producto1.getSustancias().add(sustancia3);
		producto1.getSustancias().add(sustancia4);
		producto1.getSustancias().add(sustancia5);
		producto2.getSustancias().add(sustancia1);
		producto2.getSustancias().add(sustancia6);
		producto2.getSustancias().add(sustancia7);
		producto2.getSustancias().add(sustancia8);
		producto2.getSustancias().add(sustancia9);
		producto2.getSustancias().add(sustancia10);
		producto3.getSustancias().add(sustancia3);
		producto3.getSustancias().add(sustancia11);
		producto3.getSustancias().add(sustancia12);
		producto4.getSustancias().add(sustancia4);
		producto4.getSustancias().add(sustancia13);
		producto4.getSustancias().add(sustancia14);
		producto5.getSustancias().add(sustancia5);
		producto5.getSustancias().add(sustancia15);
		producto5.getSustancias().add(sustancia16);
		producto6.getSustancias().add(sustancia7);
		producto6.getSustancias().add(sustancia8);
		producto6.getSustancias().add(sustancia20);
		producto7.getSustancias().add(sustancia7);
		producto8.getSustancias().add(sustancia5);
		producto9.getSustancias().add(sustancia18);
		producto10.getSustancias().add(sustancia12);
		producto11.getSustancias().add(sustancia7);
		producto12.getSustancias().add(sustancia8);
		producto13.getSustancias().add(sustancia14);
		producto14.getSustancias().add(sustancia16);
		producto15.getSustancias().add(sustancia19);
		producto16.getSustancias().add(sustancia8);
		producto17.getSustancias().add(sustancia9);
		producto18.getSustancias().add(sustancia10);
		producto19.getSustancias().add(sustancia4);
		producto20.getSustancias().add(sustancia1);
		producto21.getSustancias().add(sustancia6);
		producto22.getSustancias().add(sustancia16);
		producto23.getSustancias().add(sustancia3);
		producto24.getSustancias().add(sustancia8);
		producto25.getSustancias().add(sustancia9);
		producto26.getSustancias().add(sustancia13);
		producto27.getSustancias().add(sustancia15);
		producto28.getSustancias().add(sustancia18);
		producto29.getSustancias().add(sustancia8);
		producto30.getSustancias().add(sustancia7);
		
		


		/////////////////////////////////////////////////
		
		//GUARDAR EN REPOSITORIO TODOS LOS OBJETOS
		categoriaCultivoRepositorio.save(cultivo1);
		categoriaCultivoRepositorio.save(cultivo2);
		categoriaCultivoRepositorio.save(cultivo3);
        categoriaCultivoRepositorio.save(cultivo4);
        
		especieRepositorio.save(especie1);
		especieRepositorio.save(especie2);
		especieRepositorio.save(especie3);
		especieRepositorio.save(especie4);
		especieRepositorio.save(especie5);
		especieRepositorio.save(especie6);
		especieRepositorio.save(especie7);
		especieRepositorio.save(especie8);
		
		
		plagaRepositorio.save(plaga1);
		plagaRepositorio.save(plaga2);
		plagaRepositorio.save(plaga3);
		plagaRepositorio.save(plaga4);
		plagaRepositorio.save(plaga5);
		plagaRepositorio.save(plaga6);
		plagaRepositorio.save(plaga7);
		plagaRepositorio.save(plaga8);
		plagaRepositorio.save(plaga9);
		plagaRepositorio.save(plaga10);
		plagaRepositorio.save(plaga11);
		plagaRepositorio.save(plaga12);
		plagaRepositorio.save(plaga13);
		plagaRepositorio.save(plaga14);
		plagaRepositorio.save(plaga15);
		plagaRepositorio.save(plaga16);
		
		sustanciaRepositorio.save(sustancia1);
		sustanciaRepositorio.save(sustancia2);
		sustanciaRepositorio.save(sustancia3);
		sustanciaRepositorio.save(sustancia4);
		sustanciaRepositorio.save(sustancia5);
		sustanciaRepositorio.save(sustancia6);
		sustanciaRepositorio.save(sustancia7);
		sustanciaRepositorio.save(sustancia8);
		sustanciaRepositorio.save(sustancia9);
		sustanciaRepositorio.save(sustancia10);
		sustanciaRepositorio.save(sustancia11);
		sustanciaRepositorio.save(sustancia12);
		sustanciaRepositorio.save(sustancia13);
		sustanciaRepositorio.save(sustancia14);
		sustanciaRepositorio.save(sustancia15);
		sustanciaRepositorio.save(sustancia16);
		sustanciaRepositorio.save(sustancia17);
		sustanciaRepositorio.save(sustancia18);
		sustanciaRepositorio.save(sustancia19);
		sustanciaRepositorio.save(sustancia20);
		
		productoRepositorio.save(producto1);
		productoRepositorio.save(producto2);
		productoRepositorio.save(producto3);
		productoRepositorio.save(producto4);
		productoRepositorio.save(producto5);
		productoRepositorio.save(producto6);
		productoRepositorio.save(producto7);
		productoRepositorio.save(producto8);
		productoRepositorio.save(producto9);
		productoRepositorio.save(producto10);
		productoRepositorio.save(producto11);
		productoRepositorio.save(producto12);
		productoRepositorio.save(producto13);
		productoRepositorio.save(producto14);
		productoRepositorio.save(producto15);
		productoRepositorio.save(producto16);
		productoRepositorio.save(producto17);
		productoRepositorio.save(producto18);
		productoRepositorio.save(producto20);
		productoRepositorio.save(producto21);
		productoRepositorio.save(producto22);
		productoRepositorio.save(producto23);
		productoRepositorio.save(producto24);
		productoRepositorio.save(producto25);
		productoRepositorio.save(producto26);
		productoRepositorio.save(producto27);
		productoRepositorio.save(producto28);
		productoRepositorio.save(producto29);
		productoRepositorio.save(producto30);
		
		///////////////////////////////////////////////
			
	}

}