package Operations;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ClasePadre {

	protected int valor1, valor2, resultado;
	Scanner x = new Scanner(System.in);
	
	//Pedir valores al usuario
	public void PedirDatos() {
	
		System.out.print("Dame el primer valor: ");
		valor1 = x.nextInt();
		System.out.print("Dame el segundo valor: ");
		valor2 = x.nextInt();
	
	}
	//Muestra un resultado
	public void MostrarResultado() {
		
		JOptionPane.showMessageDialog(null, "El resultado es: "+resultado);
		System.out.println(" ");
	}
	
}
