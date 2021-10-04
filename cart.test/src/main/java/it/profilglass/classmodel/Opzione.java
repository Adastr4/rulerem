package it.profilglass.classmodel;

public class Opzione {
	private String opzione;
	private String descrizione;

	public Opzione(String opzione, String descrizione)
	{
		this.opzione = opzione;
		this.descrizione = descrizione;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public String getOpzione() {
		return opzione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public void setOpzione(String opzione) {
		this.opzione = opzione;
	}


}
