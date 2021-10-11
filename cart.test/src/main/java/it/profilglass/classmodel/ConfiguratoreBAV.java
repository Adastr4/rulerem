package it.profilglass.classmodel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.deliveredtechnologies.rulebook.Fact;
import com.deliveredtechnologies.rulebook.FactMap;
import com.deliveredtechnologies.rulebook.NameValueReferableMap;
import com.deliveredtechnologies.rulebook.model.runner.RuleBookRunner;

import test.test.CaratteristicaBean;
import test.test.Macchina;
import test.test.ReadDB;

public class ConfiguratoreBAV extends Configuratore {
	
	public ConfiguratoreBAV()
	{
		//INIZIALIZZO TUTTI I VALORI DI CARATTERISTICA
		this.caratteristiche = ReadDB.getCaratteristicheFromConfigurator("BAV");
		//ORDINO PER INDICE DI CONFIGURAZZOONE
		this.caratteristiche.sort(Comparator.comparingInt(Caratteristica::getCaratteristicaOrder));
	}
	
	public boolean runCaratteristicaValidationRuleByIndex(int index)
	{
		try
		{
			RuleBookRunner ruleBook = new RuleBookRunner("it.profilglass.constraint.bav." + this.caratteristiche.get(index).getCaratteristicaId().toUpperCase() + ".val");
			NameValueReferableMap<List<Caratteristica>> facts = new FactMap<>();
			facts.put(new Fact<>(this.caratteristiche));
			ruleBook.run(facts);
			
			if(ruleBook.getResult().isPresent())
			{
				return (boolean) ruleBook.getResult().get().getValue();
			}
			
			return false;
		}
		catch(Exception ex)
		{
			System.out.println("No Validation Rule defined for caratteristica: " + this.caratteristiche.get(index).getCaratteristicaId().toUpperCase() + " !");
			return false;
		}
	}
	
	public boolean runCaratteristicaValidationRuleByName(String name)
	{
		try
		{
			RuleBookRunner ruleBook = new RuleBookRunner("it.profilglass.constraint.bav." + name.toUpperCase() + ".val");
			NameValueReferableMap<Caratteristica> facts = new FactMap<>();
			for(Caratteristica cara : this.caratteristiche)
				facts.put(new Fact<>(cara));
			
			ruleBook.run(facts);
			
			if(ruleBook.getResult().isPresent())
			{
				return (boolean) ruleBook.getResult().get().getValue();
			}
			
			return false;
		}
		catch(Exception ex)
		{
			System.out.println("No Validation Rule defined for caratteristica: " + name.toUpperCase() + " !");
			return false;
		}
	}
	
	public boolean runCaratteristicaDisplayRuleByIndex(int index)
	{
		try
		{
			RuleBookRunner ruleBook = new RuleBookRunner("it.profilglass.constraint.bav." + this.caratteristiche.get(index).getCaratteristicaId().toUpperCase() + ".vis");
			NameValueReferableMap<List<Caratteristica>> facts = new FactMap<>();
			facts.put(new Fact<>(this.caratteristiche));
			ruleBook.run(facts);
			
			if(ruleBook.getResult().isPresent())
			{
				return (boolean) ruleBook.getResult().get().getValue();
			}
			
			return true;
		}
		catch(Exception ex)
		{
			System.out.println("No Visualization Rule defined for caratteristica: " + this.caratteristiche.get(index).getCaratteristicaId().toUpperCase() + " !");
			return true;
		}
	}
	
	public boolean runCaratteristicaDisplayRuleByName(String name)
	{
		try
		{
			RuleBookRunner ruleBook = new RuleBookRunner("it.profilglass.constraint.bav." + name.toUpperCase() + ".vis");
			NameValueReferableMap<Caratteristica> facts = new FactMap<>();
			for(Caratteristica cara : this.caratteristiche)
				facts.put(new Fact<>(cara));
			
			ruleBook.run(facts);
			
			if(ruleBook.getResult().isPresent())
			{
				return (boolean) ruleBook.getResult().get().getValue();
			}
			
			return true;
		}
		catch(Exception ex)
		{
			System.out.println("No Visualization Rule defined for caratteristica: " + name.toUpperCase() + " !");
			return true;
		}
	}
	
