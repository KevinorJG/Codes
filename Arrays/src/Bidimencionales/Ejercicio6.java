//Pide al usuario por teclado una frase y pasa sus caracteres a un array de caracteres. Puedes hacer con o sin métodos de String.
package Bidimencionales;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejercicio6 {
	
public static Scanner x = new Scanner(System.in);

	
	public static char [] CalcularCadena(String cadena) {
		char [] Caracters = new char[cadena.length()];
		
		for(int i=0; i<cadena.length(); i++ ) {
			Caracters[i] = cadena.charAt(i);
		}
		
		return Caracters;
	}
	
	public static void Imprimir(char [] array) {
		
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
	}
	public static void main(String[] args) {
		System.out.print("Ingrese la cadena");
		String cadena = x.nextLine();	
		
		char [] Caracters;
		Caracters=CalcularCadena(cadena);
		Imprimir(Caracters);
		

	}

}
