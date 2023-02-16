package examenes.examen_20230209;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Ejercicio5 {

	public static void main(String[] args) {
		String fecha = "2023-02-09 10.30.27";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH.mm.ss");
		Date fechaParseada = null;
		
		try {
			fechaParseada = sdf.parse(fecha);
		} catch (ParseException e) {
			System.out.println ("Error en el parseo de la fecha");
			e.printStackTrace();
		}
		//Resto dos semanas al Calendar creado a partir del Date debido que no se pueden restar al Date
		Calendar cal = Calendar.getInstance();
		cal.setTime(fechaParseada);
		cal.add(Calendar.WEEK_OF_YEAR, -2);
		fechaParseada = cal.getTime();
		System.out.println(sdf.format(fechaParseada));
		
		//Con los sets pongo que la segunda fecha del date
		cal.set(Calendar.YEAR, fechaParseada.getYear()+1900);
		cal.set(Calendar.MONTH, fechaParseada.getMonth());
		cal.set(Calendar.DAY_OF_MONTH, fechaParseada.getDate());
		cal.set(Calendar.HOUR_OF_DAY, fechaParseada.getHours());
		cal.set(Calendar.MINUTE, fechaParseada.getMinutes());
		cal.set(Calendar.SECOND, fechaParseada.getSeconds());
		
		//Imprimo la fecha
		System.out.println(cal.getTime());
		
		//Hallo la diferencia horaria entre Lisboa y las Islas Galápagos
		Calendar calendarioGalapagos = Calendar.getInstance(TimeZone.getTimeZone("Pacific/Galapagos"));
		Calendar calendarioLisboa = Calendar.getInstance(TimeZone.getTimeZone("Europe/Lisbon"));
		int dif = Math.abs(calendarioGalapagos.get(Calendar.HOUR_OF_DAY) - calendarioLisboa.get(Calendar.HOUR_OF_DAY));
		System.out.println("La diferencia horaria entre Lisboa y las Islas Galápagos es de " + dif + " horas.");
		
		
		
	}

}
