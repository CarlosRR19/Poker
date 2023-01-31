package vector;

public class Baraja {

	Carta[]cartas;
	
	public Baraja () {
		cartas = new Carta[52];
	}
	
	public void generarBaraja() {
		String valor = "";
		String numero = "";
		String palo = "";
		int posicion = 0;
		Boolean enBaraja = false;
		
		for (int i = 0; i < 4; i++) {
			switch (i) {
			case 0:
				palo = "D";
				break;
			case 1:
				palo = "P";
				break;
			case 2:
				palo = "T";
				break;
			case 3:
				palo = "C";
				break;

			default:
				break;
			}
			
			for (int j = 0; j < 13; j++) {
				switch (j) {
				case 0:
					numero = " as";
					break;

				case 1:
					numero = " dos";
					break;

				case 2:
					numero = " tres";
					break;

				case 3:
					numero = " cuatro";
					break;

				case 4:
					numero = " cinco";
					break;

				case 5:
					numero = " seis";
					break;

				case 6:
					numero = " siete";
					break;

				case 7:
					numero = " ocho";
					break;

				case 8:
					numero = " nueve";
					break;

				case 9:
					numero = " diez";
					break;

				case 10:
					numero = " j";
					break;

				case 11:
					numero = " q";
					break;
					
				case 12:
					numero = " k";
					break;


				default:
					break;
				}
				
				valor = palo;
				valor += numero;
				cartas[posicion] = new Carta(valor, enBaraja);
				valor = "";
				posicion++;
				
			}
		}
	}
	
	public Carta darCarta() {
		boolean dentro = false;
		int posicionAleatoria = (int) (Math.random() * 51);
		int posicion = 0;
		
		while (dentro != true) {
			if (cartas[posicionAleatoria].enBaraja == true) {
				cartas[posicionAleatoria].enBaraja = false;
				posicion = posicionAleatoria;
				dentro = true;
			}
		posicionAleatoria = (int) (Math.random() * 51);
		}
		
		return cartas[posicion];
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
