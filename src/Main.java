import java.util.Scanner;

// TODO: Auto-generated Javadoc
/**
 * The Class Main.
 */
public class Main {
	
	/** The equipo. */
	Equipo equipo;
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
	  Main main = new Main();
	  main.creacionEquipo();
	  System.out.println(main.equipo.toString());
	}
	
	/**
	 * Creacion equipo.
	 */
	public void creacionEquipo() {
	  Scanner scan = new Scanner(System.in);
	  System.out.print("Introduce el nombre del equipo:  ");
	  String nombreEquipo = scan.nextLine();
	  System.out.print("Introduce el nombre de la universidad: ");
	  String universidad = scan.nextLine();
	  System.out.print("Introduce el lenguaje de programacion: ");
	  String lenguaje = scan.nextLine();
	  
	  equipo = new Equipo(nombreEquipo, universidad, lenguaje);
	  
	  System.out.println("Has de agregar minimo 2 integrantes");
	  while (equipo.isEmpty()) {
		System.out.print("Introduce el nombre del integrante: ");
	    String nombre = scan.nextLine();
		System.out.print("Introduce el apellido del integrante: ");
		String apellido = scan.nextLine();
		try {
		  equipo.add(nombre, apellido);	
		} catch (RuntimeException e) {
		  System.out.println("Error: "+ e.getMessage());
		}
	  }
	  boolean exit = false;
	do {
	  System.out.println("Deseas agregar un integrante mas al equipo?\n");
	  System.out.println("Si.");
	  System.out.println("No.");
	  int opcion = scan.nextInt();
	  switch (opcion) {
	  case 1:
	  scan = new Scanner(System.in);
   	  System.out.print("Introduce el nombre del integrante: ");
	  String nombre = scan.nextLine();
	  System.out.print("Introduce el apellido del integrante: ");
	  String apellido = scan.nextLine();
	    try {
		  equipo.add(nombre, apellido);	
		} catch (RuntimeException e) {
		  System.out.println("Error: "+ e.getMessage());
		}
	    break;
	  case 2:
	    exit = true;
	    break;
	  default:
	    System.err.println("Opcion incorrecta");
		break;
	  }
	} while (!equipo.isFull() && !exit);
	  scan.close();
	  System.out.println("Equipo creado con exito!");
	}
}
