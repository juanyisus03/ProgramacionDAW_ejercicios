package capitulo07.bloque01;

/*
 * Crea un programa que lea un fichero de propiedades, creado por ti, y que contenga:
 *- Una propiedad de tipo texto.
 *- Una propiedad de tipo entero.
 *- Una propiedad de tipo flotante.
 *- Una propiedad de tipo booleano
 * 
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class LeerFicheroPropiedades {

	private static Properties propiedades = null;

	public LeerFicheroPropiedades () {
		super();
	}
	
	/**
	 * 
	 * @return
	 */
	private static Properties getPropiedades() {
		if (propiedades == null) {
			propiedades = new Properties();
		    
			try {
				// Una forma de leer el fichero de propiedades
//				propiedades.load(propiedades.getClass().getResourceAsStream("/tutorialJava/capitulo6_Recursos/ejemplo.properties"));

				// Otra forma de leer el fichero de propiedades
				File file = new File("./src/capitulo07/bloque01/ejemplo.properties");
				System.out.println("Fichero encontrado: " + file.exists());
				propiedades.load(new FileReader(file));
			
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
		}
		return propiedades;
	}

	/**
	 * 
	 * @param nombrePropiedad
	 * @return
	 */
	public static String getProperty(String nombrePropiedad) {
		return getPropiedades().getProperty(nombrePropiedad);
	}

	
	/**
	 * 
	 * @param nombrePropiedad
	 * @return
	 */
	public static int getIntProperty (String nombrePropiedad) {
		return Integer.parseInt(getPropiedades().getProperty(nombrePropiedad));
	}
	
	
	/**
	 * 
	 * @param nombrePropiedad
	 * @return
	 */
	public static Float getFloatProperty (String nombrePropiedad) {
		return Float.parseFloat(getPropiedades().getProperty(nombrePropiedad));
	}
	
	public static Boolean getBooleanProperty (String nombrePropiedad) {
		return Boolean.parseBoolean(getPropiedades().getProperty(nombrePropiedad));
	}
	
	/**
	 * 
	 * @param args
	 */
	public static void main (String args[]) {
		String nombre = LeerFicheroPropiedades.getProperty("NOMBRE");
		int edad = LeerFicheroPropiedades.getIntProperty("EDAD");
		float altura = LeerFicheroPropiedades.getFloatProperty("ALTURA");
		boolean difunto = LeerFicheroPropiedades.getBooleanProperty("MUERTO"); 
		
		System.out.println("Nombre: " + nombre);
		System.out.println("Edad : " + edad);
		System.out.println("Estatura: " + altura);
		System.out.println("Difunto: " + difunto);
	}
}