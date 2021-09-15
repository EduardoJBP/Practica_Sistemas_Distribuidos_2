$(function() {
	

var urlCultivos ='http://localhost:8080/cultivo';
//Con getJSON llamamos al restController con la urlCultivos y en respuesta guardamos el valor devuelto por la funcion del restController
$.getJSON(urlCultivos,function (respuesta) { 
		lista =$('#cultivo');
//En lista guardamos la id presente en el html index
        for(categoriaCultivo in respuesta){
            var nombre =respuesta[categoriaCultivo].nombre;
            var nombreId = respuesta[categoriaCultivo].id-1; 
            var button ='<button id="nombreBoton" class="botonCategoria" value="nombre" </button>';
			//Generamos un boton de la clase botonCategoria, gracias a esto podremos saber cuando hacemos click y establecer una funcionalidad
            lista.append($('<li id = "nombrelista">').html(nombre).append(button));
            document.getElementById("nombreBoton").id = nombreId+"boton";
        	//Mediante un for each creamos una lista li con un boton en lista 
			document.getElementById(nombreId+"boton").style = "text-decoration: none; padding: 3px; padding-left: 10px; padding-right: 10px; font-family: helvetica;font-weight: 300;font-size: 25px;font-style: italic;color: #006505;background-color: #82b085;border-radius: 15px;border: 3px double #006505;";
			document.getElementById(nombreId+"boton").value = nombreId;
            document.getElementById("nombrelista").id = nombreId + "lista";
            //Con document cogemos el elemento en funcion de su id y establecemos los valores deseados, la id el estilo del boton o el valor devuelto por el boton            
     	}

		 $(".botonCategoria").click(function(){//recibimos el clicl en el boton de clase categoria
	
				valorBoton = $(this).val()//valorboton recibirá el valor del boton pulsado, en este caso recibimos la id de la categoria que pulsamos
		        nombreAux=$(this).val()+"lista"
		        idListaCultivo = $('#'+nombreAux)//lugar donde concatenaremos la sublista de especies de cultivo
		    	var arrayEspecies = respuesta[valorBoton].especies;
				if (respuesta[valorBoton].plegado == true) {//para cambiar el aspecto del boton comprobamos si se ha plegado o no
					respuesta[valorBoton].plegado = false;
					document.getElementById(valorBoton+"boton").style = "text-decoration: none; padding: 3px; padding-left: 10px; padding-right: 10px; font-family: helvetica;font-weight: 300;font-size: 25px;font-style: italic;color: red;background-color: red;border-radius: 15px;border: 3px double #006505;";
					
					if (arrayEspecies.length > 0){//creamos la sublista donde se añadirán las especies
						idListaCultivo.append($('<ul id ="nombreul1">'))
						document.getElementById("nombreul1").id = nombreAux + "ul" //para poder llamarla después le ponemos una id representativa
						idListaCultivo = $('#'+ nombreAux + "ul")//cambiamos la idListaCultivo a la id de la sublista
						}
		 			for (especies in arrayEspecies){//recorremos el array Json y obtenemos todas las especies
						var idEspecie = arrayEspecies[especies].id
						var nombreEspecie= arrayEspecies[especies].nombreVulgar;
						var nombreCientifico= arrayEspecies[especies].nombreCientifico;
		            	var button2 ='<button id="nombreVulgar" class="botonEspecie" value="nombreVulgar"</button>';

		            	idListaCultivo.append($('<li id = "nombreVulgar1">').html(nombreEspecie).append(button2));//concatenamos el boton y la lista, despues cambiamos las id por valores representativos
		            	document.getElementById("nombreVulgar1").id = idEspecie + "lista"+valorBoton;
						document.getElementById("nombreVulgar").id = idEspecie + "boton" + nombreEspecie + valorBoton;
		        		document.getElementById(idEspecie + "boton"+nombreEspecie + valorBoton).value = idEspecie+"+"+valorBoton + "+" +nombreEspecie + "+" +"t";//el valor del boton es lo devuelto al hacer click, para que no diese problemas con las ids, estan separados con el caracter "+" para poder hacer un split y obtenerlos fácilmente
						document.getElementById(idEspecie + "boton"+nombreEspecie + valorBoton).style = "text-decoration: none; padding: 3px; padding-left: 10px; padding-right: 10px; font-family: helvetica;font-weight: 300;font-size: 25px;font-style: italic;color: #006505;background-color: #82b085;border-radius: 15px;border: 3px double #006505;";
		 				$("#"+idEspecie + "boton" + nombreEspecie + valorBoton).easyTooltip({//para cada boton especie se mostrará un tooltip con el nombre cientifico
							content: "<span style='color:red;'>"+nombreCientifico+"</span>", tooltipDir:"right"
								
						})

					}
					}
				else if (respuesta[valorBoton].plegado == false) {//si no está plegado y recibe un click se borrará la sublista entera
					$("#" + nombreAux + "ul").remove();
					respuesta[valorBoton].plegado = true
					document.getElementById(valorBoton+"boton").style = "text-decoration: none; padding: 3px; padding-left: 10px; padding-right: 10px; font-family: helvetica;font-weight: 300;font-size: 25px;font-style: italic;color: #006505;background-color: #82b085;border-radius: 15px;border: 3px double #006505;";
				}			

	

		$(".botonEspecie").click(function(){
					entradaBoton = $(this).val();// En entradaBoton recibimos el valor devuelto por el botón de la clase botonEspecie
					aux = entradaBoton.split("+");  // Generamos un arrayAuxiliar quitando "+" para obtener en cada posición los ditintos parametros devueltos por el boton
					idEspecie = aux[0];
					categoriaEspecie=aux[1];
					nombreEspecie = aux[2];
					plegado = aux[3];
					nombreAux1= (idEspecie+"lista"+categoriaEspecie)
					idListaCultivo = $('#'+nombreAux1)
					var urlEspecie = '/cultivo/especie/'+ idEspecie// Guardamos la id de la lista anterior
					//Llamamos al restController con la urlEspecie y en respuestaAuxiliar recibimos el valor devuelto por el restController
					$.getJSON(urlEspecie,
							
						function(respuestaAux){	
							if (plegado == "t") {// Con este if controlamos si se ha pulsado el boton
								plegado = false;
								document.getElementById(idEspecie + "boton"+nombreEspecie + categoriaEspecie).value = idEspecie+"+"+categoriaEspecie + "+" +nombreEspecie + "+" +"f";
								// Una vez pulsado modificamos el boton colocando una "f" indicando que ha sido pulsado, para que cuando lo volvamos a pulsar no entre en este if
								document.getElementById(idEspecie + "boton"+nombreEspecie + categoriaEspecie).style="text-decoration: none; padding: 3px; padding-left: 10px; padding-right: 10px; font-family: helvetica;font-weight: 300;font-size: 25px;font-style: italic;color: red;background-color: red;border-radius: 15px;border: 3px double #006505;"
								if (respuestaAux.length > 0){
									idListaCultivo.append($('<ul id ="nombreul2">'))
									document.getElementById("nombreul2").id = nombreAux1 + "ul"//Generamos un nuevo bloque ul con la id nombreAux1
									idListaCultivo = $('#' + nombreAux1 + "ul")	// En idListaCultivo guardamos la id del bloque anterior
								}
							
								for(plagas in respuestaAux){
									var iddPlaga = respuestaAux[plagas].id;
									var nombrePlaga =respuestaAux[plagas].nombreVulgar;
									var nombreCientifico =respuestaAux[plagas].nombreCientifico;
									var button3 ='<button id="nombreB" class="botonPlaga" value="nombre" </button>';
									// Para cada plaga presente en respuestaAux generamos un boton con la clase botonPlaga para poder establecer una funcionalidad cuando pulsemos el boton
								
					         		idListaCultivo.append($('<li id = "nombreVulgar1">').html(nombrePlaga).append(button3));
									// Concatenamos una lista li y el boton para cada plaga				           	    
									document.getElementById("nombreVulgar1").id = iddPlaga + "lista" + categoriaEspecie + nombrePlaga + nombreEspecie;
									document.getElementById("nombreB").id = nombrePlaga + "boton" + categoriaEspecie + nombreEspecie;
									document.getElementById(nombrePlaga + "boton"+categoriaEspecie + nombreEspecie).style = "text-decoration: none; padding: 3px; padding-left: 10px; padding-right: 10px; font-family: helvetica;font-weight: 300;font-size: 25px;font-style: italic;color: #006505;background-color: #82b085;border-radius: 15px;border: 3px double #006505;"
					        		document.getElementById(nombrePlaga + "boton"+categoriaEspecie + nombreEspecie).value = iddPlaga + "+"+ categoriaEspecie+ "+"+ nombrePlaga + "+" + nombreEspecie +"+" + "t";
									// Con document modificamos las id, estilos o valores cogiendo el elemento por su id y en el valor del boton pondremos la id de la plaga la id del cultivo, el nombre de la plaga y el nombre de la especie y un simbolo t
									// Pasamos estos valores para que cuando pulsemos al siguiente boton tengamos la informacion necesaria	
									$('#'+nombrePlaga + "boton"+categoriaEspecie + nombreEspecie).easyTooltip({
										content: "<span style='color:red;'>"+nombreCientifico+"</span>", tooltipDir:"right"
									})
									
									
									}	
								}
							else if (plegado == "f") {// Si el boton quiere ser plegado 
								$("#" + nombreAux1 + "ul").remove();// Borramos el elemento con id nombreAux1 + ul
								plegado = true
								document.getElementById(idEspecie + "boton"+nombreEspecie + categoriaEspecie).value = idEspecie+"+"+categoriaEspecie + "+" +nombreEspecie + "+" +"t";
								document.getElementById(idEspecie + "boton"+nombreEspecie + categoriaEspecie).style="text-decoration: none; padding: 3px; padding-left: 10px; padding-right: 10px; font-family: helvetica;font-weight: 300;font-size: 25px;font-style: italic;color: #006505;background-color: #82b085;border-radius: 15px;border: 3px double #006505;"
								//Establecemos el valor del boton con un "t" para que la proxima vez que pulsemos entremos en el if
							}			
				
			$(".botonPlaga").click(function(){//recibe el valor del botonPlaga pulsado y los guardamos
					entradaBoton = $(this).val();
					aux = entradaBoton.split("+");
					idPlaga = aux[0];
					categoriaPlaga=aux[1];
					nombrePlaga = aux[2];
					nombreEspecie = aux[3];
					plegado = aux[4];
					nombreAux1= idPlaga+"lista"+categoriaPlaga + nombrePlaga + nombreEspecie
					idListaEspecie = $('#'+nombreAux1)
					var urlEspecie = '/cultivo/sustancia/'+ idPlaga
					
					$.getJSON(urlEspecie,//llamamos al restController con esa url y recibimos todas las especies
							
						function(respuestaAux){	
							if (plegado == "t") {//para saber si un boton ha sido pulsado o no, ponemos el valor t, si está plegado y pulsas se despliega
								plegado = false;
								document.getElementById(nombrePlaga + "boton"+categoriaPlaga + nombreEspecie).value = idPlaga+"+"+categoriaPlaga +"+"+nombrePlaga +"+" +nombreEspecie + "+" +"f";
								document.getElementById(nombrePlaga + "boton"+categoriaPlaga + nombreEspecie).style="text-decoration: none; padding: 3px; padding-left: 10px; padding-right: 10px; font-family: helvetica;font-weight: 300;font-size: 25px;font-style: italic;color: red;background-color: red;border-radius: 15px;border: 3px double #006505;"
								if (respuestaAux.length > 0){
									idListaEspecie.append($('<ul id ="nombreul3">'))
									document.getElementById("nombreul3").id = nombreAux1 + "ul"
									idListaEspecie = $('#' + nombreAux1 + "ul")	
								}
							
								for(sustancias in respuestaAux){//recorremos el array, creamos los botones y le ponemos un valor al boton Sustancia creado
									var iddSustancia = respuestaAux[sustancias].id;
									var nombreSustancia =respuestaAux[sustancias].nombre;
									var button4 ='<button id="nombreB" class="botonSustancia1" value="nombre" </button>';
									
					         		idListaEspecie.append($('<li id = "nombre1">').html(nombreSustancia).append(button4));
					           	    document.getElementById("nombre1").id = iddSustancia + "lista"+idPlaga + nombrePlaga+categoriaPlaga + nombreEspecie;
									document.getElementById("nombreB").id = nombreSustancia + "boton"+idPlaga + nombrePlaga+categoriaPlaga + nombreEspecie;
					        		document.getElementById(nombreSustancia + "boton"+idPlaga + nombrePlaga+categoriaPlaga + nombreEspecie).style ="text-decoration: none; padding: 3px; padding-left: 10px; padding-right: 10px; font-family: helvetica;font-weight: 300;font-size: 25px;font-style: italic;color: #006505;background-color: #82b085;border-radius: 15px;border: 3px double #006505;"
									document.getElementById(nombreSustancia + "boton"+idPlaga + nombrePlaga+categoriaPlaga + nombreEspecie).value = iddSustancia +"+"+ idPlaga +"+" + nombrePlaga +"+"+categoriaPlaga + "+" + nombreEspecie + "+"+ "t"+ "+"+nombreSustancia;
									}	
								}
							else if (plegado == "f") {
								$("#" + nombreAux1 + "ul").remove();
								plegado = true
								document.getElementById(nombrePlaga + "boton"+categoriaPlaga + nombreEspecie).value = idPlaga+"+"+categoriaPlaga +"+"+nombrePlaga +"+" +nombreEspecie + "+" +"t";
								document.getElementById(nombrePlaga + "boton"+categoriaPlaga + nombreEspecie).style="text-decoration: none; padding: 3px; padding-left: 10px; padding-right: 10px; font-family: helvetica;font-weight: 300;font-size: 25px;font-style: italic;color: #006505;background-color: #82b085;border-radius: 15px;border: 3px double #006505;"
							}
								
								
								
								
			$(".botonSustancia1").click(function(){
							entradaBoton = $(this).val();
							aux = entradaBoton.split("+");
							idSustancia = aux[0];
							idPlaga=aux[1];
							nombrePlaga = aux[2];
							categoriaPlaga= aux[3];
							nombreEspecie = aux[4];
							plegado = aux[5];
							nombreSustancia = aux[6];
							
							nombreAux1= idSustancia+"lista"+idPlaga +nombrePlaga+ categoriaPlaga + nombreEspecie

							idListaPlaga = $('#'+nombreAux1)
							var urlSustancia = '/cultivo/producto/'+ idSustancia
							
							$.getJSON(urlSustancia,//llamamos al restController y mete en respuestaAux el json con todos los productos de esa sustancia
										
								function(respuestaAux){	
									if (plegado == "t") {
										plegado = false;
										document.getElementById(nombreSustancia + "boton"+idPlaga + nombrePlaga+categoriaPlaga + nombreEspecie).value = idSustancia+"+"+idPlaga+"+"+nombrePlaga +"+"+categoriaPlaga + "+"+ nombreEspecie+ "+" +"f"+ "+"+nombreSustancia;
										document.getElementById(nombreSustancia + "boton"+idPlaga + nombrePlaga+categoriaPlaga + nombreEspecie).style ="text-decoration: none; padding: 3px; padding-left: 10px; padding-right: 10px; font-family: helvetica;font-weight: 300;font-size: 25px;font-style: italic;color: red;background-color: red;border-radius: 15px;border: 3px double #006505;"
										if (respuestaAux.length > 0){
											idListaPlaga.append($('<ul id ="nombreul3">'))
											document.getElementById("nombreul3").id = nombreAux1 + "ul"
											idListaPlaga = $('#' + nombreAux1 + "ul")	
										}
										
									for(productos in respuestaAux){//Al ser los últimos nodos del árbol no se crearán botones
											var nombreProducto =respuestaAux[productos].nombre;											
								       		idListaPlaga.append($('<li id = "nombre1">').html(nombreProducto));
								       	    document.getElementById("nombre1").id = iddSustancia + "lista"+idPlaga +nombrePlaga+ categoriaPlaga;
												
											}
									}
									else if (plegado == "f") {
										$("#" + nombreAux1 + "ul").remove();
										plegado = true
										document.getElementById(nombreSustancia + "boton"+idPlaga + nombrePlaga+categoriaPlaga + nombreEspecie).value = idSustancia+"+"+idPlaga+"+"+nombrePlaga +"+"+categoriaPlaga + "+"+ nombreEspecie+ "+" +"t" + "+"+nombreSustancia;									
										document.getElementById(nombreSustancia + "boton"+idPlaga + nombrePlaga+categoriaPlaga + nombreEspecie).style = "text-decoration: none; padding: 3px; padding-left: 10px; padding-right: 10px; font-family: helvetica;font-weight: 300;font-size: 25px;font-style: italic;color: #006505;background-color: #82b085;border-radius: 15px;border: 3px double #006505;"								
								
								}
								})
			   				})	
						})
   					})
				})
   			})	
  	 	})
	})
  });