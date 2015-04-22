package ejercicio1;

public class PruebaInformaticos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Analista a = new Analista("Grupo Heineken", "contable");
		Analista b = new Analista("Grupo Heineken", "administrador");
		Programador c = new Programador("Software SOL", "Java");
		Programador d = new Programador("Ofimatica", "Java");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		a.setSueldo(25.00);
		System.out.println(a.pagarSueldo(4));
		
	}

}
