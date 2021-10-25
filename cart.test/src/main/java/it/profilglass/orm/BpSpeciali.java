package it.profilglass.orm;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="conf_bp_speciali")
public class BpSpeciali implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private BpSpecialiIdentity identity;
	
	@Column(name="Nome")
	private String descrizione;
	
	public BpSpeciali(BpSpecialiIdentity identity, String descrizione)
	{
		this.identity = identity;
		this.descrizione = descrizione;
	}
	
	public BpSpeciali(String articolo, String bp, String descrizione)
	{
		this.identity = new BpSpecialiIdentity(articolo, bp);
		this.descrizione = descrizione;
	}
	
	public BpSpeciali()
	{
		this.identity = null;
		this.descrizione = "";
	}

	public BpSpecialiIdentity getIdentity() {
		return identity;
	}

	public void setIdentity(BpSpecialiIdentity identity) {
		this.identity = identity;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
}
