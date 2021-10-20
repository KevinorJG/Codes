package Bidimencionales;
//Crea un array de números de 100 posiciones, que contendrá los números del 1 al 100. 
//Obtén la suma de todos ellos y la media.
public class Ejercicio3 {

	public static void main(String[] args) {
		
		 int [] array = new int [100];
		 
		 Calcular(array);

	}
	//Se crea el método que llena e imprime la suma y la media de los elementos del arreglo.
	public static void Calcular(int []array) {
		int suma=0;
		double media;
		//Se utiliza un for para recorrer el tamaño del arreglo y a su vez llena el arreglo.
		for(int i=0; i<array.length; i++) {
			array[i]=i+1; //Cada elemento del arreglo va aumento en 1... es decir suma de uno de uno hasta llenar el arreglo.
			suma+=array[i]; //los elementos guardados en el arreglo se van sumando y se guardan en la variable suma.
		}
		
		media = suma/array.length; //En la variable media se guarda la división de la suma entre el tamaño del arreglo.
		
		System.out.println("La suma de los elementos del arreglo es: "+suma);
		System.out.println("La media de los elementos del arreglo es: "+media);
	}

}
