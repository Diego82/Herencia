package ejercicio2;

public class ProfesorTitular extends Profesor {
	//Atributos
	private int antiguedad;
	//Constructor

	/**
	 * @param nombre
	 * @param apellidos
	 * @param dni
	 * @param edad
	 * @param centroImparte
	 * @param asignatura
	 * @param departamento
	 * @param antiguedad
	 */
	public ProfesorTitular(String nombre, String apellidos, String dni,
			int edad, String centroImparte, String asignatura,
			String departamento, int antiguedad) {
		super(nombre, apellidos, dni, edad, centroImparte, asignatura,
				departamento);
		this.antiguedad = antiguedad;
	}

	/**
	 * @return the antiguedad
	 */
	public int getAntiguedad() {
		return antiguedad;
	}

	/**
	 * @param antiguedad the antiguedad to set
	 */
	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ProfesorTitular antiguedad=" + antiguedad + ", tostring desde profesor titular:"
				+ super.toString();
	}
}
