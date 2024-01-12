package vista;

import java.util.Scanner;
import java.util.*;
import servicio.Exportador.*;
import servicio.ClienteServicio;
import servicio.ArchivoServicio.*;
import servicio.ExportadorTxt;
import servicio.ExportadorCsv;
import servicio.*;

public class Menu {

	ClienteServicio clienteServicio = new ClienteServicio();
	ArchivoServicio archivoServicio = new ArchivoServicio();
	ExportarCsv exportarCsv = new ExportarCsv();
	ExportarTxt exportarTxt = new ExportarTXT();
	
	public String fileName = "Clientes";
	public String fileName1 = "DBClientes.csv";
	
	public void iniciarMenu(){};
	
	public void listarCliente(){};
	public void agregarCliente(){};
	public void editarCliente(){};
	public void importarDatos(){};
	public void exportarDatos(){};
	public void terminarPrograma(){};
	
}





/*Crear clase Menu en el package vistas, que debe contener los siguientes
atributos:
● clienteServicio, instancia de ClienteServicio.
● archivoServicio, instancia de ArchivoServicio.
● exportadorCsv, instancia de ExportarCsv.
● exportarTxt, instancia de ExportarTxt.
● Definir un String fileName = “Clientes” (para exportar el archivo)
● Definir un String fileName1 = “DBClientes.csv” (para importar el archivo)
● scanner, instancia de Scanner para recibir valores a través del teclado.
● iniciarMenu, muestra el menu principal y recibe la entrada del teclado a través
del scanner. Contiene la lógica para denotar los demás métodos en base a la
entrada del teclado.*/

/*La clase Menu debe contener los siguientes métodos para la construcción y
selección del menu:
● listarCliente.
● agregarCliente.
● editarCliente.
● importarDatos.
● exportarDatos.
● terminarPrograma.
*/

/*Se deben sobreescribir los métodos nombrados previamente en el punto 7,
dentro de la misma clase Menú de la siguiente manera:
● listarClientes, muestra lista de clientes agregados, ya sea por importación o
agregando a mano
● agregarCliente, solicita ingreso de datos y llena objeto de tipo Cliente.
● editarCliente, permite la edición de algún cliente en caso de requerirlo o
cambiar el estado del cliente.
● cargarDatos, ejecuta la carga de datos del archivo “DBClientes.csv”.
● exportarDatos, llama a método para exportar clientes en formato “.txt” o
“.csv”.
● terminarPrograma, el cual finaliza la ejecución del sistema.
*/