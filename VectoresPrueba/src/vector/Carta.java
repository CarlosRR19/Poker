package vector;

public class Carta {

	String valor;
	boolean enBaraja = true;
	
	public Carta (String valor, boolean enBaraja) {
		this.valor = valor;
		enBaraja = true;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public boolean isEnBaraja() {
		return enBaraja;
	}

	public void setEnBaraja(boolean enBaraja) {
		this.enBaraja = enBaraja;
	}

	@Override
	public String toString() {
		return "Carta [valor=" + valor + ", enBaraja=" + enBaraja + "]";
	}


	
}
