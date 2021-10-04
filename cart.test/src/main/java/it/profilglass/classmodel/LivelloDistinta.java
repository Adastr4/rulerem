package it.profilglass.classmodel;

import java.util.ArrayList;
import java.util.List;

public class LivelloDistinta {

	private GenericItem articoloDistinta;
	private List<GenericItem> articoliAlternativi;
	private List<LivelloDistinta> distinta;
	private int livelloDistinta;
	private int livelloOrdine;

	public LivelloDistinta(GenericItem articoloDistinta, int livelloDistinta, int livelloOrdine) {
		this.articoloDistinta = articoloDistinta;
		this.livelloDistinta = livelloDistinta;
		this.livelloOrdine = livelloOrdine;

		this.articoliAlternativi = new ArrayList<>();
		this.distinta = new ArrayList<>();
	}

	public LivelloDistinta(GenericItem articoloDistinta, List<GenericItem> articoliAlternativi,
			List<LivelloDistinta> distinta, int livelloDistinta, int livelloOrdine) {
		this.articoloDistinta = articoloDistinta;
		this.articoliAlternativi = articoliAlternativi;
		this.livelloDistinta = livelloDistinta;
		this.livelloOrdine = livelloOrdine;
		this.distinta = distinta;
	}

	public List<GenericItem> getArticoliAlternativi() {
		return articoliAlternativi;
	}

	public GenericItem getArticoloDistinta() {
		return articoloDistinta;
	}

	public List<LivelloDistinta> getDistinta() {
		return distinta;
	}

	public int getLivelloDistinta() {
		return livelloDistinta;
	}

	public int getLivelloOrdine() {
		return livelloOrdine;
	}

	public void setArticoliAlternativi(List<GenericItem> articoliAlternativi) {
		this.articoliAlternativi = articoliAlternativi;
	}

	public void setArticoloDistinta(GenericItem articoloDistinta) {
		this.articoloDistinta = articoloDistinta;
	}

	public void setDistinta(List<LivelloDistinta> distinta) {
		this.distinta = distinta;
	}

	public void setLivelloDistinta(int livelloDistinta) {
		this.livelloDistinta = livelloDistinta;
	}

	public void setLivelloOrdine(int livelloOrdine) {
		this.livelloOrdine = livelloOrdine;
	}

}
