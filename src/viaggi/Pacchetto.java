package viaggi;

import java.util.*;

public class Pacchetto {
	private String ID;
	private String descrizione;
	private int postiTotali;
	@SuppressWarnings("rawtypes")
	private Vector prenotazioni;
	
	@SuppressWarnings("rawtypes")
	public Pacchetto(String ID, String descrizione, int postiTotali) {
		if (ID.length() > 0 )
			this.ID = ID;
		else
			throw new IllegalArgumentException("Lunghezza ID deve essere maggiore di 0");
		
		if (descrizione.length() > 0)
			this.descrizione = descrizione;
		else
			throw new IllegalArgumentException("Lunghezza descrizione deve essere maggiore di 0");
		
		if (postiTotali > 0)
			this.postiTotali = postiTotali;
		else
			throw new IllegalArgumentException("Posti totali deve essere maggiore di 0");
		prenotazioni = new Vector();
	}
	
	public String getID() {
		return ID;
	}
	
	public String getDescrizione() {
		return descrizione;
	}
	
	public int getPostiTotali() {
		return postiTotali;
	}
	
	@SuppressWarnings("rawtypes")
	public Vector getPrenotazioni() {
		return prenotazioni;
	}
	
	public int getPostiDisponibili() {
		int r = postiTotali;
		for(int i=0; i<prenotazioni.size(); i++)
			r -= ((Prenotazione)prenotazioni.elementAt(i)).getPosti();
		return r;
	}
	
	@SuppressWarnings("unchecked")
	public void addPrenotazione(Prenotazione p) throws Exception {
		if(p != null) {
			int postiDisponibili = this.getPostiDisponibili();
			int postiRichiesti = p.getPosti();
			if(postiRichiesti <= postiDisponibili) {
				prenotazioni.addElement(p);
			}
			else {
				throw new Exception("Posti disponibili (" + postiDisponibili + ") non sufficienti per i posti richiesti (" + postiRichiesti + ").");
			}
		}
		else {
			throw new IllegalArgumentException("Prenotazione non può essere null");
		}
	}
}
