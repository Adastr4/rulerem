package it.profilglass.classmodel;

import java.util.ArrayList;
import java.util.List;

import com.deliveredtechnologies.rulebook.Fact;
import com.deliveredtechnologies.rulebook.FactMap;
import com.deliveredtechnologies.rulebook.NameValueReferableMap;
import com.deliveredtechnologies.rulebook.model.runner.RuleBookRunner;

import test.test.ReadDB;

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

	
	public List<LivelloDistinta> buildDistinta()
	{
		return new ArrayList<LivelloDistinta>();
	}
	
	public List<Caratteristica> getOrderedCaratteristiche()
	{
		return this.caratteristiche;
	}
	
	public void setCaratteristicaValue(String idCaratteristica, String value, String description)
	{
		this.getCaratteristicaById(idCaratteristica).setSelectedValue(new Opzione(value,description));
	}
	
	public List<Opzione> getCaratteristicaOpzioni(String idCaratteristica)
	{
		return this.getCaratteristicaById(idCaratteristica).getValori();
	}
	
	public Caratteristica getCaratteristicaById(String Id)
	{
		for(Caratteristica cara : this.caratteristiche)
		{
			if(cara.getCaratteristica().equalsIgnoreCase(Id))
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
	
	public boolean runCaratteristicaDisplayRuleByIndex(int index)
	{
		return true;
	}
	
	public boolean runCaratteristicaDisplayRuleByName(String name)
	{
		return true;
	}
	
	public boolean runCaratteristicaInputRuleByIndex(int index)
	{
		return true;
	}
	
	public boolean runCaratteristicaInputRuleByName(String name)
	{
		return true;
	}
	
	public List<Opzione> getValidatedOptionsByName(String name)
	{
		return null;
	}

}
