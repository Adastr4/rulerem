package it.profilglass.classmodel;

import java.util.List;

/**
 * @author nodejs
 *
 */
public class Ciclo {

	/**
	 *
	 */
	private List<Operazione> operazioni;

	/**
	 *
	 */
	private String idCiclo;

	/**
	 *
	 */
	private boolean isStandard;

	/**
	 * @param idCiclo
	 * @param operazioni
	 * @param isStandard
	 */
	public Ciclo(String idCiclo, List<Operazione> operazioni, boolean isStandard) {
		this.idCiclo = idCiclo;
		this.operazioni = operazioni;
		this.isStandard = isStandard;
	}

	/**
	 * @return
	 */
	public String getIdCiclo() {
		return idCiclo;
	}

	/**
	 * @return
	 */
	public List<Operazione> getOperazioni() {
		return operazioni;
	}

	/**
	 * @return
	 */
	public boolean isStandard() {
		return isStandard;
	}

	/**
	 * @param idCiclo
	 */
	public void setIdCiclo(String idCiclo) {
		this.idCiclo = idCiclo;
	}

	/**
	 * @param operazioni
	 */
	public void setOperazioni(List<Operazione> operazioni) {
		this.operazioni = operazioni;
	}

	/**
	 * @param isStandard
	 */
	public void setStandard(boolean isStandard) {
		this.isStandard = isStandard;
	}

}
