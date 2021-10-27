package Paquete;
import java.util.Scanner;
public class SIN_METODOS {
public static Scanner x = new Scanner(System.in);
	public static void main(String[] args) {
		int max = 100, min= 1, range = max - min+1;
		int pos = 0, pos2 = 0, contadorN=0, contadorM=0, in = 0;
		int [] arreglo;
		int [] Mayores;
		int [] Menores;
		System.out.print("Ingrese el tamaño del arreglo:");
		int tam = x.nextInt(); 
		
		arreglo = new int [tam];
		
		for(int i=0; i<arreglo.length; i++) {
			arreglo[i]=(int)(Math.random() * range)*(int)Math.pow((-1),(int)(Math.random() * 2)+1);		
			
		}
		
		for(int i=0; i<arreglo.length; i++) {
			System.out.printf("%8d",arreglo[i]);
		}
		System.out.println("");
		
		
		for(int i=0; i<arreglo.length; i++) {
			
					if(arreglo[i] < 0) {
						contadorN++;
						
					}
					if(arreglo[i] > 0) {
						contadorM++;
					}
		}
		System.out.println("\nCantidad de números Mayores: "+contadorM+"\nCantidad de números Menores: "+contadorN+"\n");
		Mayores= new int[contadorM];
		Menores = new int [contadorN];
		
		for(int i=0; i<arreglo.length; i++) {
			for(int j=0; j<Menores.length/contadorN; j++) {
				if(arreglo[i] < 0) {
					pos=arreglo[i];
					Menores[j]=pos;
					System.out.print(" ["+Menores[j]+"]");
					
					
				}
			}
			
		}
		System.out.println(" ");
		
		for(int i=0; i<arreglo.length; i++) {
			for(int j=0; j<Mayores.length/contadorM; j++) {
				if(arreglo[i] > 0) {
					pos2=arreglo[i];
					Mayores[j]=pos2;
					System.out.print(" ["+Mayores[j]+"]");
				}
			}
		}
			
		
		
	}

}
