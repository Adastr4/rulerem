package it.profilglass.orm;

import java.io.Serializable;

import javax.persistence.AttributeOverride;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

import com.sun.istack.NotNull;

import it.profilglass.classmodel.Attivita;
import it.profilglass.classmodel.Macchina;

@Entity
@Table(name = "conf_attivita_macchina")
public class AttivitaMacchinaRel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private AttivitaMacchineIdentity identity;
	
	@MapsId("attivita")
	@ManyToOne(targetEntity=Attivita.class)
	@JoinColumn(name="attivita", referencedColumnName = "Attivita", insertable = false, updatable = false)
	private Attivita attivitaRef;
	
	@ManyToOne(targetEntity=Macchina.class)
	@JoinColumn(name="IdMacchina", referencedColumnName = "IdMacchina", insertable = false, updatable = false)
	private Macchina macchinaRef;
	
	@Column(name="Attrezzaggio")
	private float attrezzaggio;
	
	@Column(name="DurataCiclo")
	private float durataCiclo;
	
	@Column(name="QtaCiclo")
	private float qtaCiclo;
	
	@Column(name="DurataFissa")
	private int durataFissa;
	
	public AttivitaMacchinaRel(AttivitaMacchineIdentity identity, String attivita, String macchina, Attivita attivitaRef, Macchina macchinaRef, float attrezzaggio, float durataCiclo, float qtaCiclo, int durataFissa)
	{
		this.identity = identity;
		this.attivitaRef = attivitaRef;
		this.macchinaRef = macchinaRef;
		this.attrezzaggio = attrezzaggio;
		this.durataCiclo = durataCiclo;
		this.durataFissa = durataFissa;
	}
	
	public AttivitaMacchinaRel()
	{
		this.identity = null;
		this.attivitaRef = null;
		this.macchinaRef = null;
		this.attrezzaggio = 0;
		this.durataCiclo = 0;
		this.durataFissa = 0;
	}

	public AttivitaMacchineIdentity getIdentity() {
		return identity;
	}

	public void setIdentity(AttivitaMacchineIdentity identity) {
		this.identity = identity;
	}

	public Attivita getAttivitaRef() {
		return attivitaRef;
	}

	public void setAttivitaRef(Attivita attivitaRef) {
		this.attivitaRef = attivitaRef;
	}

	public Macchina getMacchinaRef() {
		return macchinaRef;
	}

	public void setMacchinaRef(Macchina macchinaRef) {
		this.macchinaRef = macchinaRef;
	}

	public float getAttrezzaggio() {
		return attrezzaggio;
	}

	public void setAttrezzaggio(float attrezzaggio) {
		this.attrezzaggio = attrezzaggio;
	}

	public float getDurataCiclo() {
		return durataCiclo;
	}

	public void setDurataCiclo(float durataCiclo) {
		this.durataCiclo = durataCiclo;
	}

	public float getQtaCiclo() {
		return qtaCiclo;
	}

	public void setQtaCiclo(float qtaCiclo) {
		this.qtaCiclo = qtaCiclo;
	}

	public int getDurataFissa() {
		return durataFissa;
	}

	public void setDurataFissa(int durataFissa) {
		this.durataFissa = durataFissa;
	}
}
