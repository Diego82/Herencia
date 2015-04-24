package ejercicio2;

public class TestHerencias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProfesorTitular a = new ProfesorTitular("Bartolome", "Mendez", "34332334-A", 23, "IES Las Fuentezuelas", "Matematicas", "Ciencias", 12);
		ProfesorInterino b = new ProfesorInterino("Pedro", "Rodriguez", "23111111-F", 44, "IES virgen del Carmen", "Programacion", "Ciencias", 5);
		System.out.println(a);
		System.out.println(b);
		ListinProfesores lista = new ListinProfesores();
		lista.addProfesor(a);
		lista.addProfesor(b);
		System.out.println("Imprimimos la lista de profesores creada");
		System.out.println(lista);
	}
}