	public boolean runCaratteristicaInputRuleByIndex(int index)
	{
		try
		{
			RuleBookRunner ruleBook = new RuleBookRunner("it.profilglass.constraint.bav." + this.caratteristiche.get(index).getCaratteristicaId().toUpperCase() + ".in");
			NameValueReferableMap<List<Caratteristica>> facts = new FactMap<>();
			facts.put(new Fact<>(this.caratteristiche));
			ruleBook.run(facts);
			
			if(ruleBook.getResult().isPresent())
			{
				return (boolean) ruleBook.getResult().get().getValue();
			}
			
			return true;
		}
		catch(Exception ex)
		{
			System.out.println("No Input Rule defined for caratteristica: " + this.caratteristiche.get(index).getCaratteristicaId().toUpperCase() + " !");
			return true;
		}
	}
	
	public boolean runCaratteristicaInputRuleByName(String name)
	{
		try
		{
			RuleBookRunner ruleBook = new RuleBookRunner("it.profilglass.constraint.bav." + name.toUpperCase() + ".in");
			NameValueReferableMap<Caratteristica> facts = new FactMap<>();
			for(Caratteristica cara : this.caratteristiche)
				facts.put(new Fact<>(cara));
			
			ruleBook.run(facts);
			
			if(ruleBook.getResult().isPresent())
			{
				return (boolean) ruleBook.getResult().get().getValue();
			}
			
			return true;
		}
		catch(Exception ex)
		{
			System.out.println("No Input Rule defined for caratteristica: " + name.toUpperCase() + " !");
			return true;
		}
	}
	
	public boolean runCaratteristicaDefaultValueRuleByIndex(int index)
	{
		try
		{
			RuleBookRunner ruleBook = new RuleBookRunner("it.profilglass.constraint.bav." + this.caratteristiche.get(index).getCaratteristicaId().toUpperCase());
			NameValueReferableMap<Caratteristica> facts = new FactMap<>();
			for(Caratteristica cara : this.caratteristiche)
				facts.put(new Fact<>(cara));
			
			ruleBook.run(facts);
			
			if(ruleBook.getResult().isPresent())
			{
				this.caratteristiche.get(index).setSelectedValue((Opzione) ruleBook.getResult().get().getValue());
				return true;
			}
			
			return false;
		}
		catch(Exception ex)
		{
			System.out.println("No Default Rule defined for caratteristica: " + this.caratteristiche.get(index).getCaratteristicaId().toUpperCase().toUpperCase() + " !");
			return false;
		}
	}
	
	public boolean runCaratteristicaDefaultValueRuleByName(String name)
	{
		try
		{
			RuleBookRunner ruleBook = new RuleBookRunner("it.profilglass.constraint.bav." + name.toUpperCase());
			NameValueReferableMap<Caratteristica> facts = new FactMap<>();
			for(Caratteristica cara : this.caratteristiche)
				facts.put(new Fact<>(cara));
			
			ruleBook.run(facts);
			
			if(ruleBook.getResult().isPresent())
			{
				this.getCaratteristicaById(name).setSelectedValue((Opzione) ruleBook.getResult().get().getValue());
				return true;
			}
			
			return false;
		}
		catch(Exception ex)
		{
			System.out.println("No Default Rule defined for caratteristica: " + name.toUpperCase() + " !");
			return false;
		}
	}
	
	public List<LivelloDistinta> buildDistinta()
	{
		try
		{
			RuleBookRunner ruleBook = new RuleBookRunner("it.profilglass.constraint.bav.distinta");
			NameValueReferableMap<Caratteristica> facts = new FactMap<>();
			for(Caratteristica cara : this.caratteristiche)
				facts.put(new Fact<>(cara));
			
			ruleBook.run(facts);
			
			if(ruleBook.getResult().isPresent())
			{
				return (ArrayList<LivelloDistinta>) ruleBook.getResult().get().getValue();
			}
			
			return null;
		}
		catch(Exception ex)
		{
			System.out.println("No Distinta defined for BAV Object !");
			return null;
		}
	}
}
