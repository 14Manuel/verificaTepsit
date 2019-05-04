package verifica;

public class Commento 
{
	private String user;
	private String descrizione;
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public Commento(String user, String descrizione) {
		this.user = user;
		this.descrizione = descrizione;
	}
	
	
}

