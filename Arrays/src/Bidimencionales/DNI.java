package Bidimencionales;
//https://www.aprenderaprogramar.com/index.php?option=com_content&view=article&id=182:ejercicios-ejemplos-resueltos-con-arrays-arreglos-unidimensionales-en-java-calcular-letra-dni-cu00904c&catid=58&Itemid=180

import java.util.Scanner;


public class DNI {

	public static Scanner x = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		int DNI; //Se crea la variable para guardar el valor que se ingrese por teclado.
		int tam [];
		System.out.print("Ingrese su DNI de 8 dígitos:");
		DNI = x.nextInt(); 
		ObtenerLetra(DNI); //Se llama al método y se le otorgo la variable DNI como dato.	
	}
	
	public static void ObtenerLetra(int numeroDNI) {
		String caracts = "TRWAGMYFPDXBNJZSQVHLCKE"; //Se crea una cadena de 23 elementos.
		char [] list = caracts.toCharArray(); //Se crea un arreglo de tipo char y la cadena de tipo de tipo String pasa a convertirse en caracteres independientes 1 a 1.
		int calculo = (numeroDNI%23); // Se calcula el resto o residuo del valor ingresado de la DNI entre 23.
		
		char letra = list[calculo]; //Variable de tipo Char que guarda la posición en la que se encuentra el caracter
									//Dentro del arreglo list se le da el valor de la variable calculo, y esta posicionará al espacio donde se guardó el caracter.
		System.out.println(numeroDNI+""+letra);
	}

}
