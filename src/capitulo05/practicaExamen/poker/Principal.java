package capitulo05.practicaExamen.poker;

public class Principal {

	public static void main(String[] args) {
		Baraja b = new Baraja();
		Poker p = new Poker();
		boolean tienenMano = false;
		
		
		b.arribaAbajo();
		System.out.println(b.toString());
		
		b.abajoArriba();
		System.out.println(b.toString());
		
		b.barajar();
		System.out.println(b.toString());
		
		b.ordenar();
		System.out.println(b.toString());
		
		p.repartir(b);
		for (int i = 0; i < p.getJugador().length; i++) {
			if(p.getJugador()[i].getMano() != "ninguna") {
				System.out.println(p.getJugador()[i].getNombre()+ " tiene " + p.getJugador()[i].getMano());
				tienenMano = true;
			}
		}
		if(!tienenMano) {
			System.out.println("Nadie tiene ninguna mano");
		}
		
		
		
		

	}

}
