package capitulo07.bloque02;

/*
 *  Averiguar, con una precisión inferior a 0.001, en qué punto (x, y) se cortan las gráficas de las siguientes funciones:
 *  y = sqrt(x)
 *  y = - ln(x)
 */

public class IgualarEcuaciones {

	public static void main(String[] args) {
		int x = 0;
		double y1, y2;
		System.out.println("Unión y=√x, y=-ln(x) ");
		do {
			
			x+= 0.0001;
			y1 = Math.sqrt(x);
			y2 = - Math.log(x);
			
			
		}while(Math.abs(y1-y2) > 0.0001);
		
		System.out.println("x: " + x);
		System.out.println("y1: " + y1);
		System.out.println("y2: " + y2);
	}

}
