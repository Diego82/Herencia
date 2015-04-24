package ejercicio2;

public class Profesor extends Persona {
	//Atributos
	private String centroImparte;
	private String asignatura;
	private String departamento;
	/**
	 * @param nombre
	 * @param dni
	 * @param edad
	 * @param asigunatura
	 * @param departamento
	 */
	public Profesor(String nombre, String dni, int edad, String centroImparte,
			String asignatura, String departamento) {
		super(nombre, dni, edad);
		this.centroImparte = centroImparte;
		this.asignatura = asignatura;
		this.departamento = departamento;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Profesor centroImparte=" + centroImparte + ", asignatura="
				+ asignatura + ", departamento=" + departamento
				+ " " + super.toString();
	}
		
}
