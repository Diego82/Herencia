package ejercicio1;

public class Programador extends InformaticosAbs {
	//Atributo
	private String lenguaje;
	//Constructor
	public Programador(String empresa, String lenguaje) {
		super(empresa);
		this.lenguaje = lenguaje;
	}
	public double pagarSueldo(double horas){
		return getSueldo()*horas;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Informatico: "+ super.toString()+
				" lenguaje del programador: " + lenguaje;
	}
	
	
}
