package ejercicio1;

public class InformaticosAbs {
	//Atributos
	private String empresa;
	private double sueldo;
	/**
	 * @param empresa
	 * @param sueldo
	 */
	public InformaticosAbs(String empresa) {
		this.empresa = empresa;
	}
	/**
	 * @return the empresa
	 */
	public String getEmpresa() {
		return empresa;
	}
	/**
	 * @param empresa the empresa to set
	 */
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	/**
	 * @return the sueldo
	 */
	public double getSueldo() {
		return sueldo;
	}
	/**
	 * @param sueldo the sueldo to set
	 */
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	public double pagarSueldo(double horas){
		return getSueldo()*horas;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return " empresa: " + empresa + " Sueldo: "+this.sueldo;
	}
	
	
}
