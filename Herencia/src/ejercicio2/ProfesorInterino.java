package ejercicio2;

import java.time.LocalDate;

public class ProfesorInterino extends Profesor {
	//Atributos
	private LocalDate ingreso;
	private int duracionSustitucion;
	
	//Constructor
	/**
	 * @param nombre
	 * @param apellidos
	 * @param dni
	 * @param edad
	 * @param centroImparte
	 * @param asignatura
	 * @param departamento
	 * @param ingreso
	 * @param duracionSustitucion
	 */
	public ProfesorInterino(String nombre, String apellidos, String dni,
			int edad, String centroImparte, String asignatura,
			String departamento, int duracionSustitucion) {
		super(nombre, apellidos, dni, edad, centroImparte, asignatura,
				departamento);
		this.ingreso = LocalDate.now();
		this.duracionSustitucion = duracionSustitucion;
	}

	/**
	 * @return the ingreso
	 */
	public LocalDate getIngreso() {
		return ingreso;
	}

	/**
	 * @return the duracionSustitucion
	 */
	public int getDuracionSustitucion() {
		return duracionSustitucion;
	}

	/**
	 * @param duracionSustitucion the duracionSustitucion to set
	 */
	public void setDuracionSustitucion(int duracionSustitucion) {
		this.duracionSustitucion = duracionSustitucion;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ProfesorInterino ingreso=" + ingreso + ", duracionSustitucion="
				+ duracionSustitucion + ", toString()=" + super.toString()
				+ ", getNombre()=" + getNombre() + ", getApellidos()="
				+ getApellidos() + ", getEdad()=" + getEdad() + ", getDni()="
				+ getDni();
	}	
}
