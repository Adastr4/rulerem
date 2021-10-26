package it.profilglass.orm;

import java.io.Serializable;

import com.sun.istack.NotNull;

public class DistintaOrmIdentity implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@NotNull
	private String codiceArticoloPadre;
	
	@NotNull
	private int revisione;
	
	@NotNull
	private int posizione;
	
	public DistintaOrmIdentity(String codiceArticoloPadre, int revisione, int posizione)
	{
		this.codiceArticoloPadre = codiceArticoloPadre;
		this.revisione = revisione;
		this.posizione = posizione;
	}
	
	public DistintaOrmIdentity()
	{
		this.codiceArticoloPadre = "";
		this.revisione = 0;
		this.posizione = 0;
	}

	public String getCodiceArticoloPadre() {
		return codiceArticoloPadre;
	}

	public void setCodiceArticoloPadre(String codiceArticoloPadre) {
		this.codiceArticoloPadre = codiceArticoloPadre;
	}

	public int getRevisione() {
		return revisione;
	}

	public void setRevisione(int revisione) {
		this.revisione = revisione;
	}

	public int getPosizione() {
		return posizione;
	}

	public void setPosizione(int posizione) {
		this.posizione = posizione;
	}
}
