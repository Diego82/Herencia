package ejercicio2;

public class ProfesorTitular extends Profesor {
	//Atributos
	private int antiguedad;
	//Constructor

	/**
	 * @param nombre
	 * @param dni
	 * @param edad
	 * @param centroImparte
	 * @param asignatura
	 * @param departamento
	 * @param antiguedad
	 */
	public ProfesorTitular(String nombre, String dni,
			int edad, String centroImparte, String asignatura,
			String departamento, int antiguedad) {
		super(nombre, dni, edad, centroImparte, asignatura,
				departamento);
		this.antiguedad = antiguedad;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ProfesorTitular antiguedad=" + antiguedad + " "
				+ super.toString();
	}
	
}
