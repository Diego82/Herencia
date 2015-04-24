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
	
	public void addProfesor(Profesor p){
		if(!p.equals(lista))
			lista.add(p);
	}
	
	public void deleteProfesor(Profesor p){
		if(lista.contains(p))
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
