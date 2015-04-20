package diapositivas;

import org.omg.Messaging.SyncScopeHelper;

public class TestHerencia {
	public static void main(String[] args) {
		//Siempre que creamos un objeto de la clase hija de crea un objeto de la clase padre
		Hija h = new Hija();

	}
}
class Padre {
	public Padre() {
		// TODO Auto-generated constructor stub
		System.out.println("Creado objeto clase Padre");
	}
}
class Hija extends Padre{
	public Hija() {
		// TODO Auto-generated constructor stub
		System.out.println("Clase Hija");
	}
}
