package ejercicio3;

public class Mago extends Personajes{
	//Atributo
	private String poder;

	/**
	 * @param nombre
	 * @param nivelEnergia
	 * @param poder
	 */
	public Mago(String nombre, String poder) {
		super(nombre, 100);
		this.poder = poder;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Mago poder=" + poder + ", nombre=" + nombre + ", nivelEnergia="
				+ nivelEnergia;
	}

	public String encantar(){
		setEnergia(-2);
		return this.poder;
	}
	
}
