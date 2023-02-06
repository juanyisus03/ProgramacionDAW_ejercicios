package capitulo07.bloque02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import javax.swing.JOptionPane;


/*
 * Crea un programa en Java que pida al usuario la introducción de una fecha a través de JOptionPane. El usuario te especificará un dato de tipo String y tú debes convertirlo a un objeto de tipo java.util.Date utilizando SimpleDateFormat. A continuación realiza las siguientes acciones
 *- Con el objeto java.util.Date, crea un objeto de tipo Calendar y que represente la misma fecha que ha introducido el usuario.
 *- Obtén en pantalla los siguientes campos: año, mes, día, hora, minuto y segundo. Cada campo debe aparecer en una línea de la consola. Debes obtener cada campo desde el objeto java.util.Date y desde el objeto Calendar. Es decir, cada campo debe ser obtenido dos veces en pantalla.
 *- Utiliza el objeto de tipo Calendar para obtener nuevas fechas e imprimirlas en pantalla: suma 3 días, resta 2 semanas, suma 300 días, suma 4 años.
 * 
 */


public class Fecha {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/mm/dd");
		String fecha = JOptionPane.showInputDialog("Introduzca fecha yyyy/mm/dd: ");
		Date fechaParseada = null;
		// El parseo de fechas debe obligatoriamente ser inspeccionado con un bloque de manejo de excepciones
		try {
			fechaParseada = sdf.parse(fecha);
		} catch (ParseException e) {
			System.out.println ("Error en el parseo de la fecha");
			e.printStackTrace();
		}
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(fechaParseada);
		
		System.out.println("Año con date: " + (fechaParseada.getYear() + 1900 )+ "  Año con calendar: " + cal.get(Calendar.YEAR));
		System.out.println("Mes con date: " + (fechaParseada.getMonth() + 1  )+ "  Mes con calendar: " + cal.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.getDefault()));
		System.out.println("Día con date: " + fechaParseada.getDate() + "  Día con calendar: " + cal.get(Calendar.DATE));
		System.out.println("Hora con date: " + fechaParseada.getHours() + "  Hora con calendar: " + cal.get(Calendar.HOUR));
		System.out.println("Minutos con date: " + fechaParseada.getMinutes() + "  Minutos con calendar: " + cal.get(Calendar.MINUTE));
		System.out.println("Segundos con date: " + fechaParseada.getSeconds() + "  Segundo con calendar: " + cal.get(Calendar.SECOND));
		
		System.out.println("/n/n/n");
	
		cal.add(Calendar.DAY_OF_MONTH, 3);
		System.out.println("Fecha más 3 dias: " + cal.getTime());
		cal.add(Calendar.WEEK_OF_YEAR, -2);
		System.out.println("Fecha menos 2 semanas : " + cal.getTime());
		cal.add(Calendar.DAY_OF_MONTH, 300);
		System.out.println("Fecha más 300 dias: " + cal.getTime());
		cal.add(Calendar.YEAR, 4);
		System.out.println("Fecha más 4 años: " + cal.getTime());
		
	
	
	}

}
