package it.profilglass.classmodel;

import java.util.List;

public abstract class Configuratore {
	protected List<Ciclo> cicli;
	protected List<Distinta> distinte;
	// LISTA CARATTERISTICHE VALIDE PER TUTTI I CONFIGURATORI
	protected List<Caratteristica> caratteristiche;

	public List<Caratteristica> getCaratteristiche() {
		return caratteristiche;
	}

	public void setCaratteristiche(List<Caratteristica> caratteristiche) {
		this.caratteristiche = caratteristiche;
	}

	public List<Ciclo> getCicli() {
		return cicli;
	}

	public void setCicli(List<Ciclo> cicli) {
		this.cicli = cicli;
	}

	public List<Distinta> getDistinte() {
		return distinte;
	}

	public void setDistinte(List<Distinta> distinte) {
		this.distinte = distinte;
	}

	public Configuratore() {
		// TO DO: NON POSSO DEFINIRE QUI LE CARATTERISTICHE GENERALI PERCHE GLI ORDINI
		// NEL CONFIGURATORE DI TALI CARATTERISTICHE POSSONO CAMBIARE
	}

	public void buildCiclo(GenericItem item) {
		// TO DO: DEVE ESSERE IMPLEMENTATO NEI SINGOLI CONFIGURATORI SEPCIFICI
	}

	public Distinta buildDistinta() {
		return new Distinta();
	}

}
