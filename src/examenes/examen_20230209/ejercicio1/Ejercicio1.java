package examenes.examen_20230209.ejercicio1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;


public class Ejercicio1 {

	public static void main(String[] args) {
		
		String[] codigos = new String[] {"NOMBRE", "APELLIDO", "LOCALIDAD", "PAIS", "EDAD", "ANIO_NACIMIENTO", "PISO", "ESTATURA"};
		List<Integer> numeros = new ArrayList<Integer>();
		int num;
		
		
		HashMap<String, Object> hm = inicializarHashMap(codigos);
		Iterator<Object> it = hm.values().iterator();
		
		while (it.hasNext()) {
			
			//Intento pasar los compententes del Iterator que son los del HashMap a la lista de números
			try {
				num = Integer.parseInt((String) it.next());
				numeros.add(num);
			}
			catch (Exception e) {
				
			}
		}
		
		//Recorro la lista de los números
		for (Integer i : numeros) {
			System.out.println(i);
		}
	}

	private static HashMap<String, Object> inicializarHashMap(String[] cod) {
		
		HashMap<String, Object> hm = new HashMap<String, Object>();
		
		//Añado los componentes del fichero de propiedades al HashMap
		for (int i = 0; i < cod.length; i++) {
			hm.put(cod[i], LeerFicheroDePropiedades.getProperty(cod[i]));
		}
		
		return hm;
		
	}
	
	 

}
