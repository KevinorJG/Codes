package POO;

import javax.swing.JOptionPane;

public class Main {

	boolean op = true;
	public static void main(String[] args) {
		
		Operaciones_ClasePadre x = new Suma_Hija();
		x.PedirDatos();
		x.Operaciones();
		x.MostrarResultado();
		
		JOptionPane.showConfirmDialog(null, "Continua...", "Siguiente operación.", JOptionPane.DEFAULT_OPTION);
		
		Operaciones_ClasePadre y = new Resta_Hija();
		y.PedirDatos();
		y.Operaciones();
		y.MostrarResultado();
	}

}
