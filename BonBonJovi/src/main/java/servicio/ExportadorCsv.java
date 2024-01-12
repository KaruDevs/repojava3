package servicio;
import java.io.*;
import java.util.*;

public class ExportadorCsv {

	public void exportar() {
		
		
	};

	

	public ExportadorCsv() {
		// TODO Auto-generated constructor stub
		
	}
	
	

}
/*4. Aplicar Polimorfismo y Herencia según el Paradigma Orientado a Objetos (POO)
(2 Puntos)


4.1. Crear una clase abstracta de nombre Exportador en package Servicio, que
contenga un método abstracto para exportar, cuyos parámetros serán String
fileName y List<Cliente> listaClientes.


4.2. Crear una clase ExportadorCsv en el package servicio, que contenga un
método exportar, cuyos parámetros serán String fileName y una List<Cliente>
listaClientes. Se deben realizar las implementaciones correspondientes al
interior del método usando PrintWriter y Filewriter para la exportación de
archivos.


4.3. Crear una clase ExportadorTxt en el package servicio, que contenga un
método exportar, cuyos parámetros serán String fileName y una List<Cliente>
listaClientes. Se deben realizar las implementaciones correspondientes al
interior del método usando PrintWriter y Filewriter para exportación de
archivos.


Hint: Los pasos 8, 9 y 10 buscan tener una clase abstracta (Exportador), con un solo método
exportar, cuyas clases ExportadorCsv y ExportadorTxt extienden de esta clase e
implementar su método. Por lo tanto, los métodos declarados serán pertenecientes a cada
Exportador bajo el concepto de herencia. Al utilizarlo, se instancia alguno de los
exportadores en la clase menu ocupando polimorfismo.*/