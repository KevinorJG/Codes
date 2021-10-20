package Bidimencionales;
//Crea un array de números donde le indicamos por teclado el tamaño del array, rellenaremos el array 
//con números aleatorios entre 0 y 9, al final muestra por pantalla el valor de cada posición y la suma de todos los valores. 
//Haz un método para rellenar el array (que tenga como parámetros los números entre los que tenga que generar), para mostrar 
//el contenido y la suma del array y un método privado para generar número aleatorio (lo puedes usar para otros ejercicios).
import java.util.Scanner;
public class Ejercicio2 {
	
	public static Scanner x = new Scanner(System.in);

	public static void main(String[] args) {
		
		//Se pide el tamaño del arreglo
		System.out.print("Ingrese el tamaño:");
		int tam = x.nextInt();
		
		//Se crea un arreglo el cual tiene como tamaño el valor guardado en la variable tam.
		int [] array = new int [tam];
		//Se llaman los métodos de la clase.
		Llenar(array, 0, 9); //Dentro de este método ya se ingresan dos valores.
		MostrarArray(array);

	}
	
	//Se crea un método que pide el tamaño del arreglo y los número que se generaran entre ese rango.
	public static int [] Llenar(int [] array, int a, int b) {
		for(int i=0; i<array.length; i++) {
			array[i] = (int) Math.floor(Math.random()*(a-b)+b);
		}
		
		return array;
	}
	//Método que muestra los elementos del arreglo y la suma de los valores dentro del arreglo.
	public static void MostrarArray(int []array ) {
		//Variable creada para guardar la suma de los elementos del arreglo.
		int suma = 0;
		
		for(int i=0; i<array.length; i++) {
			System.out.println("En el indice: "+i+" está el válor: "+array[i]);
			//Los elementos del arreglo se iran sumando conforme al tamaño del arreglo, y se esta suma
			//se guardará en la variable suma.
			suma+=array[i];
		}
		
		System.out.println("La suma de los elementos del arreglo es: "+suma);
	}

}
