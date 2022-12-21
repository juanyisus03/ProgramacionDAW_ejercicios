package capitulo05.practicaExamen.Vajilla;

public class Principal {

	public static void main(String[] args) {
		Plato pila[] = new Plato[10];
		Plato limpios[] = new Plato[pila.length];
		Plato rotos[] = new Plato[pila.length];
		
		for (int i = pila.length - 1; i > -1; i--) {
			do {
				pila[i].limpiar();
			}while(!pila[i].isRoto() && pila[i].getSuciedadReal() > 0);
			if(pila[i].isRoto()) {
				rotos[i] = pila[i];
			}
			else {
				limpios[i] = pila[i];
			}
			
			
		}

	}

}
