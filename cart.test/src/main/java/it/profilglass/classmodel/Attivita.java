package it.profilglass.classmodel;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import it.profilglass.orm.AttivitaMacchinaRel;

@Entity
@Table(name="conf_attivita")
public class Attivita {
	@Id
	@Column(name="Attivita")
	private String idAttivita;
	
	@Column(name="Descrizione")
	private String descrizioneAttivita;
	
	@Transient
	private String centroLavoroPred;
	
	@Column(name="Famiglia")
	private String famiglia;
	
	@Column(name="Anima")
	private int anima;
	
	@Column(name="Campione")
	private int campione;
	
	@OneToMany(mappedBy="attivitaRef")
	private List<AttivitaMacchinaRel> attivitaMacchina;
	
	public Attivita(String idAttivita, String descrizioneAttivita, String centroLavoroPred, String famiglia, int anima, int campione, List<AttivitaMacchinaRel> attivitaMacchina)
	{
		this.idAttivita = idAttivita;
		this.descrizioneAttivita = descrizioneAttivita;
		this.centroLavoroPred = centroLavoroPred;
		this.famiglia = famiglia;
		this.anima = anima;
		this.campione = campione;
		this.attivitaMacchina = attivitaMacchina;
	}
	
	public Attivita(String idAttivita, String descrizioneAttivita, String famiglia, int anima, int campione)
	{
		this.idAttivita = idAttivita;
		this.descrizioneAttivita = descrizioneAttivita;
		this.centroLavoroPred = "";
		this.famiglia = famiglia;
		this.anima = anima;
		this.campione = campione;
		this.attivitaMacchina = null;
	}
	
	public Attivita()
	{
		this.idAttivita = "";
		this.descrizioneAttivita = "";
		this.centroLavoroPred = "";
		this.famiglia = "";
		this.anima = 0;
		this.campione = 0;
		this.attivitaMacchina = null;
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

	public String getCentroLavoroPred() {
		return centroLavoroPred;
	}

	public void setCentroLavoroPred(String centroLavoroPred) {
		this.centroLavoroPred = centroLavoroPred;
	}

	public String getIdAttivita() {
		return idAttivita;
	}

	public void setIdAttivita(String idAttivita) {
		this.idAttivita = idAttivita;
	}

	public String getDescrizioneAttivita() {
		return descrizioneAttivita;
	}

	public void setDescrizioneAttivita(String descrizioneAttivita) {
		this.descrizioneAttivita = descrizioneAttivita;
	}

	public List<AttivitaMacchinaRel> getAttivitaMacchina() {
		return attivitaMacchina;
	}

	public void setAttivitaMacchina(List<AttivitaMacchinaRel> attivitaMacchina) {
		this.attivitaMacchina = attivitaMacchina;
	}
}
