package POO;

import javax.swing.JOptionPane;

public abstract class Operaciones_ClasePadre {

protected int valor1, valor2, resultado;
	
	public void PedirDatos() {
		
		valor1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer valor"));
		valor2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo valor"));
		
	}
	
	public abstract void Operaciones();
	
	public void MostrarResultado() {
		
		JOptionPane.showMessageDialog(null, "El resultado es: "+resultado);
	}
}
