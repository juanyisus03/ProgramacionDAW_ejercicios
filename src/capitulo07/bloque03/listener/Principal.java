package capitulo07.bloque03.listener;



import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Principal {
	
	private static List<OperationListener> listener = new ArrayList<OperationListener>();
	
	public static void addOperationListener(OperationListener l) {
		listener.add(l);
	}
	
	public static void removeOperationListener(OperationListener l) {
		listener.remove(l);
	}
	
	private static void fireNegativeResultSubtraction(int num1, int num2, int res) {
		for (int i = listener.size()-1; i > -1; i--) {
			OperationEvent e = new OperationEvent();
			e.setPart1(num1);
			e.setPart2(num2);
			e.setResult(res);
			listener.get(i).negativeResultSubtraction(e);
		}
	}
	
	private static void fireResultOverThousand(int num1, int num2, int res) {
		for (int i = listener.size()-1; i > -1; i--) {
			OperationEvent e = new OperationEvent();
			e.setPart1(num1);
			e.setPart2(num2);
			e.setResult(res);
			listener.get(i).resultOverThousand(e);
		}
	}
	
	private static void fireDividingByZero(int num1) {
		for (int i = listener.size()-1; i > -1; i--) {
			OperationEvent e = new OperationEvent();
			e.setDiv(num1);
			listener.get(i).dividingByZero(e);
		}
		
	}
	
	private static void fireSquareRootBaseNegative(int num1) {
		for (int i = listener.size()-1; i > -1; i--) {
			OperationEvent e = new OperationEvent();
			e.setBase(num1);
			listener.get(i).squareRootBaseNegative(e);
		}
		
	}
	
	public static void main(String[] args) {
		int num1;
		int num2;
		int opt = -1;
		Juanje jj = new Juanje();
		
		
		do {
			
			opt = menu();
			switch (opt) {
				case 1: {
					sum();
					break;
				}
				
				case 2: {
					substract();
					break;
				}
				
				case 3: {
					multiply();
					break;
				}
				
				case 4: {
					divide();
					break;
				}
				
				case 5: {
					squareRoot();
					break;
				}
				
				
			}	
			
		}while(opt != 0);
		
		
	}

	private static void squareRoot() {
		int num1;
		try {
			num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca base: "));
			if(num1<0) fireSquareRootBaseNegative(num1);
			else System.out.println("√" + num1 + " = " + Math.sqrt(num1));
		}catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "No introdujo un número");
			
		}
	}

	

	private static void divide() {
		int num1;
		int num2;
		try {
			num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca dividendo: "));
			num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca divisor: "));
			if(num2 == 0) fireDividingByZero(num1);
			else System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
			
			
		}catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "No introdujo un número");
			
		}
	}

	

	private static void multiply() {
		int num1;
		int num2;
		try {
			num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca multiplicando: "));
			num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca multiplicador: "));
			System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
			if(num1*num2>1000) fireResultOverThousand(num1, num2, (num1*num2));
			
		}catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "No introdujo un número");
			
		}
	}

	private static void substract() {
		int num1;
		int num2;
		try {
			num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca minuendo: "));
			num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca sustraendo: "));
			System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
			
			if(num1-num2<0) fireNegativeResultSubtraction(num1, num2, (num1-num2));
			
		}catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "No introdujo un número");
			
		}
	}

	private static void sum() {
		int num1;
		int num2;
		try {
			
			num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca sumando: "));
			num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca sumando: "));
			System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
			
			if((num1+num2) > 1000) {
				fireResultOverThousand(num1, num2, (num1+num2));
			}
			
		}catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "No introdujo un número");
			
		}
	}

	private static int menu() {
		int opt = -1;
		System.out.println("1. Sumar");
		System.out.println("2. Restar");
		System.out.println("3. Multiplicar");
		System.out.println("4. Dividir");
		System.out.println("5. Raiz Cuadrada");
		System.out.println("0. Salir");
		try {
			opt = Integer.parseInt(JOptionPane.showInputDialog("Introduzca opción: "));
		}catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "No introdujo un número");
		}
		return opt;
	}

}
