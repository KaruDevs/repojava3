package servicio;
import java.io.*;

import java.util.*;

import modelo.Cliente;
import servicio.ClienteServicio;
import servicio.Exportador;


public abstract class ArchivoServicio extends Exportador{

	public void cargarDatos (String fileName){
	    
		List <Cliente> listaClientes;	
			//crear un arrays y que eso se cree en el texto

				fileName();
			    lectura();
			}

			public static void fileName() {

				File directorio = new File("src/carpeta");  
				File archivo = new File("src/carpeta/texto.txt");  

				if (!directorio.exists()) {
					if (directorio.mkdirs()) {
						System.out.println("Directorio creado");
						try {
							archivo.createNewFile();
							FileWriter fileW = new FileWriter(archivo);
							BufferedWriter bufferedWriter = new BufferedWriter(fileW);

							bufferedWriter.write("texto 1");
							bufferedWriter.write("texto 2");
							bufferedWriter.newLine();

							bufferedWriter.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
					} else {
						System.out.println("Error al crear directorio");
					}
				} else {
					System.out.println("Directorio ya esta creado");

				}
			}

			public static void lectura() { 
				try {
					File archivo = new File("src/carpeta/fichero.csv");
					if (archivo.exists()) {
						FileReader fr = new FileReader(archivo);
						BufferedReader br = new BufferedReader(fr);
						String data = br.readLine();
						while (data != null) {
							System.out.println(data);  	 
							data = br.readLine();
						}
						br.close(); 
					} else {
						System.out.println("El fichero ingresado no existe");
					}

				} catch (Exception e) {
				}

			}
		
	public ArchivoServicio() {
		// TODO Auto-generated constructor stub
	}
	public void Exportar(){}
}

/*5. Aplicar instancias al Paradigma Orientado a Objetos (POO)
(2 Puntos)
5.1. ok Crear la clase ArchivoServicio en el package servicio que extiende a la clase
Exportador. Esta contiene los siguientes requisitos:
● Crear el método cargarDatos que recibe por parámetro un String fileName, el
cual indica el nombre del archivo a cargar. Se deben realizar las
implementaciones correspondientes al interior del método usando FileReader
y BufferedReader (para lectura de archivos).
● Crear el método exportar que será una herencia proveniente de la clase
Exportador, cuyos parámetros serán los mismos que se van a implementar en
el paso 8.
5.2. Crear una clase Utilidad en package utilidades, que contenga métodos
reutilizables para el menú como limpiar pantalla, mostrar mensajes, etc.*/