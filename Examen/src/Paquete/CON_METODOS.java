package Paquete;

import java.util.Scanner;

public class CON_METODOS {
	
	public static int [] LlenarArray(int longitud) {
		int [] array = new int [longitud];
		for(int i=0; i<array.length; i++) {
			array[i]=(int)(Math.random() * 100+1)*(int)Math.pow((-1),(int)(Math.random() * 2)+1);		
		}
		return array;
	}
	
	public static void MostrarArray(int [] array) {
		for(int i=0; i<array.length; i++) {
			System.out.printf("%8d",array[i]);
		}
		System.out.println("");
	}
	
	public static int CalcularMayores(int [] array) {
		int M=0;
		for(int i=0; i<array.length; i++) {
			if(array[i] > 0) {
				M++;
			}
		}
		return M;
	}
	
	public static int CalcularMenores(int [] array) {
		int N=0;
		for(int i=0; i<array.length; i++) {
			if(array[i] < 0) {
				N++;
			}
		}
		return N;
	}
	
	public static void Separador(int [] A, int [] Mayores, int [] Menores, int contadorN, int contadorM ) {
		int pos, pos2;
		for(int i=0; i<A.length; i++) {
			for(int j=0; j<Menores.length/contadorN; j++) {
				if(A[i] < 0) {
					pos=A[i];
					Menores[j]=pos;
					System.out.print(" ["+Menores[j]+"]");
				}
			}
			
		}
		
		System.out.println(" ");
		
		for(int i=0; i<A.length; i++) {
			for(int j=0; j<Mayores.length/contadorM; j++) {
				if(A[i] > 0) {
					pos2=A[i];
					Mayores[j]=pos2;
					System.out.print(" ["+Mayores[j]+"]");
				}
			}
		}
	}
	
	public static Scanner x = new Scanner(System.in);
	
	public static void main(String[] args) {
	 int [] Mayor;
	 int [] Menor;
	 int ContadorN, contadorM;
	 
	 System.out.print("Ingrese el tamaño del arreglo: "); 
	 int tam = x.nextInt();
	 
	int [] A = new int [tam];
	A=LlenarArray(tam);
	ContadorN = CalcularMenores(A);
	contadorM = CalcularMayores(A);
	MostrarArray(A);
	System.out.println("\nCantidad de números Mayores: "+contadorM+"\nCantidad de números Menores: "+ContadorN+"\n");
	
	
	Mayor = new int [CalcularMayores(A)];
	Menor = new int [CalcularMenores(A)];
	
	
	
	Separador(A, Mayor, Menor, ContadorN, contadorM);
	}

}
