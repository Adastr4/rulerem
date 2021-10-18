package it.profilglass.classmodel;

public class CentroLavoro {
	private String idCentro;
	private String descrizione;
	
	public CentroLavoro(String idCentro, String descrizione)
	{
		this.idCentro = idCentro;
		this.descrizione = descrizione;
	}
	
	public CentroLavoro()
	{
		this.idCentro = "";
		this.descrizione = "";
	}

	public String getIdCentro() {
		return idCentro;
	}

	public void setIdCentro(String idCentro) {
		this.idCentro = idCentro;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
}
