package it.profilglass.classmodel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.deliveredtechnologies.rulebook.Fact;
import com.deliveredtechnologies.rulebook.FactMap;
import com.deliveredtechnologies.rulebook.NameValueReferableMap;
import com.deliveredtechnologies.rulebook.model.runner.RuleBookRunner;

public class ConfiguratoreBAV extends Configuratore {

	public ConfiguratoreBAV()
	{
		try {
			//INIZIALIZZO TUTTI I VALORI DI CARATTERISTICA
			this.caratteristiche = ReadDB.getCaratteristicheFromConfigurator("BAV");
			//ORDINO PER INDICE DI CONFIGURAZZOONE
			this.caratteristiche.sort(Comparator.comparingInt(ICaratteristica::getCaratteristicaOrder));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cicli=new ArrayList<>() ;
		distinte= new ArrayList<>() ;
	}

	@Override
	public boolean runCaratteristicaValidationRuleByIndex(int index)
	{
		try
		{
			RuleBookRunner ruleBook = new RuleBookRunner("it.profilglass.constraint.bav." + this.caratteristiche.get(index).getCaratteristicaId().toUpperCase() + ".val");
			NameValueReferableMap<List<ICaratteristica>> facts = new FactMap<>();
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

	@Override
	public boolean runCaratteristicaValidationRuleByName(String name)
	{
		try
		{
			RuleBookRunner ruleBook = new RuleBookRunner("it.profilglass.constraint.bav." + name.toUpperCase() + ".val");
			NameValueReferableMap<Caratteristica> facts = new FactMap<>();
			for(ICaratteristica cara : this.caratteristiche)
				facts.put(new Fact<>((Caratteristica)cara));

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

	@Override
	public boolean runCaratteristicaDefaultValueRuleByIndex(int index)
	{
		try
		{
			RuleBookRunner ruleBook = new RuleBookRunner("it.profilglass.constraint.bav." + this.caratteristiche.get(index).getCaratteristicaId().toUpperCase());
			NameValueReferableMap<Caratteristica> facts = new FactMap<>();
			for(ICaratteristica cara : this.caratteristiche)
				facts.put(new Fact<>((Caratteristica)cara));

			ruleBook.run(facts);

			if(ruleBook.getResult().isPresent())
			{
				this.caratteristiche.get(index).setSelectedValue(ruleBook.getResult().get().getValue().toString());
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

	@Override
	public boolean runCaratteristicaDefaultValueRuleByName(String name)
	{
		try
		{
			RuleBookRunner ruleBook = new RuleBookRunner("it.profilglass.constraint.bav." + name.toUpperCase());
			NameValueReferableMap<Caratteristica> facts = new FactMap<>();
			for(ICaratteristica cara : this.caratteristiche)
				facts.put(new Fact<>((Caratteristica)cara));

			ruleBook.run(facts);

			if(ruleBook.getResult().isPresent())
			{
				this.getCaratteristicaById(name).setSelectedValue(ruleBook.getResult().get().getValue().toString());
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

	@Override
	public List<LivelloDistinta> buildDistinta()
	{
		try
		{
			RuleBookRunner ruleBook = new RuleBookRunner("it.profilglass.constraint.bav.distinta");
			NameValueReferableMap<Caratteristica> facts = new FactMap<>();
			for(ICaratteristica cara : this.caratteristiche)
				facts.put(new Fact<>((Caratteristica)cara));

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
