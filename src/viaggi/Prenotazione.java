package viaggi;

public class Prenotazione {
	private String ID;
	private Cliente cliente;
	private int posti;
	
	public Prenotazione(String ID, Cliente cliente, int posti) {
		if (ID.length() > 0)
			this.ID = ID;
		else
			throw new IllegalArgumentException("Lunghezza ID deve essere maggiore di 0");
		
		if (cliente != null)
			this.cliente = cliente;
		else
			throw new IllegalArgumentException("Cliente non può essere null");
		
		if (posti > 0)
			this.posti = posti;
		else
			throw new IllegalArgumentException("Posti deve essere maggiore di 0");
	}

	public String getID() {
		return ID;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public int getPosti() {
		return posti;
	}

	@Override
	public String toString() {
		return "Prenotazione [ID=" + ID + ", cliente=" + cliente + ", posti="
				+ posti + "]";
	}
}
