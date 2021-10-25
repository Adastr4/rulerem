package it.profilglass.orm;

import java.io.Serializable;

import com.sun.istack.NotNull;

public class CicloTestataIdentity implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@NotNull
	String codiceArticolo;
	
	@NotNull
	int revisione;
	
	@NotNull
	String ciclo;
	
	public CicloTestataIdentity(String codiceArticolo, int revisione, String ciclo)
	{
		this.ciclo = ciclo;
		this.codiceArticolo = codiceArticolo;
		this.revisione = revisione;
	}
	
	public CicloTestataIdentity()
	{
		this.ciclo = "";
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

	public String getCiclo() {
		return ciclo;
	}

	public void setCiclo(String ciclo) {
		this.ciclo = ciclo;
	}
}
