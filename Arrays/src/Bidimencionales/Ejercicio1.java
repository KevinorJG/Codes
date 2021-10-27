package Bidimencionales;
//Crea un array de 10 posiciones de n�meros con valores pedidos por teclado. 
//Muestra por consola el indice y el valor al que corresponde. 
//Haz dos m�todos, uno para rellenar valores y otro para mostrar.

import java.util.Scanner;
public class Ejercicio1 {

	public static Scanner x = new Scanner(System.in);	
	

	public static void main(String[] args) {
		//Se crea un arreglo bidimencional de 10 espacio. Se asigna espacio en memoria.
		int [] arreglo = new int [10];
		
		//Se manda a llamar a los m�todos dentro de la misma clase "Ejercicio1".
		LLenarArray(arreglo);
		System.out.println(" ");
		MostrarArray(arreglo);
		
	}
	
	//Se crea un m�todo que pide como valor un arreglo para llenar sus espacios.
	public static void LLenarArray(int [] array) {
		for(int i=0; i<array.length; i++) {
			System.out.print("Ingrese un n�mero: ");
			//Se pide el valor que guardar� en el arreglo.
			int numero = x.nextInt();
			//El valor asignado en la variable numero se guarda en un espacio del arreglo.
			array[i] = numero;
					
		}
	}
	//Se crea otro m�todo que pide el arreglo ya llenado y este los muestra.
	public static void MostrarArray(int [] array) {
		for(int i=0; i<array.length; i++) {
			System.out.println("Posici�n #"+(i+1)+" es igual a: "+array[i]);
		}

	}

}
