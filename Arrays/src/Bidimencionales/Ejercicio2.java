package Bidimencionales;
//Crea un array de n�meros donde le indicamos por teclado el tama�o del array, rellenaremos el array 
//con n�meros aleatorios entre 0 y 9, al final muestra por pantalla el valor de cada posici�n y la suma de todos los valores. 
//Haz un m�todo para rellenar el array (que tenga como par�metros los n�meros entre los que tenga que generar), para mostrar 
//el contenido y la suma del array y un m�todo privado para generar n�mero aleatorio (lo puedes usar para otros ejercicios).
import java.util.Scanner;
public class Ejercicio2 {
	
	public static Scanner x = new Scanner(System.in);

	public static void main(String[] args) {
		
		//Se pide el tama�o del arreglo
		System.out.print("Ingrese el tama�o:");
		int tam = x.nextInt();
		
		//Se crea un arreglo el cual tiene como tama�o el valor guardado en la variable tam.
		int [] array = new int [tam];
		//Se llaman los m�todos de la clase.
		Llenar(array, 0, 9); //Dentro de este m�todo ya se ingresan dos valores.
		MostrarArray(array);

	}
	
	//Se crea un m�todo que pide el tama�o del arreglo y los n�mero que se generaran entre ese rango.
	public static int [] Llenar(int [] array, int a, int b) {
		for(int i=0; i<array.length; i++) {
			array[i] = (int) Math.floor(Math.random()*(a-b)+b);
		}
		
		return array;
	}
	//M�todo que muestra los elementos del arreglo y la suma de los valores dentro del arreglo.
	public static void MostrarArray(int []array ) {
		//Variable creada para guardar la suma de los elementos del arreglo.
		int suma = 0;
		
		for(int i=0; i<array.length; i++) {
			System.out.println("En el indice: "+i+" est� el v�lor: "+array[i]);
			//Los elementos del arreglo se iran sumando conforme al tama�o del arreglo, y se esta suma
			//se guardar� en la variable suma.
			suma+=array[i];
		}
		
		System.out.println("La suma de los elementos del arreglo es: "+suma);
	}

}
