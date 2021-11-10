package it.profilglass.classmodel;

import java.util.ArrayList;
import java.util.List;

import it.profilglass.orm.DistintaOrm;
import it.profilglass.orm.DistintaOrmIdentity;

public class LivelloDistinta {
	
	private GenericItem articoloDistinta;
	private List<GenericItem> articoliAlternativi;
	private List<LivelloDistinta> distinta;
	private int livelloDistinta;
	private int livelloOrdine;
	private int revisione;
	private float qta;
	private float scarto;
	
	public LivelloDistinta(GenericItem articoloDistinta, List<GenericItem> articoliAlternativi, List<LivelloDistinta> distinta, int livelloDistinta, int livelloOrdine, int revisione, float qta, float scarto)
	{
		this.articoloDistinta = articoloDistinta;
		this.articoliAlternativi = articoliAlternativi;
		this.livelloDistinta = livelloDistinta;
		this.livelloOrdine = livelloOrdine;
		this.distinta = distinta;
		this.revisione = revisione;
		this.qta = qta;
		this.scarto = scarto;
	}
	
	public LivelloDistinta(GenericItem articoloDistinta, List<GenericItem> articoliAlternativi, List<LivelloDistinta> distinta, int livelloDistinta, int livelloOrdine)
	{
		this.articoloDistinta = articoloDistinta;
		this.articoliAlternativi = articoliAlternativi;
		this.livelloDistinta = livelloDistinta;
		this.livelloOrdine = livelloOrdine;
		this.distinta = distinta;
		this.revisione = 1;
		this.qta = 0;
		this.scarto = 0;
	}
	
	public LivelloDistinta(GenericItem articoloDistinta, int livelloDistinta, int livelloOrdine)
	{
		this.articoloDistinta = articoloDistinta;
		this.livelloDistinta = livelloDistinta;
		this.livelloOrdine = livelloOrdine;
		this.articoliAlternativi = new ArrayList<GenericItem>();
		this.distinta = new ArrayList<LivelloDistinta>();
		this.revisione = 1;
		this.qta = 0;
		this.scarto = 0;
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

	public List<LivelloDistinta> getDistinta() {
		return distinta;
	}

	public void setDistinta(List<LivelloDistinta> distinta) {
		this.distinta = distinta;
	}
	
	public int getRevisione() {
		return revisione;
	}

	public void setRevisione(int revisione) {
		this.revisione = revisione;
	}

	public float getQta() {
		return qta;
	}

	public void setQta(float qta) {
		this.qta = qta;
	}

	public float getScarto() {
		return scarto;
	}

	public void setScarto(float scarto) {
		this.scarto = scarto;
	}
}
