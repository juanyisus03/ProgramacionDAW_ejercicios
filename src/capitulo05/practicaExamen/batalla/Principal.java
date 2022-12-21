package capitulo05.practicaExamen.batalla;

public class Principal {
	public static void main(String args[]) {
		CampoBatalla cb = new CampoBatalla();
		cb.comenzarBatalla();
		cb.mezclarHumanos();
		cb.mezclarMalvados();
		System.out.println("Han ganado los " + cb.getGanador());
		
	}

}
