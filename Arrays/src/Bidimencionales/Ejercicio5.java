//Arreglo de 100 posiciones y sacar la suma y la media de los numeros del arreglo
package Bidimencionales;

import javax.swing.JOptionPane;

public class Ejercicio5 {

	public static int [] Llenado(int [] array) {
		
		for(int i=0; i<array.length; i++) {
			array[i] = i+1;
		}
		return array;
	}
	
	public static void Calculo(int [] array) {
		int suma = 0;
		
		for(int i=0; i<array.length; i++) {
			suma += array[i];
		}
		
		JOptionPane.showMessageDialog(null, "La suma del arreglo es: "+suma);
		JOptionPane.showMessageDialog(null, "La media del arreglo es: "+((double)suma/array.length));
	}
	
	public static void main(String[] args) {
		
		int [] arreglo = new int [100];
		Llenado(arreglo);
		Calculo(arreglo);

	}

}
