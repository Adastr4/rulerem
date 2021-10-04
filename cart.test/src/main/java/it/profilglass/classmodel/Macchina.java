package it.profilglass.classmodel;

public class Macchina {

	private String idMacchina;
	private String descMacchina;
	private String idCentroLavoro;
	private int capacitaBaseGiornaliera;
	private int capacitaBaseSettimanale;

	public Macchina(String idMacchina, String descMacchina, String idCentroLavoro, int capacitaBaseGiornaliera, int capacitaBaseSettimanale)
	{
		this.idMacchina = idMacchina;
		this.descMacchina = descMacchina;
		this.idCentroLavoro = idCentroLavoro;
		this.capacitaBaseGiornaliera = capacitaBaseGiornaliera;
		this.capacitaBaseSettimanale = capacitaBaseSettimanale;
	}

	public int getCapacitaBaseGiornaliera() {
		return capacitaBaseGiornaliera;
	}

	public int getCapacitaBaseSettimanale() {
		return capacitaBaseSettimanale;
	}

	public String getDescMacchina() {
		return descMacchina;
	}

	public String getIdCentroLavoro() {
		return idCentroLavoro;
	}

	public String getIdMacchina() {
		return idMacchina;
	}

	public void setCapacitaBaseGiornaliera(int capacitaBaseGiornaliera) {
		this.capacitaBaseGiornaliera = capacitaBaseGiornaliera;
	}

	public void setCapacitaBaseSettimanale(int capacitaBaseSettimanale) {
		this.capacitaBaseSettimanale = capacitaBaseSettimanale;
	}

	public void setDescMacchina(String descMacchina) {
		this.descMacchina = descMacchina;
	}

	public void setIdCentroLavoro(String idCentroLavoro) {
		this.idCentroLavoro = idCentroLavoro;
	}

	public void setIdMacchina(String idMacchina) {
		this.idMacchina = idMacchina;
	}

}
