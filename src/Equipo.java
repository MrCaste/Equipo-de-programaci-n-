import java.util.ArrayList;
import java.util.List;


// TODO: Auto-generated Javadoc
/**
 * The Class Equipo.
 */
public class Equipo {
	
	/** The nombre. */
	private String nombre;
	
	/** The universidad. */
	private String universidad;
	
	/** The lenguaje. */
	private String lenguaje;
	
	/** The Programadores. */
	List<Programadores> Programadores;
	
	/**
	 * Instantiates a new equipo.
	 *
	 * @param nombre the nombre
	 * @param universidad the universidad
	 * @param lenguaje the lenguaje
	 */
	public Equipo(String nombre, String universidad, String lenguaje) {
		super();
		this.nombre = nombre;
		this.universidad = universidad;
		this.lenguaje = lenguaje;
		this.Programadores = new ArrayList<>();
	}
	
	/**
	 * Checks if is full.
	 *
	 * @return true, if is full
	 */
	public boolean isFull() {
	  return Programadores.size() == 3;
	}
	
	/**
	 * Checks if is empty.
	 *
	 * @return true, if is empty
	 */
	public boolean isEmpty() {
	  return Programadores.size() < 2;
	}
	
	/**
	 * Adds the.
	 *
	 * @param nombre the nombre
	 * @param apellido the apellido
	 */
	public void add(String nombre, String apellido) {
	  if(isFull()) {
	    throw new RuntimeException("El equipo esta lleno");
	  }
	  if(!nombre.matches("^[A-Za-z][a-zA-Z ]{1,19}$") || !apellido.matches("^[A-Za-z][a-zA-Z ]{1,19}$")) {
	    throw new IllegalArgumentException("numero detectado o longitud exedida");
	  }
	  Programadores.add(new Programadores(nombre, apellido));
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "Equipo [nombre= " + nombre + ", universidad= " + universidad + ", lenguaje= " + lenguaje
				+ ", Programadores= " + Programadores + "]";
	}
	
	
}
