//Dado un arreglo A de N elementos se desea almacenar los elementos mayores y menores que la media, almacenarlos en vectores diferentes.
//Almacenar números aleatorios en el arreglo A.

package Paquete;
import java.util.Scanner;
public class SIN_METODOS {
public static Scanner x = new Scanner(System.in);
	public static void main(String[] args) {
														//Se crean las variables contador para guardar la cantidad de numeros mayores y menores del arreglo.
		int pos = 0, pos2 = 0, contadorN=0, contadorM=0; //Se crean las siguientes variables para guardar la posición de los numeros mayores y menores.
		int [] arreglo; //Arreglo principal
		int [] Mayores; //Arreglo para guardar los elementos mayores del arreglo principal.
		int [] Menores;	//Arreglo para guardar los elementos menores del arreglo principal.
		
		System.out.print("Ingrese el tamaño del arreglo:");
		int tam = x.nextInt(); //Se lee el tamaño del arreglo.
		
		arreglo = new int [tam]; //Se le asigna un espacio en memoria y se le da el tamaño al arreglo.
		
		for(int i=0; i<arreglo.length; i++) { //Se llena el arreglo principal con numeros positivos y negativos.
			arreglo[i]=(int)(Math.random() * 100+1)*(int)Math.pow((-1),(int)(Math.random() * 2)+1);		
			
		}
		
		for(int i=0; i<arreglo.length; i++) { //Se imprime el arreglo principal.
			System.out.printf("%8d",arreglo[i]);
		}
		System.out.println(" ");
		
		
		for(int i=0; i<arreglo.length; i++) {//Se recorre el arreglo principal luego de haberlo llenado.
			
					if(arreglo[i] < 0) { //Los numeros menores a 0 que se encuentran en el arreglo seran contados.
						contadorN++; //Por cada numero del arreglo menor a 0 se ira contando de uno en uno.
						
					}
					if(arreglo[i] > 0) {//Los numeros mayores a 0 que se encuentran en el arreglo sera contados.
						contadorM++; //Por cada numero del arreglo mayor a 0 se ira contando de uno en uno.
					}
		}
		System.out.println("\nCantidad de números Mayores: "+contadorM+"\nCantidad de números Menores: "+contadorN+"\n"); //Se imprime la cantidad de numeros mayores y menores a 0.
		Mayores = new int[contadorM]; //Se le otorga un tamaño al arreglo. El tamaño depende de los números que se contaron en la variable contadorM.
		Menores = new int[contadorN]; //Se le otorga un tamaña al arreglo. El tamaño depende de los números que se contaron en la varibale contadorN.
		
		for(int i=0; i<arreglo.length; i++) { //Se recorre el arreglo principal luego de haberse llenado de valores.
			for(int j=0; j<Menores.length/contadorN; j++) { // Se recorre el arreglo y el tamaño de este se divide entre la variable contadorN.
				if(arreglo[i] < 0) {//Los numeros menores a 0 que se encuentran en el arreglo pasan a lo siguiente...
					pos=arreglo[i]; //En la variable pos, se guarda el numero menor a 0 del arreglo.
					Menores[j]=pos; //En el arreglo Menores se guarda el valor de la variable pos.
					System.out.print(" ["+Menores[j]+"]"); //Se imprime el arreglo con los numeros menores a 0.
					
					
				}
			}
			
		}
		System.out.println(" ");
		
		for(int i=0; i<arreglo.length; i++) {  //Se recorre el arreglo principal luego de haberse llenado de valores.
			for(int j=0; j<Mayores.length/contadorM; j++) { // Se recorre el arreglo y el tamaño de este se divide entre la variable contadorM.
				if(arreglo[i] > 0) { //Los numeros mayores a 0 que se encuentran en el arreglo pasan a lo siguiente...
					pos2=arreglo[i]; //En la variable pos2, se guarda el numero mayor a 0 del arreglo.
					Mayores[j]=pos2; //En el arreglo Mayores se guarda el valor de la variable pos2.
					System.out.print(" ["+Mayores[j]+"]"); //Se imprime el arreglo con los numeros mayores a 0.
				}
			}
		}
			
		
		
	}

}
