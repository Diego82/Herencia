package ejercicio3;

public class Guerrero extends Personajes {
	//Atributos
	private String arma;

	/**
	 * @param nombre
	 * @param nivelEnergia
	 * @param arma
	 */
	public Guerrero(String nombre, String arma) {
		super(nombre, 500);
		this.arma = arma;
	}
	
	public String combatir(int energiaCombate){
		setEnergia(-energiaCombate);
		return this.arma+nivelEnergia;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Guerrero arma=" + arma + ", toString()=" + super.toString();
	}
	
}
