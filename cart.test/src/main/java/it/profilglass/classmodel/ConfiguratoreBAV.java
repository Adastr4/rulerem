package it.profilglass.classmodel;

import java.util.Comparator;
import java.util.List;

import com.deliveredtechnologies.rulebook.Fact;
import com.deliveredtechnologies.rulebook.FactMap;
import com.deliveredtechnologies.rulebook.NameValueReferableMap;
import com.deliveredtechnologies.rulebook.model.runner.RuleBookRunner;

import test.test.CaratteristicaBean;
import test.test.ReadDB;

public class ConfiguratoreBAV extends Configuratore {
	
	public ConfiguratoreBAV()
	{
		//INIZIALIZZO TUTTI I VALORI DI CARATTERISTICA
		this.caratteristiche = ReadDB.getCaratteristicheFromConfigurator("BAV");
		//ORDINO PER INDICE DI CONFIGURAZZOONE
		this.caratteristiche.sort(Comparator.comparingInt(Caratteristica::getCaratteristicaOrder));
	}
	
	public List<Caratteristica> getOrderedCaratteristicheBAV()
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
	
	private Caratteristica getCaratteristicaById(String Id)
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
	
	public void runCaratteristicaValidationRuleByIndex(int index)
	{
		try
		{
			RuleBookRunner ruleBook = new RuleBookRunner("it.profilglass.constraint.bav." + this.caratteristiche.get(index).getCaratteristicaId().toUpperCase() + ".val");
			NameValueReferableMap<List<Caratteristica>> facts = new FactMap<>();
			facts.put(new Fact<>(this.caratteristiche));
			ruleBook.run(facts);
		
			//ruleBook.getResult().ifPresent(result -> totalString.append(result.toString()));
		}
		catch(Exception ex)
		{
			System.out.println("No Rule defined!");
		}
	}
	
	public void runCaratteristicaValidationRuleByName(String name)
	{
		
	}
	
	public void runCaratteristicaDefaultValueRuleByIndex(int index)
	{
		
	}
	
	public void runCaratteristicaDefaultValueRuleByName(String name)
	{
		
	}
}
