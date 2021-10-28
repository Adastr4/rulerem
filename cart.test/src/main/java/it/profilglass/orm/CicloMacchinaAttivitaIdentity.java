package it.profilglass.orm;

import java.io.Serializable;

import com.sun.istack.NotNull;

public class CicloMacchinaAttivitaIdentity implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@NotNull
	private String attivita;
	
	@NotNull
	private String macchina;
	
	@NotNull
	private String ciclo;
	
	@NotNull
	private int posizione;
	
	@NotNull
	private int revisione;

	public CicloMacchinaAttivitaIdentity(String attivita, String macchina, String ciclo, int posizione, int revisione) {
		super();
		this.attivita = attivita;
		this.macchina = macchina;
		this.ciclo = ciclo;
		this.posizione = posizione;
		this.revisione = revisione;
	}
	
	public CicloMacchinaAttivitaIdentity() {
		super();
		this.attivita = "";
		this.macchina = "";
		this.ciclo = "";
		this.posizione = 0;
		this.revisione = 0;
	}

	public String getAttivita() {
		return attivita;
	}

	public void setAttivita(String attivita) {
		this.attivita = attivita;
	}

	public String getMacchina() {
		return macchina;
	}

	public void setMacchina(String macchina) {
		this.macchina = macchina;
	}

	public String getCiclo() {
		return ciclo;
	}

	public void setCiclo(String ciclo) {
		this.ciclo = ciclo;
	}

	public int getPosizione() {
		return posizione;
	}

	public void setPosizione(int posizione) {
		this.posizione = posizione;
	}

	public int getRevisione() {
		return revisione;
	}

	public void setRevisione(int revisione) {
		this.revisione = revisione;
	}
}
