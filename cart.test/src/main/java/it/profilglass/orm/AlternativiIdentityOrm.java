package it.profilglass.orm;

import java.io.Serializable;

import com.sun.istack.NotNull;

public class AlternativiIdentityOrm implements Serializable {
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
	
	@NotNull
	private int priorita;

	public AlternativiIdentityOrm(String codiceArticoloPadre, int revisione, int posizione, int priorita) {
		super();
		this.codiceArticoloPadre = codiceArticoloPadre;
		this.revisione = revisione;
		this.posizione = posizione;
		this.priorita = priorita;
	}
	
	public AlternativiIdentityOrm() {
		super();
		this.codiceArticoloPadre = "";
		this.revisione = 0;
		this.posizione = 0;
		this.priorita = 0;
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

	public int getPriorita() {
		return priorita;
	}

	public void setPriorita(int priorita) {
		this.priorita = priorita;
	}
}
