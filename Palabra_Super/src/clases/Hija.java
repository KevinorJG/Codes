package clases;

import javax.swing.JOptionPane;

public class Hija extends Padre {
	
	public void Saludo() {
		//Usando la palabra super se herada el m�todo de la clase padre en la clase hija sin importar si el nombre de los m�todos se repite.
		super.Saludo();
		
		//Mensaje que muestra el m�todo Saludo de la clase hija.
		JOptionPane.showInternalMessageDialog(null, "Hola soy la hija");
	}

}
