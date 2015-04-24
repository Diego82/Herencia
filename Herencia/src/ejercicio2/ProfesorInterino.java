package ejercicio2;

import java.time.LocalDate;

public class ProfesorInterino extends Profesor {
	//Atributos
	private LocalDate ingreso;
	private int duracionSustitucion;
	
	//Constructor
	/**
	 * @param nombre
	 * @param dni
	 * @param edad
	 * @param centroImparte
	 * @param asignatura
	 * @param departamento
	 * @param ingreso
	 * @param duracionSustitucion
	 */
	public ProfesorInterino(String nombre, String dni,
			int edad, String centroImparte, String asignatura,
			String departamento, int duracionSustitucion) {
		super(nombre, dni, edad, centroImparte, asignatura,
				departamento);
		this.ingreso = LocalDate.now();
		this.duracionSustitucion = duracionSustitucion;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ProfesorInterino [ingreso=" + ingreso
				+ ", duracionSustitucion=" + duracionSustitucion
				+ " " + super.toString();
	}
	
}
