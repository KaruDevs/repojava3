package utilidades;

import main.Main;

public class Utilidad extends main.Main{

	public void limpiarPantalla() {
		try  
		{  
		final String os = System.getProperty("os.name");  
		if (os.contains("Windows"))  
		{  
		Runtime.getRuntime().exec("cls");  
		}  
		}  
		catch (final Exception e)  
		{  
		e.printStackTrace();  
		}  
	}
	public void mostrarMenú() { 
		
	        System.out.println("A continuación se volverá a pantalla de menú");
	        System.out.println("Inicia cuenta regresiva");

	        for (int i = 10; i >= 1;  i--)
	        {
	            System.out.println(i);//Se muestra cada valor de i (de 10 al 1)
	        }

	        System.out.println("Retorno al menú");

	        for (int i = 10; i >= 1;  i--)
	        {
	            
		//		System.out.print(main.Main);
	        }
	    }
	}
	

/*5. Aplicar instancias al Paradigma Orientado a Objetos (POO)
(2 Puntos)
5.1. Crear la clase ArchivoServicio en el package servicio que extiende a la clase
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