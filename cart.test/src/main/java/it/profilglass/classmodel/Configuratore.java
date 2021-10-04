package it.profilglass.classmodel;

import java.util.ArrayList;
import java.util.List;

/**
 * @author nodejs
 *
 */
public abstract class Configuratore {
	/**
	 *
	 */
	protected List<Ciclo> cicli;

	/**
	 *
	 */
	protected List<Distinta> distinte;

	// LISTA CARATTERISTICHE VALIDE PER TUTTI I CONFIGURATORI
	/**
	 *
	 */
	protected List<ICaratteristica> caratteristiche;

	/**
	 * @return
	 */
	public abstract List<LivelloDistinta> buildDistinta();

	/**
	 * @param Id
	 * @return
	 */
	public ICaratteristica getCaratteristicaById(String Id) {
		for (final ICaratteristica cara : this.caratteristiche) {
			if (cara.getCaratteristicaId().equalsIgnoreCase(Id)) {
				return cara;
			}
		}

		return null;
	}

	/**
	 * @param idCaratteristica
	 * @return
	 */
	public List<Opzione> getCaratteristicaOpzioni(String idCaratteristica) {
		return this.getCaratteristicaById(idCaratteristica).getValori();
	}

	/**
	 * @return
	 */
	public List<ICaratteristica> getCaratteristiche() {
		return caratteristiche;
	}

	/**
	 * @return
	 */
	public List<Ciclo> getCicli() {
		return cicli;
	}

	/**
	 * @return
	 */
	public List<Distinta> getDistinte() {
		return distinte;
	}

	/**
	 * @return
	 */
	public List<ICaratteristica> getOrderedCaratteristiche() {
		return this.caratteristiche;
	}

	/**
	 * @param index
	 * @return
	 */
	public boolean runCaratteristicaDefaultValueRuleByIndex(int index) {
		return true;
	}

	/**
	 * @param name
	 * @return
	 */
	public boolean runCaratteristicaDefaultValueRuleByName(String name) {
		return true;

	}

	/**
	 * @param index
	 * @return
	 */
	public boolean runCaratteristicaValidationRuleByIndex(int index) {
		return true;
	}

	/**
	 * @param name
	 * @return
	 */
	public boolean runCaratteristicaValidationRuleByName(String name) {
		return true;
	}

	/**
	 * @param idCaratteristica
	 * @param value
	 */
	public void setCaratteristicaValue(String idCaratteristica, String value) {
		this.getCaratteristicaById(idCaratteristica).setSelectedValue(value);
	}

	/**
	 * @param caratteristiche
	 */
	public void setCaratteristiche(List<ICaratteristica> caratteristiche) {
		this.caratteristiche = caratteristiche;
	}

	/**
	 * @param cicli
	 */
	public void setCicli(List<Ciclo> cicli) {
		this.cicli = cicli;
	}

	/**
	 * @param distinte
	 */
	public void setDistinte(List<Distinta> distinte) {
		this.distinte = distinte;
	}

}
