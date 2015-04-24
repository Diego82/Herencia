package ejercicio2;

public class Profesor extends Persona {
	//Atributos
	private String centroImparte;
	private String asignatura;
	private String departamento;
	/**
	 * @param nombre
	 * @param apellidos
	 * @param dni
	 * @param edad
	 * @param asigunatura
	 * @param departamento
	 */
	public Profesor(String nombre, String apellidos, String dni, int edad, String centroImparte,
			String asignatura, String departamento) {
		super(nombre, apellidos, dni, edad);
		this.centroImparte = centroImparte;
		this.asignatura = asignatura;
		this.departamento = departamento;
	}
	/**
	 * @return the centroImparte
	 */
	public String getCentroImparte() {
		return centroImparte;
	}
	/**
	 * @param centroImparte the centroImparte to set
	 */
	public void setCentroImparte(String centroImparte) {
		this.centroImparte = centroImparte;
	}
	/**
	 * @return the asignatura
	 */
	public String getAsignatura() {
		return asignatura;
	}
	/**
	 * @param asignatura the asignatura to set
	 */
	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}
	/**
	 * @return the departamento
	 */
	public String getDepartamento() {
		return departamento;
	}
	/**
	 * @param departamento the departamento to set
	 */
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Profesor centroImparte=" + centroImparte + ", asignatura="
				+ asignatura + ", departamento=" + departamento;
	}	
}
