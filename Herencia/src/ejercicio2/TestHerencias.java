package ejercicio2;

import java.util.List;

public class TestHerencias {

	public static void main(String[] args) {

		//Creamos la lista de profesores
		ListinProfesores lista = new ListinProfesores();
		
		//Como opcion mas correcta creamos los objetos como profesor
		Profesor a = new ProfesorTitular("Bartolome", "34332334-A", 23, "IES Las Fuentezuelas", "Matematicas", "Ciencias", 12);
		Profesor b = new ProfesorInterino("Pedro", "23111111-F", 44, "IES virgen del Carmen", "Programacion", "Ciencias", 5);
		
		//Añadimos los profesores a la lista 
		lista.addProfesor(a);
		lista.addProfesor(b);
		System.out.println("Imprimimos la lista de profesores creada");
		System.out.println(lista);
		List<Profesor> listaAuxiliar = lista.getLista();
		//Si queremos imprimirlo formateado utilizaremos printf junto a los getters
		for (Profesor profesor : listaAuxiliar) {
			System.out.println(profesor);
		}
	}
}
