package ejercicio3;

public class Personajes {
	protected String nombre;
	protected int nivelEnergia;
	/**
	 * @param nombre
	 * @param nivelEnergia
	 */
	public Personajes(String nombre, int nivelEnergia) {
		this.nombre = nombre;
		this.nivelEnergia = nivelEnergia;
	}
	
	public void setEnergia(int alimento){
		this.nivelEnergia+=alimento;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @param nivelEnergia the nivelEnergia to set
	 */
	public void setNivelEnergia(int nivelEnergia) {
		this.nivelEnergia = nivelEnergia;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Personajes nombre=" + nombre + ", nivelEnergia=" + nivelEnergia;
	}
	
}
