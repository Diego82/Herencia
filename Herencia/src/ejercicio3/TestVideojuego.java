package ejercicio3;

public class TestVideojuego {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Guerrero a = new Guerrero("Diego", "Hielo");
		Mago b = new Mago("Pedro", "Ninguno");
		System.out.println(a);
		System.out.println(b);
		System.out.println(b.encantar());
		System.out.println(a.combatir(20));
		a.setEnergia(100);
		System.out.println(a);
	
		
	}

}
