package main;
import java.util.*;
import vista.Menu;
import vista.Menu;

public class Main  {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
 
        while (!salir) {
 
        	System.out.println("----- Menú -----");
    		System.out.println("1. Listar Clientes\r\n"
    				+ "2. Agregar Cliente\r\n"
    				+ "3. Editar Cliente\r\n"
    				+ "4. Cargar Datos\r\n"
    				+ "5. Exportar Datos\r\n"
    				+ "6. Salir\r\n"
    				+ "Ingrese una opción: " );
            try {
 
                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();
 
                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado la opcion Listar Clientes");
                        break;
                    case 2:
                        System.out.println("Has seleccionado la opcion Agregar Cliente");
                        break;
                    case 3:
                        System.out.println("Has seleccionado la opcion Editar Cliente");
                        break;
                    case 4:
                        System.out.println("Has seleccionado la opcion Cargar Datos");
                        break;
                    case 5:
                        System.out.println("Has seleccionado la opcion Exportar Datos");
                        break;
                    case 6:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 6");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
               
            }
            break;
        }
        Menu menu = new Menu();
    }
 
	}



/*Crear la clase Main con método public static void en el package main, la cual
usará una instancia para iniciar el menú.*/
