package Bidimencionales;
import java.util.Scanner;

//Crea un array de caracteres que contenga de la ‘A’ a la ‘Z’ (solo las mayúsculas). 
//Después, ve pidiendo posiciones del array por teclado y si la posicion es correcta, 
//se añadira a una cadena que se mostrara al final, se dejará de insertar cuando se introduzca un -1.

//Por ejemplo, si escribo los siguientes numeros
//0 Añadira la ‘A’
//5 Añadira la ‘F’
//25 Añadira la ‘Z’
//50 Error, inserte otro numero
//1 fin

//Cadena resultante: AFZ
public class Ejercicio4 {

	public static Scanner x = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		char mayusculas[] = new char[26];
		//Se crea un for que genera las letras del abecedario, en interador "i" se le asigna un valor por default de 65
		//luego se le pone un limite contando las posiciones ((26+65)-1).
		//la variable "j" se asigna valor de 0 ya que este recorrera desde la posicion 0 del arreglo hasta la ultima posición.
		
        for (int i = 65, j = 0; i <= 90; i++, j++) {
            mayusculas[j] = (char) i; // La varibale "j" se le asigna al arreglo para que este recorra y la variable "i" se le asigna
            						//al aun dato de tipo char el cual generará las letras... y estan se guardaran en el arreglo.
        }
 
        String cadena = ""; //En esta variable se guardan los caracteres selecionados apartir de la posición en la que se encuentren.
        
        int eleccion = 1; //Esta variable se le asigna 1 para indicar que el proceso se detenga.
 
        do {
        	
            System.out.println("Elija un indice entre 0 y " + (mayusculas.length - 1));
            eleccion = x.nextInt();
 
            if (!(eleccion >= 0 && eleccion <= mayusculas.length )) {
            	
                System.out.println("Error, inserte otro numero");
            } else {
            	
                if (eleccion != 1) {
                    cadena += mayusculas[eleccion];
                }
            }
 
        } while (eleccion != 1);
 
        System.out.println(cadena);

	}

}
