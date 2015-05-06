package ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class ListinProfesores {
	//Atributo
	private List<Profesor> lista;
	
	//Costructor
	public ListinProfesores(){
		this.lista = new ArrayList<Profesor>();
	}
	
	/**
	 * @return the lista
	 */
	public List<Profesor> getLista() {
		return lista;
	}

	/**
	 * @param lista the lista to set
	 */
	public void setLista(List<Profesor> lista) {
		this.lista = lista;
	}
	
	public void addProfesor(Profesor p){
		lista.add(p);
	}
	
	public void deleteProfesor(Profesor p){
		lista.remove(p);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ListinProfesores lista: "+lista+"\n";
	}
}
