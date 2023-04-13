package capitulo07.bloque03.listener;

import javax.swing.JOptionPane;

public class Juanje implements OperationListener{
	
	public Juanje() {
		Principal.addOperationListener(this);
	}

	@Override
	public void negativeResultSubtraction(OperationEvent e) {
		JOptionPane.showMessageDialog(null, "El resultado de la resta es negativo. " + e.getPart1() + " - " + e.getPart2() + " = " + e.getResult());
		
	}

	@Override
	public void resultOverThousand(OperationEvent e) {
		JOptionPane.showMessageDialog(null, "El resultado es mayor que 1000 y es " + e.getResult());
		
	}

	@Override
	public void dividingByZero(OperationEvent e) {
		 JOptionPane.showMessageDialog(null, "Has tratado de dividir "+ e.getDiv() + "entre 0");
		
	}

	@Override
	public void squareRootBaseNegative(OperationEvent e) {
		 JOptionPane.showMessageDialog(null, "Has tratado de averiguar la raiz cuadrada de un numero negativo: " + e.getBase());
		
	}

}
