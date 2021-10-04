package it.profilglass.classmodel;

public class Operazione {
	private Macchina macchina;
	private Attivita attivita;
	private int ordine;

	public Operazione(Macchina macchina, Attivita attivita, int ordine)
	{
		this.macchina = macchina;
		this.attivita = attivita;
		this.ordine = ordine;
	}

	public Operazione(String macchinaId, String attivitaId, int ordine)
	{
		this.macchina = ReadDB.getClassmodelMacchinaFromId(macchinaId);
		this.attivita = ReadDB.getClassmodelAttivitaFromId(attivitaId);
	}

	public Attivita getAttivita() {
		return attivita;
	}

	public Macchina getMacchina() {
		return macchina;
	}

	public int getOrdine() {
		return ordine;
	}

	public void setAttivita(Attivita attivita) {
		this.attivita = attivita;
	}

	public void setMacchina(Macchina macchina) {
		this.macchina = macchina;
	}

	public void setOrdine(int ordine) {
		this.ordine = ordine;
	}



}
