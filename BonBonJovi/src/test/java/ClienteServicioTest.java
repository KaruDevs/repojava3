import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

import modelo.CategoriaEnum;
import modelo.Cliente;

class ClienteServicioTest {

	@Test
public void agregarClienteTest(){
		
		String runCliente;
		String nombreCliente;
		String apellidoCliente;
		String aniosCliente;
		CategoriaEnum ACTIVO = null;
		
		Scanner Cliente =new Scanner(System.in);
		System.out.println ("2. Agregar Cliente para prueba\r\n");
		System.out.println ("Crear Cliente\r\n"
				+ "Ingrese RUN del Cliente:"
				+ "Ingrese Nombre del Cliente:"
				+ "Ingrese Apellido del Cliente:"
				+ "Ingrese años del Cliente:"
				+ ACTIVO);
		System.out.println(Cliente);
	}
	@SuppressWarnings("null")
	public String agregarCliente(Cliente cliente) {
		if (cliente !=null) {
		List<Cliente> persona = null;
			persona.add(cliente);
			return "agregado";
		}else { 
			return "no se puede agregar";
		}
	
	}
	public void agregarClienteNullTest(){
		String runCliente;
		String nombreCliente;
		String apellidoCliente;
		String aniosCliente;
		CategoriaEnum ACTIVO = null;
		
		Scanner Cliente =new Scanner(System.in);
		System.out.println ("2. Agregar Cliente null prueba\r\n");
		System.out.println ("Crear Cliente\r\n"
				+ "Ingrese RUN del Cliente:"
				+ "Ingrese Nombre del Cliente:"
				+ "Ingrese Apellido del Cliente:"
				+ "Ingrese años del Cliente:"
				+ ACTIVO);
		System.out.println(Cliente);
	}
}
