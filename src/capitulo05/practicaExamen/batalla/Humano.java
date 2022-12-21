package capitulo05.practicaExamen.batalla;

public class Humano extends Personaje{
	
	public Humano() {
		super();
	}
	
	@Override
	public String toString() {
		if(isVivo()) {
			return "[Humano vivo hp: " + getHp() + ", nombre: " + getNombre() + ", disparos: " + getDisparos() + "]";
		}
		else {
			return "[Humano muerto hp: " + getHp() + ", nombre: " + getNombre() + ", disparos: " + getDisparos() + "]";
		}
	}

}
