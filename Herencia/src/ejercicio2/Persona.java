package ejercicio2;

public class Persona {
	//Atributos
	private String nombre;
	private String dni;
	private int edad;
	
	//Constructor
	/**
	 * @param nombre
	 * @param dni
	 * @param edad
	 */
	public Persona(String nombre, String dni,	int edad) {
		this.nombre = nombre;
		this.dni = dni;
		this.edad = edad;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Persona nombre=" + nombre + ", dni=" + dni + ", edad=" + edad;
	}
}
