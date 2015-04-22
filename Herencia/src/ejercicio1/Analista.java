package ejercicio1;

public class Analista extends InformaticosAbs{
	//Atributos
	private String especialidad;

	/**
	 * @param empresa
	 * @param especialidad
	 */
	public Analista(String empresa, String especialidad) {
		super(empresa);
		this.especialidad = especialidad;
	}
	public double pagarSueldo(double horas){
		return getSueldo()*horas;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return " Informatico: "+ super.toString()+
				" especialidad del analista: "+especialidad;
	}
	
}
