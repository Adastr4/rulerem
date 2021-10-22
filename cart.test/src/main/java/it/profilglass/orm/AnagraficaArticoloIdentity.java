package it.profilglass.orm;

import java.io.Serializable;

import com.sun.istack.NotNull;

public class AnagraficaArticoloIdentity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@NotNull
	private String codiceArticolo;
	
	@NotNull
	private int revisione;
	
	public AnagraficaArticoloIdentity(String codiceArticolo, int revisione)
	{
		this.codiceArticolo = codiceArticolo;
		this.revisione = revisione;
	}
	
	public AnagraficaArticoloIdentity()
	{
		this.codiceArticolo = "";
		this.revisione = 0;
	}

	public String getCodiceArticolo() {
		return codiceArticolo;
	}

	public void setCodiceArticolo(String codiceArticolo) {
		this.codiceArticolo = codiceArticolo;
	}

	public int getRevisione() {
		return revisione;
	}

	public void setRevisione(int revisione) {
		this.revisione = revisione;
	}
}
