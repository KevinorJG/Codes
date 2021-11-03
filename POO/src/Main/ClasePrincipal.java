package Main;

import Operations.ClaseHija_Resta;
import Operations.ClaseHija_Suma;


public class ClasePrincipal {

	public static void main(String args[]) {
		ClaseHija_Suma x = new ClaseHija_Suma();
		x.PedirDatos();
		x.Sumar();
		System.out.println("\nEl resultado de la suma es...");
		x.MostrarResultado();
		
		
		ClaseHija_Resta y = new ClaseHija_Resta();
		y.PedirDatos();
		y.Resta();
		System.out.println("\nEl resultado de la resta es...");
		y.MostrarResultado();
		
	}
}
