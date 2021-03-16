package promedioNumeros;

import javax.swing.JOptionPane;

public class PromedioDeNnumeros {

	public static void main(String[] args) {
		
		double numeros = 0, suma = 0, resultado, contador=-1;
		
		while(numeros>=0) {
			
			
			suma+= numeros;
			contador++;
			numeros = Double.parseDouble(JOptionPane.showInputDialog("Digita un número"));

	}
	
		resultado=suma/contador;
		
		JOptionPane.showConfirmDialog(null, "El promedio de los números es: "+resultado);

}}
