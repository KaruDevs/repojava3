package servicio;

import modelo.Cliente;
import modelo.CategoriaEnum;
import java.util.*;

public class ClienteServicio {

	List <Cliente> listaClientes;
	public ClienteServicio () {
		listaClientes= new ArrayList <>();
		
		
	}
	public List<Cliente> getListaClientes() {
		return listaClientes;
	}
	public void setListaClientes(List<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}
	public void agregarCliente(){
		
		String runCliente;
		String nombreCliente;
		String apellidoCliente;
		String aniosCliente;
		CategoriaEnum ACTIVO =null;
		
		Scanner Cliente=new Scanner(System.in);
		System.out.println ("2. Agregar Cliente\r\n");
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


	public void listaCliente(){	
		Scanner cliente=new Scanner(System.in);
		Set <String> persona = new TreeSet <>();

	//	persona.set(persona);
		
		
		System.out.println(persona.toString());
		
		persona.addAll(persona);
		
		System.out.println(persona.toString());
	
	}
}


/*Crear la clase ClienteServicio en el package servicio con los siguientes
requisitos:
● OK    Crear un atributo llamado List<Cliente> listaClientes
● OK	Generar un constructor de ClienteServicio que tenga esta listaClientes como
una nueva ArrayList.

● Generar el método público sin valor de retornolistarClientes e implementar el
ciclo más idóneo para recorrer cada uno de los clientes.
● Generar un public void del método agregarCliente y pasarle los parámetros de
la clase Cliente. Utiliza este método para guardar clientes en una instancia de
cliente.
● Generar un public void del método editarCliente y pasarle los parámetros de
la clase Cliente.
● Crear un getter de listaCliente y que pueda retornar una listaClientes.*/