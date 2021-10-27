package Bidimencionales;

import java.util.Scanner;

public class Ejercicio7 {

	public static Scanner x = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String [][] nombres;
		int [][] edades;
		
		nombres = new String[2][2];
		edades = new int[2][2];
		
		for(int i=0; i<nombres.length; i++ ) { //RECORRE LAS FILAS
			for(int j=0; j<nombres[i].length; j++) { // RECORRE LAS COLUMNAS
				
			System.out.print("Ingrese los nombres ["+i+"]"+"["+j+"]");
			String name = x.nextLine();
			
			nombres[i][j] = name;
			
				
			}
		}
		for(int i=0; i<edades.length; i++ ) {
			for(int j=0; j<edades[i].length; j++) {
				System.out.print("Ingrese las edades ["+i+"]"+"["+j+"]");
				int age = x.nextInt();
				
				edades[i][j] = age;
			}
		}
			
		
		
		for(int i=0; i<nombres.length; i++ ) { 
			for(int j=0; j<nombres[i].length; j++) {
				
				System.out.print(" "+nombres[i][j]);
				
			}
			System.out.println("");
		}
		
		
	}

}
