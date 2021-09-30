package it.profilglass.classmodel;

import java.util.ArrayList;
import java.util.List;

public class LivelloDistinta {
	
	private GenericItem articoloDistinta;
	private List<GenericItem> articoliAlternativi;
	private int livelloDistinta;
	private int livelloOrdine;
	
	public LivelloDistinta(GenericItem articoloDistinta, List<GenericItem> articoliAlternativi, int livelloDistinta, int livelloOrdine)
	{
		this.articoloDistinta = articoloDistinta;
		this.articoliAlternativi = articoliAlternativi;
		this.livelloDistinta = livelloDistinta;
		this.livelloOrdine = livelloOrdine;
	}
	
	public LivelloDistinta(GenericItem articoloDistinta, int livelloDistinta, int livelloOrdine)
	{
		this.articoloDistinta = articoloDistinta;
		this.livelloDistinta = livelloDistinta;
		this.livelloOrdine = livelloOrdine;
		this.articoliAlternativi = new ArrayList<GenericItem>();
	}

	public GenericItem getArticoloDistinta() {
		return articoloDistinta;
	}

	public void setArticoloDistinta(GenericItem articoloDistinta) {
		this.articoloDistinta = articoloDistinta;
	}

	public List<GenericItem> getArticoliAlternativi() {
		return articoliAlternativi;
	}

	public void setArticoliAlternativi(List<GenericItem> articoliAlternativi) {
		this.articoliAlternativi = articoliAlternativi;
	}

	public int getLivelloDistinta() {
		return livelloDistinta;
	}

	public void setLivelloDistinta(int livelloDistinta) {
		this.livelloDistinta = livelloDistinta;
	}

	public int getLivelloOrdine() {
		return livelloOrdine;
	}

	public void setLivelloOrdine(int livelloOrdine) {
		this.livelloOrdine = livelloOrdine;
	}
}
