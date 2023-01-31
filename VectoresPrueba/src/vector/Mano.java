package vector;

public class Mano {
	Carta[] cartas;
	String nombreMano;
	int indice;
	int numeroCartas;
	
	public Mano(String nombreMano, int tamanioMano) {
		this.nombreMano = nombreMano;
		this.numeroCartas = tamanioMano;
		
	}
	
	public int getIndice() {
		return indice;
	}

	public void setIndice(int indice) {
		this.indice = indice;
	}

	public void cogerCarta (Carta cartaRobada) {
		if (indice == (cartas.length -1))
			indice = 0;
		
		cartas[indice] = cartaRobada;
		indice++;
		
	}
	
	public String toString() {

		String devolver = "[";

		for (int i = 0; i < cartas.length; i++) {
			devolver += cartas[i] + " ";
		}
		devolver += "]";

		return devolver;

	}
}
