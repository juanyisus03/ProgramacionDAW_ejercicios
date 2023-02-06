package capitulo07.bloque01;

/*
 * Realizar un programa que imprima una tabla (simplemente unas líneas en la consola) con los límites máximo y mínimo representables para los diferentes tipos primitivos en 
 * Java (byte, int, short, long, float, double). En la tabla también deberá aparecer el número de bytes que cada tipo usa para su representación.
 * 
 */

public class MinimosYMaximosTiposPrimitivos {

	public static void main(String[] args) {
		System.out.println("          ------------------------------------------------------------");
		System.out.println("          |         Min        |         Max          |   Nº Bytes   |");
		System.out.println("----------------------------------------------------------------------");
		System.out.println("|  Byte   |        "+   Byte.MIN_VALUE   + "        |         " +   Byte.MAX_VALUE    +"          |       " + Byte.SIZE);
		System.out.println("----------------------------------------------------------------------");
		System.out.println("|  Int    |    "+    Integer.MIN_VALUE    +"     |     "+    Integer.MAX_VALUE    +"       |       " + Integer.SIZE);
		System.out.println("----------------------------------------------------------------------");
		System.out.println("|  Short  |       "+    Short.MIN_VALUE    +"       |         "+    Short.MAX_VALUE    +"        |       " + Short.SIZE);
		System.out.println("----------------------------------------------------------------------");
		System.out.println("|  Long   |"+    Long.MIN_VALUE    +"| "+    Long.MAX_VALUE    +"  |       "+ Long.SIZE);
		System.out.println("----------------------------------------------------------------------");
		System.out.println("|  Float  |       "+    Float.MIN_VALUE    +"      |    "+    Float.MAX_VALUE    +"      |       "+ Float.SIZE);
		System.out.println("----------------------------------------------------------------------");
		System.out.println("|  Double |      "+    Double.MIN_VALUE    +"      |"+    Double.MAX_VALUE    +"|       "+ Double.SIZE);
		System.out.println("----------------------------------------------------------------------");
		

	}

}
