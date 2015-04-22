package p4;

import diapositivas.C1;

public class C5 {
	final void comprobar(){
		C1 o = new C1();
		int suma = o.x; //No tengo acceso al atributo x.y (protected) fuera del paquete 
	}
}
class C6 extends C5{
	
}
