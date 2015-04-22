package p4;

import diapositivas.C1; //Al estar fuera del package tiene que importar el package

public class C4 extends C1 {
	void comprobar(){
		int suma = x + y; //no son vidibles ni z(default) ni u(private);
		m();
	}
}
