package test.test;

public class Attivita {
	private String idAttivita;
	private String descrizioneAttivita;
	private Macchina macchinaPred;
	private String centroLavoroPred;

	public Attivita(String idAttivita, String descrizioneAttivita, Macchina macchinaPred, String centroLavoroPred)
	{
		this.idAttivita = idAttivita;
		this.descrizioneAttivita = descrizioneAttivita;
		this.macchinaPred = macchinaPred;
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
