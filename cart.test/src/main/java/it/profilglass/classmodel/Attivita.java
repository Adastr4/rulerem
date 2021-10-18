package it.profilglass.classmodel;

public class Attivita {
	private String idAttivita;
	private String descrizioneAttivita;
	private Macchina macchinaPred;
	private String centroLavoroPred;
	private String famiglia;
	private int anima;
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
