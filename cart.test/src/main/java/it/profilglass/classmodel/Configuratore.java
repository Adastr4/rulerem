package it.profilglass.classmodel;

import java.util.ArrayList;
import java.util.List;

public abstract class Configuratore {
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

	protected List<Ciclo> cicli;
	protected List<Distinta> distinte;
	// LISTA CARATTERISTICHE VALIDE PER TUTTI I CONFIGURATORI
	protected List<ICaratteristica> caratteristiche;

	public List<ICaratteristica> getCaratteristiche() {
		return caratteristiche;
	}

	public void setCaratteristiche(List<ICaratteristica> caratteristiche) {
		this.caratteristiche = caratteristiche;
	}

	
	public List<LivelloDistinta> buildDistinta()
	{
		return new ArrayList<LivelloDistinta>();
	}
	
	public List<ICaratteristica> getOrderedCaratteristiche()
	{
		return this.caratteristiche;
	}
	
	public void setCaratteristicaValue(String idCaratteristica, String value)
	{
		this.getCaratteristicaById(idCaratteristica).setSelectedValue(value);
	}
	
	public List<Opzione> getCaratteristicaOpzioni(String idCaratteristica)
	{
		return this.getCaratteristicaById(idCaratteristica).getValori();
	}
	
	public ICaratteristica getCaratteristicaById(String Id)
	{
		for(ICaratteristica cara : this.caratteristiche)
		{
			if(cara.getCaratteristicaId().equalsIgnoreCase(Id))
			{
				return cara;
			}
		}
		
		return null;
	}
	
	public boolean runCaratteristicaValidationRuleByIndex(int index)
	{
		return true;
	}
	
	public boolean runCaratteristicaValidationRuleByName(String name)
	{
		return true;
	}
	
	public boolean runCaratteristicaDefaultValueRuleByIndex(int index)
	{
		return true;
	}
	
	public boolean runCaratteristicaDefaultValueRuleByName(String name)
	{
		return true;

	}

}
