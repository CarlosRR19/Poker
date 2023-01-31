package vector;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Baraja baraja = new Baraja ();
		Mano mano = new Mano("Mano1", 5);
		
		baraja.generarBaraja();
		
		System.out.println(baraja.toString());
		System.out.println(baraja.darCarta());
		mano.cogerCarta(baraja.darCarta());
		System.out.println(mano.toString());
	
	}

}
