package it.profilglass.classmodel;

public class Macchina {
	
	private String idMacchina;
	private String descMacchina;
	private CentroLavoro idCentroLavoro;
	private int capacitaBaseGiornaliera;
	private int capacitaBaseSettimanale;
	
	public Macchina(String idMacchina, String descMacchina, CentroLavoro idCentroLavoro, int capacitaBaseGiornaliera, int capacitaBaseSettimanale)
	{
		this.idMacchina = idMacchina;
		this.descMacchina = descMacchina;
		this.idCentroLavoro = idCentroLavoro;
		this.capacitaBaseGiornaliera = capacitaBaseGiornaliera;
		this.capacitaBaseSettimanale = capacitaBaseSettimanale;
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

}
