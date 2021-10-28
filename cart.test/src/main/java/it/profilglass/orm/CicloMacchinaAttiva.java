package it.profilglass.orm;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="conf_ciclo_macchina_attivita")
public class CicloMacchinaAttiva {
	@EmbeddedId
	private CicloMacchinaAttivitaIdentity identity;
	
	@Column(name="Attivita", insertable = false, updatable = false)
	private String attivita;
	
	@Column(name="Macchina", insertable = false, updatable = false)
	private String macchina;
	
	@Column(name="Ciclo", insertable = false, updatable = false)
	private String ciclo;
	
	@Column(name="Posizione", insertable = false, updatable = false)
	private int posizione;
	
	@Column(name="Revisione", insertable = false, updatable = false)
	private int revisione;

	public CicloMacchinaAttiva(CicloMacchinaAttivitaIdentity identity, String attivita, String macchina, String ciclo,
			int posizione, int revisione) {
		super();
		this.identity = identity;
		this.attivita = attivita;
		this.macchina = macchina;
		this.ciclo = ciclo;
		this.posizione = posizione;
		this.revisione = revisione;
	}
	
	public CicloMacchinaAttiva() {
		this.identity = null;
		this.attivita = "";
		this.macchina = "";
		this.ciclo = "";
		this.posizione = 0;
		this.revisione = 0;
	}

	public CicloMacchinaAttivitaIdentity getIdentity() {
		return identity;
	}

	public void setIdentity(CicloMacchinaAttivitaIdentity identity) {
		this.identity = identity;
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
