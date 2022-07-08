package ppal;

import modelo.CuentaJoven;
import modelo.Persona;

public class Principal {

	public static void main(String[] args) {
		Persona p1=new Persona("Antonio", 20, "11111111A");
		CuentaJoven obj1 =new CuentaJoven(p1, 1000, 0, false);
		
		Persona p2=new Persona("Miguel", 24, "22222222B");
		CuentaJoven obj2 =new CuentaJoven(p2, 1100, 0, true);
		
		System.out.println(obj1);
		System.out.println(obj2);
		
		System.out.println("Calcula Intereses Cuenta 1: "+obj1.calculaIntereses());
		System.out.println("Calcula Intereses Cuenta 2: "+obj2.calculaIntereses());
		
		System.out.println("Transferir Cuenta 1: "+obj1.transferir());
		System.out.println("Transferir Cuenta 2: "+obj2.transferir());
		
	}

}
