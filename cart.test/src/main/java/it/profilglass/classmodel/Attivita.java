package it.profilglass.classmodel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="conf_attivita")
public class Attivita {
	@Id
	@Column(name="Attivita")
	private String idAttivita;
	
	@Column(name="Descrizione")
	private String descrizioneAttivita;
	
	private Macchina macchinaPred;
	private String centroLavoroPred;
	
	@Column(name="Famiglia")
	private String famiglia;
	
	@Column(name="Anima")
	private int anima;
	
	@Column(name="Campione")
	private int campione;
	
	public Attivita(String idAttivita, String descrizioneAttivita, Macchina macchinaPred, String centroLavoroPred, String famiglia, int anima, int campione)
	{
		this.idAttivita = idAttivita;
		this.descrizioneAttivita = descrizioneAttivita;
		this.macchinaPred = macchinaPred;
		this.centroLavoroPred = centroLavoroPred;
		this.famiglia = famiglia;
		this.anima = anima;
		this.campione = campione;
	}
	
	public Attivita(String idAttivita, String descrizioneAttivita, String famiglia, int anima, int campione)
	{
		this.idAttivita = idAttivita;
		this.descrizioneAttivita = descrizioneAttivita;
		this.macchinaPred = null;
		this.centroLavoroPred = "";
		this.famiglia = famiglia;
		this.anima = anima;
		this.campione = campione;
	}
	
	public Attivita()
	{
		this.idAttivita = "";
		this.descrizioneAttivita = "";
		this.macchinaPred = null;
		this.centroLavoroPred = "";
		this.famiglia = "";
		this.anima = 0;
		this.campione = 0;
	}

	public String getFamiglia() {
		return famiglia;
	}

	public void setFamiglia(String famiglia) {
		this.famiglia = famiglia;
	}

	public int getAnima() {
		return anima;
	}

	public void setAnima(int anima) {
		this.anima = anima;
	}

	public int getCampione() {
		return campione;
	}

	public void setCampione(int campione) {
		this.campione = campione;
	}
	
	public String getAttivita() {
		return idAttivita;
	}

	public void setAttivita(String idAttivita) {
		this.idAttivita = idAttivita;
	}

	public String getDescrizione() {
		return descrizioneAttivita;
	}

	public void setDescrizione(String descrizioneAttivita) {
		this.descrizioneAttivita = descrizioneAttivita;
	}

	public Macchina getMacchinaPred() {
		return macchinaPred;
	}

	public void setMacchinaPred(Macchina macchinaPred) {
		this.macchinaPred = macchinaPred;
	}

	public String getCentroLavoroPred() {
		return centroLavoroPred;
	}

	public void setCentroLavoroPred(String centroLavoroPred) {
		this.centroLavoroPred = centroLavoroPred;
	}
}
