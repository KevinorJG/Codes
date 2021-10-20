package Bidimencionales;
//Crea un array de n�meros de 100 posiciones, que contendr� los n�meros del 1 al 100. 
//Obt�n la suma de todos ellos y la media.
public class Ejercicio3 {

	public static void main(String[] args) {
		
		 int [] array = new int [100];
		 
		 Calcular(array);

	}
	//Se crea el m�todo que llena e imprime la suma y la media de los elementos del arreglo.
	public static void Calcular(int []array) {
		int suma=0;
		double media;
		//Se utiliza un for para recorrer el tama�o del arreglo y a su vez llena el arreglo.
		for(int i=0; i<array.length; i++) {
			array[i]=i+1; //Cada elemento del arreglo va aumento en 1... es decir suma de uno de uno hasta llenar el arreglo.
			suma+=array[i]; //los elementos guardados en el arreglo se van sumando y se guardan en la variable suma.
		}
		
		media = suma/array.length; //En la variable media se guarda la divisi�n de la suma entre el tama�o del arreglo.
		
		System.out.println("La suma de los elementos del arreglo es: "+suma);
		System.out.println("La media de los elementos del arreglo es: "+media);
	}

}
