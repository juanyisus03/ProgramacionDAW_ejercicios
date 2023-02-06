package capitulo07.bloque02;

import java.util.Calendar;
import java.util.TimeZone;

/*
 * Obtén la hora actual en Roma (Italia), también la hora actual en Washintong (EEUU) y calcula la diferencia horaria entre las dos ciudades.
 */

public class DiferenciaHorariaRomaWashintong {
	 
	public static void main(String[] args) {
		Calendar calendarioRoma = Calendar.getInstance(TimeZone.getTimeZone("Europe/Rome"));
		Calendar calendarioWashintong = Calendar.getInstance(TimeZone.getTimeZone("America/New_York"));
		int dif = Math.abs(calendarioRoma.get(Calendar.HOUR_OF_DAY) - calendarioWashintong.get(Calendar.HOUR_OF_DAY));
		System.out.println("La diferencia horaria entre Washintong y Roma es de " + dif + "horas.");
	}

}
