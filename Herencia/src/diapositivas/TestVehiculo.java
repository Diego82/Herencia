package diapositivas;

import java.time.LocalDate;

public class TestVehiculo {
	public static void main(String[] args) {
		Coche c = new Coche("pepito garcia", 5, false, true);
		System.out.println(c);
		Coche c2 = new Coche("Juan Quesada", 7, true, true);
		System.out.println(c);
	}
}
class Vehiculo{
	//Atributos de la clase padre
	private int numeroRuedas;
	private LocalDate fechaCompra;
	private String propietario;
	private int numeroPasajeros;
	/**
	 * @param numeroRuedas
	 * @param fechaCompra
	 * @param propietario
	 * @param numeroPasajeros
	 */
	public Vehiculo(int numeroRuedas, String propietario, int numeroPasajeros) {
		this.numeroRuedas = numeroRuedas;
		this.fechaCompra = LocalDate.now();
		this.propietario = propietario;
		this.numeroPasajeros = numeroPasajeros;
	}
	/**
	 * @return the numeroRuedas
	 */
	public int getNumeroRuedas() {
		return numeroRuedas;
	}
	/**
	 * @param numeroRuedas the numeroRuedas to set
	 */
	public void setNumeroRuedas(int numeroRuedas) {
		this.numeroRuedas = numeroRuedas;
	}
	/**
	 * @return the fechaCompra
	 */
	public LocalDate getFechaCompra() {
		return fechaCompra;
	}
	/**
	 * @param fechaCompra the fechaCompra to set
	 */
	public void setFechaCompra(LocalDate fechaCompra) {
		this.fechaCompra = fechaCompra;
	}
	/**
	 * @return the propietario
	 */
	public String getPropietario() {
		return propietario;
	}
	/**
	 * @param propietario the propietario to set
	 */
	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}
	/**
	 * @return the numeroPasajeros
	 */
	public int getNumeroPasajeros() {
		return numeroPasajeros;
	}
	/**
	 * @param numeroPasajeros the numeroPasajeros to set
	 */
	public void setNumeroPasajeros(int numeroPasajeros) {
		this.numeroPasajeros = numeroPasajeros;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Vehiculo [numeroRuedas=" + numeroRuedas + ", fechaCompra="
				+ fechaCompra + ", propietario=" + propietario
				+ ", numeroPasajeros=" + numeroPasajeros + "]";
	}
}
class Coche extends Vehiculo{
	//Atributos de la clase hijo
	private boolean diesel;
	private boolean descapotable;
	
	/**
	 * @param numeroRuedas
	 * @param propietario
	 * @param numeroPasajeros
	 * @param diesel
	 * @param descapotable
	 */
	public Coche( String propietario, int numeroPasajeros,
			boolean diesel, boolean descapotable) {
		super(2, propietario, numeroPasajeros);
		this.diesel = diesel;
		this.descapotable = descapotable;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Coche [diesel=" + diesel + ", descapotable=" + descapotable
				+ ", Vehiculo" + super.toString();
	}
}
class Motocicleta extends Vehiculo{
	//Atributos propios de la clase hijo
	private int cilindrada;

	/**
	 * @param numeroRuedas
	 * @param propietario
	 * @param numeroPasajeros
	 * @param cilindrada
	 */
	public Motocicleta(String propietario,
			int numeroPasajeros, int cilindrada) {
		super(2, propietario, numeroPasajeros);
		this.cilindrada = cilindrada;
	}	
}