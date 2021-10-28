package it.profilglass.orm;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="conf_alternativi")
public class AlternativiOrm implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private AlternativiIdentityOrm identity;
	
	@Column(name="CodiceArticoloPadre", insertable=false, updatable=false)
	private String codiceArticoloPadre;
	
	@Column(name="Revisione", insertable=false, updatable=false)
	private int revisione;
	
	@Column(name="Posizione", insertable=false, updatable=false)
	private int posizione;
	
	@Column(name="Priorita", insertable=false, updatable=false)
	private int priorita;
	
	@Column(name="CodiceArticoloFiglio")
	private String codiceArticoloFiglio;
	
	@Column(name="Ciclo")
	private String ciclo;

	public AlternativiOrm(AlternativiIdentityOrm identity, String codiceArticoloPadre, int revisione, int posizione,
			int priorita, String codiceArticoloFiglio, String ciclo) {
		super();
		this.identity = identity;
		this.codiceArticoloPadre = codiceArticoloPadre;
		this.revisione = revisione;
		this.posizione = posizione;
		this.priorita = priorita;
		this.codiceArticoloFiglio = codiceArticoloFiglio;
		this.ciclo = ciclo;
	}
	
	public AlternativiOrm() {
		this.identity = null;
		this.codiceArticoloPadre = "";
		this.revisione = 0;
		this.posizione = 0;
		this.priorita = 0;
		this.codiceArticoloFiglio = "";
		this.ciclo = "";
	}

	public AlternativiIdentityOrm getIdentity() {
		return identity;
	}

	public void setIdentity(AlternativiIdentityOrm identity) {
		this.identity = identity;
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

	public String getCodiceArticoloFiglio() {
		return codiceArticoloFiglio;
	}

	public void setCodiceArticoloFiglio(String codiceArticoloFiglio) {
		this.codiceArticoloFiglio = codiceArticoloFiglio;
	}

	public String getCiclo() {
		return ciclo;
	}

	public void setCiclo(String ciclo) {
		this.ciclo = ciclo;
	}
}
