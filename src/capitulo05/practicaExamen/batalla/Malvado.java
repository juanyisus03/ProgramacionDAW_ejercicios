package capitulo05.practicaExamen.batalla;

public class Malvado extends Personaje {

	public Malvado() {
		super();
	}

	@Override
	public String toString() {
		if(isVivo()) {
			return "[Malvado vivo hp: " + getHp() + ", nombre: " + getNombre() + ", disparos: " + getDisparos() + "]";
		}
		else {
			return "[Malvado muerto hp: " + getHp() + ", nombre: " + getNombre() + ", disparos: " + getDisparos() + "]";
		}
	}

}
