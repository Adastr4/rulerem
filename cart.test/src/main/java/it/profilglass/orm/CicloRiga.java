package it.profilglass.orm;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "conf_ciclo_righe")
public class CicloRiga {
	
	@EmbeddedId
	private CicloRigaIdentity identity;
	
	@Column(name="DurataFissa")
	private int durataFissa;
	
	@Column(name="Attrezzaggio")
	private float attrezzaggio;
	
	@Column(name="Lavorazione")
	private float lavorazione;
	
	@Column(name="SpIn")
	private float spIn;
	
	@Column(name="SpOut")
	private String spOut;
	
	public CicloRiga(CicloRigaIdentity identity, int durataFissa, float attrezzaggio, float lavorazione, float spIn, String spOut)
	{
		this.identity = identity;
		this.durataFissa = durataFissa;
		this.attrezzaggio = attrezzaggio;
		this.spIn = spIn;
		this.spOut = spOut;
	}
	
	public CicloRiga(String codiceArticolo, int revisione, String ciclo, int operazione, int durataFissa, float attrezzaggio, float lavorazione, float spIn, String spOut)
	{
		this.identity = new CicloRigaIdentity(codiceArticolo, revisione, ciclo, operazione);
		this.durataFissa = durataFissa;
		this.attrezzaggio = attrezzaggio;
		this.spIn = spIn;
		this.spOut = spOut;
	}

	public CicloRigaIdentity getIdentity() {
		return identity;
	}

	public void setIdentity(CicloRigaIdentity identity) {
		this.identity = identity;
	}

	public int getDurataFissa() {
		return durataFissa;
	}

	public void setDurataFissa(int durataFissa) {
		this.durataFissa = durataFissa;
	}

	public float getAttrezzaggio() {
		return attrezzaggio;
	}

	public void setAttrezzaggio(float attrezzaggio) {
		this.attrezzaggio = attrezzaggio;
	}

	public float getLavorazione() {
		return lavorazione;
	}

	public void setLavorazione(float lavorazione) {
		this.lavorazione = lavorazione;
	}

	public float getSpIn() {
		return spIn;
	}

	public void setSpIn(float spIn) {
		this.spIn = spIn;
	}

	public String getSpOut() {
		return spOut;
	}

	public void setSpOut(String spOut) {
		this.spOut = spOut;
	}
}
