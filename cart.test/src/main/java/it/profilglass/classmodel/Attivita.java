package it.profilglass.classmodel;

/**
 * @author nodejs
 *
 */
public class Attivita {
	/**
	 *
	 */
	private String idAttivita;
	/**
	 *
	 */
	private String descrizioneAttivita;
	/**
	 *
	 */
	private Macchina macchinaPred;
	/**
	 *
	 */
	private String centroLavoroPred;

	/**
	 * @param idAttivita
	 * @param descrizioneAttivita
	 * @param macchinaPred
	 * @param centroLavoroPred
	 */
	/**
	 * @param idAttivita
	 * @param descrizioneAttivita
	 * @param macchinaPred
	 * @param centroLavoroPred
	 */
	public Attivita(String idAttivita, String descrizioneAttivita, Macchina macchinaPred, String centroLavoroPred) {
		this.idAttivita = idAttivita;
		this.descrizioneAttivita = descrizioneAttivita;
		this.macchinaPred = macchinaPred;
		this.centroLavoroPred = centroLavoroPred;
	}

	/**
	 * @return
	 */
	/**
	 * @return
	 */
	public String getCentroLavoroPred() {
		return centroLavoroPred;
	}

	/**
	 * @return
	 */
	/**
	 * @return
	 */
	public String getDescrizioneAttivita() {
		return descrizioneAttivita;
	}

	/**
	 * @return
	 */
	/**
	 * @return
	 */
	public String getIdAttivita() {
		return idAttivita;
	}

	/**
	 * @return
	 */
	/**
	 * @return
	 */
	public Macchina getMacchinaPred() {
		return macchinaPred;
	}

	/**
	 * @param centroLavoroPred
	 */
	/**
	 * @param centroLavoroPred
	 */
	public void setCentroLavoroPred(String centroLavoroPred) {
		this.centroLavoroPred = centroLavoroPred;
	}

	/**
	 * @param descrizioneAttivita
	 */
	/**
	 * @param descrizioneAttivita
	 */
	public void setDescrizioneAttivita(String descrizioneAttivita) {
		this.descrizioneAttivita = descrizioneAttivita;
	}

	/**
	 * @param idAttivita
	 */
	/**
	 * @param idAttivita
	 */
	public void setIdAttivita(String idAttivita) {
		this.idAttivita = idAttivita;
	}

	/**
	 * @param macchinaPred
	 */
	/**
	 * @param macchinaPred
	 */
	public void setMacchinaPred(Macchina macchinaPred) {
		this.macchinaPred = macchinaPred;
	}
}
