package it.profilglass.classmodel;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

import it.profilglass.orm.AttivitaMacchinaRel;

@Entity
@Table(name = "conf_macchina")
public class Macchina {
	
	@Id
	@Column(name="IdMacchina")
	private String idMacchina;
	
	@Column(name="Descrizione")
	private String descMacchina;
	
	@JoinColumn(name="IdCentro")
	@OneToOne
	private CentroLavoro idCentroLavoro;
	
	@Column(name="CapacitaBaseGiorn")
	private int capacitaBaseGiornaliera;
	
	@Column(name="CapacitaBaseSett")
	private int capacitaBaseSettimanale;
	
	@OneToMany(mappedBy="macchinaPred", fetch = FetchType.LAZY)
	private List<Attivita> attAss;
	
	@OneToMany(mappedBy="macchinaRef", fetch = FetchType.LAZY)
	private List<AttivitaMacchinaRel> macchinaAttivita;
	
	public Macchina(String idMacchina, String descMacchina, CentroLavoro idCentroLavoro, int capacitaBaseGiornaliera, int capacitaBaseSettimanale, List<Attivita> attAss, List<AttivitaMacchinaRel> attivitaMacchina)
	{
		this.idMacchina = idMacchina;
		this.descMacchina = descMacchina;
		this.idCentroLavoro = idCentroLavoro;
		this.capacitaBaseGiornaliera = capacitaBaseGiornaliera;
		this.capacitaBaseSettimanale = capacitaBaseSettimanale;
		this.attAss = attAss;
		this.macchinaAttivita = attivitaMacchina;
	}
	
	public Macchina(String idMacchina, String descMacchina, CentroLavoro idCentroLavoro, int capacitaBaseGiornaliera, int capacitaBaseSettimanale)
	{
		this.idMacchina = idMacchina;
		this.descMacchina = descMacchina;
		this.idCentroLavoro = idCentroLavoro;
		this.capacitaBaseGiornaliera = capacitaBaseGiornaliera;
		this.capacitaBaseSettimanale = capacitaBaseSettimanale;
		this.attAss = null;
		this.macchinaAttivita = null;
	}
	
	public Macchina()
	{
		this.idMacchina = "";
		this.descMacchina = "";
		this.idCentroLavoro = null;
		this.capacitaBaseGiornaliera = 0;
		this.capacitaBaseSettimanale = 0;
		this.attAss = null;
		this.macchinaAttivita = null;
	}

	public String getIdMacchina() {
		return idMacchina;
	}

	public void setIdMacchina(String idMacchina) {
		this.idMacchina = idMacchina;
	}

	public String getDescMacchina() {
		return descMacchina;
	}

	public void setDescMacchina(String descMacchina) {
		this.descMacchina = descMacchina;
	}

	public CentroLavoro getIdCentroLavoro() {
		return idCentroLavoro;
	}

	public void setIdCentroLavoro(CentroLavoro idCentroLavoro) {
		this.idCentroLavoro = idCentroLavoro;
	}

	public int getCapacitaBaseGiornaliera() {
		return capacitaBaseGiornaliera;
	}

	public void setCapacitaBaseGiornaliera(int capacitaBaseGiornaliera) {
		this.capacitaBaseGiornaliera = capacitaBaseGiornaliera;
	}

	public int getCapacitaBaseSettimanale() {
		return capacitaBaseSettimanale;
	}

	public void setCapacitaBaseSettimanale(int capacitaBaseSettimanale) {
		this.capacitaBaseSettimanale = capacitaBaseSettimanale;
	}

	public List<Attivita> getAttAss() {
		return attAss;
	}

	public void setAttAss(List<Attivita> attAss) {
		this.attAss = attAss;
	}

	public List<AttivitaMacchinaRel> getAttivitaMacchina() {
		return macchinaAttivita;
	}

	public void setAttivitaMacchina(List<AttivitaMacchinaRel> attivitaMacchina) {
		this.macchinaAttivita = attivitaMacchina;
	}
	
}
