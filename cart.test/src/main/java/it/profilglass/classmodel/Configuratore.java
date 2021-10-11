package it.profilglass.classmodel;

import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Class Configuratore.
 *
 * @author nodejs
 */
public abstract class Configuratore {

	/** The cicli. */
	protected List<Ciclo> cicli;

	/** The distinte. */
	protected List<Distinta> distinte;

	// LISTA CARATTERISTICHE VALIDE PER TUTTI I CONFIGURATORI
	/** The caratteristiche. */
	protected List<ICaratteristica> caratteristiche;

	/**
	 * Builds the distinta.
	 *
	 * @return the list
	 */
	public abstract List<LivelloDistinta> buildDistinta();

	/**
	 * Gets the caratteristica by id.
	 *
	 * @param Id the id
	 * @return the caratteristica by id
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
	 * Gets the caratteristica opzioni.
	 *
	 * @param idCaratteristica the id caratteristica
	 * @return the caratteristica opzioni
	 */
	public List<Opzione> getCaratteristicaOpzioni(String idCaratteristica) {
		return this.getCaratteristicaById(idCaratteristica).getValori();
	}

	/**
	 * Gets the caratteristiche.
	 *
	 * @return the caratteristiche
	 */
	public List<ICaratteristica> getCaratteristiche() {
		return caratteristiche;
	}

	/**
	 * Gets the cicli.
	 *
	 * @return the cicli
	 */
	public List<Ciclo> getCicli() {
		return cicli;
	}

	/**
	 * Gets the distinte.
	 *
	 * @return the distinte
	 */
	public List<Distinta> getDistinte() {
		return distinte;
	}

	/**
	 * Gets the ordered caratteristiche.
	 *
	 * @return the ordered caratteristiche
	 */
	public List<ICaratteristica> getOrderedCaratteristiche() {
		return this.caratteristiche;
	}

	/**
	 * Run caratteristica default value rule by index.
	 *
	 * @param index the index
	 * @return true, if successful
	 */
	public abstract boolean runCaratteristicaDefaultValueRuleByIndex(int index);

	/**
	 * Run caratteristica default value rule by name.
	 *
	 * @param name the name
	 * @return true, if successful
	 */
	public abstract boolean runCaratteristicaDefaultValueRuleByName(String name);

	/**
	 * Run caratteristica validation rule by index.
	 *
	 * @param index the index
	 * @return true, if successful
	 */
	public abstract boolean runCaratteristicaValidationRuleByIndex(int index);

	/**
	 * Run caratteristica validation rule by name.
	 *
	 * @param name the name
	 * @return true, if successful
	 */
	public abstract boolean runCaratteristicaValidationRuleByName(String name);

	/**
	 * Sets the caratteristica value.
	 *
	 * @param idCaratteristica the id caratteristica
	 * @param value            the value
	 */
	public void setCaratteristicaValue(String idCaratteristica, String value) {
		this.getCaratteristicaById(idCaratteristica).setSelectedValue(value);
	}

	/**
	 * Sets the caratteristiche.
	 *
	 * @param caratteristiche the new caratteristiche
	 */
	public void setCaratteristiche(List<ICaratteristica> caratteristiche) {
		this.caratteristiche = caratteristiche;
	}

	/**
	 * Sets the cicli.
	 *
	 * @param cicli the new cicli
	 */
	public void setCicli(List<Ciclo> cicli) {
		this.cicli = cicli;
	}

	/**
	 * Sets the distinte.
	 *
	 * @param distinte the new distinte
	 */
	public void setDistinte(List<Distinta> distinte) {
		this.distinte = distinte;
	}

}
