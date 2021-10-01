package it.profilglass.classmodel;

import java.util.ArrayList;
import java.util.List;

import com.deliveredtechnologies.rulebook.Fact;
import com.deliveredtechnologies.rulebook.FactMap;
import com.deliveredtechnologies.rulebook.NameValueReferableMap;
import com.deliveredtechnologies.rulebook.model.runner.RuleBookRunner;

public abstract class Configuratore {
	
	//LISTA CARATTERISTICHE VALIDE PER TUTTI I CONFIGURATORI
	protected List<Caratteristica> caratteristiche;

	public Configuratore()
	{
		//TO DO: NON POSSO DEFINIRE QUI LE CARATTERISTICHE GENERALI PERCHE GLI ORDINI NEL CONFIGURATORE DI TALI CARATTERISTICHE POSSONO CAMBIARE
	}
	
	public void buildCiclo(GenericItem item)
	{
		//TO DO: DEVE ESSERE IMPLEMENTATO NEI SINGOLI CONFIGURATORI SEPCIFICI 
	}
	
	public List<LivelloDistinta> buildDistinta()
	{
		return new ArrayList<LivelloDistinta>();
	}
	
	public List<Caratteristica> getOrderedCaratteristiche()
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
	
	public Caratteristica getCaratteristicaById(String Id)
	{
		for(Caratteristica cara : this.caratteristiche)
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
