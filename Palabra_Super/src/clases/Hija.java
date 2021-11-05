package clases;

import javax.swing.JOptionPane;

public class Hija extends Padre {
	
	public void Saludo() {
		//Usando la palabra super se herada el método de la clase padre en la clase hija sin importar si el nombre de los métodos se repite.
		super.Saludo();
		
		//Mensaje que muestra el método Saludo de la clase hija.
		JOptionPane.showInternalMessageDialog(null, "Hola soy la hija");
	}

}
