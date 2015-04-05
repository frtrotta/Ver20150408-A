package viaggi;

public class Cliente {

	private String nome;
	private String cognome;
	private String email;
	
	public Cliente(String nome, String cognome, String email) {
		if (nome.length() > 0)
			this.nome = nome;
		else
			throw new IllegalArgumentException("Lunghezza nome deve essere maggiore di 0");
		
		if (cognome.length() > 0)
			this.cognome = cognome;
		else
			throw new IllegalArgumentException("Lunghezza cognome deve essere maggiore di 0");
		
		if (email.length() > 0)
			this.email = email;
		else
			throw new IllegalArgumentException("Lunghezza email deve essere maggiore di 0");
	}
	
	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

	public String getEmail() {
		return email;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", cognome=" + cognome + ", email="
				+ email + "]";
	}
	
	
}
