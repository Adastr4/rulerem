package it.profilglass.classmodel;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import com.deliveredtechnologies.rulebook.Fact;
import com.deliveredtechnologies.rulebook.FactMap;
import com.deliveredtechnologies.rulebook.NameValueReferableMap;
import com.deliveredtechnologies.rulebook.model.runner.RuleBookRunner;

import test.test.CaratteristicaBean;
import test.test.Macchina;
import test.test.ReadDB;
import it.profilglass.orm.DataManagement;
import it.profilglass.orm.RichiesteRighe;
import it.profilglass.orm.RichiesteRigheIdentity;
import it.profilglass.orm.RichiesteTestata;

public class ConfiguratoreBAV extends Configuratore {
	
	public ConfiguratoreBAV()
	{
		//INIZIALIZZO TUTTI I VALORI DI CARATTERISTICA
		this.caratteristiche = DataManagement.readCaratteristicaByItem("BA");
		//ORDINO PER INDICE DI CONFIGURAZZONE
		this.caratteristiche.sort(Comparator.comparingInt(Caratteristica::getCaratteristicaOrder));
	}
	
	@Override
	public boolean runCaratteristicaValidationRuleByIndex(int index)
	{
		try
		{
			RuleBookRunner ruleBook = new RuleBookRunner("it.profilglass.constraint.bav." + this.caratteristiche.get(index).getCaratteristica().toUpperCase() + ".val");
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
			System.out.println("No Validation Rule defined for caratteristica: " + this.caratteristiche.get(index).getCaratteristica().toUpperCase() + " !");
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
	
	@Override
	public List<Opzione> getValidatedOptionsByName(String name)
	{
		try
		{
			/*DEVO CARICARE LE OPZIONI DELLA CARATTERISTICA*/
			List<Opzione> listaReturn = new ArrayList<Opzione>();
			List<Opzione> lista = ReadDB.getOpzioniList("BA", name);
			if(lista.size() < 10)
			{
				for(Opzione opz : lista)
				{
					RuleBookRunner ruleBook = new RuleBookRunner("it.profilglass.constraint.bav." + name.toUpperCase() + ".val");
					NameValueReferableMap<Caratteristica> facts = new FactMap<>();
					for(Caratteristica cara : this.caratteristiche)
					{
						if(cara.getCaratteristica().equalsIgnoreCase(name))
							cara.setSelectedValue(opz);
						facts.put(new Fact<>(cara));
					}
					
					ruleBook.run(facts);
				
					if(ruleBook.getResult().isPresent())
					{
						if((boolean)ruleBook.getResult().get().getValue())
						{
							listaReturn.add(opz);	
						}
					}
				}
			}
			else
			{
				//IMPLEMENTARE UN CONTROLLO PIU RAPIDO PER I CASI DI OPZIONI NUMEROSE
				RuleBookRunner ruleBook = new RuleBookRunner("it.profilglass.constraint.bav." + name.toUpperCase() + ".val");
				lista.parallelStream().forEach((opz) -> 
				{
					NameValueReferableMap<Caratteristica> facts = new FactMap<>();
					this.caratteristiche.parallelStream().forEach((cara) ->
					{
						if(cara.getCaratteristica().equalsIgnoreCase(name))
							cara.setSelectedValue(opz);
						facts.put(new Fact<>(cara));
					});
					
					ruleBook.run(facts);
				
					if(ruleBook.getResult().isPresent())
					{
						if((boolean)ruleBook.getResult().get().getValue())
						{
							listaReturn.add(opz);	
						}
					}
				});
			}
			try
			{
				listaReturn.sort(Comparator.comparingInt(Opzione::getOpzioneToInt));
			}
			catch(Exception ex)
			{
				listaReturn.sort(Comparator.comparing(Opzione::getOpzione));
			}
			
			return listaReturn;
		}
		catch(Exception ex)
		{
			System.out.println("No Validation Rule defined for caratteristica: " + name.toUpperCase() + " ! " + ex.toString());
			return null;
		}
	}
	
	@Override
	public boolean runCaratteristicaDisplayRuleByIndex(int index)
	{
		try
		{
			RuleBookRunner ruleBook = new RuleBookRunner("it.profilglass.constraint.bav." + this.caratteristiche.get(index).getCaratteristica().toUpperCase() + ".dis");
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
			System.out.println("No Visualization Rule defined for caratteristica: " + this.caratteristiche.get(index).getCaratteristica().toUpperCase() + " !");
			return true;
		}
	}
	
	@Override
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
	
	@Override
	public boolean runCaratteristicaInputRuleByIndex(int index)
	{
		try
		{
			RuleBookRunner ruleBook = new RuleBookRunner("it.profilglass.constraint.bav." + this.caratteristiche.get(index).getCaratteristica().toUpperCase() + ".in");
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
			System.out.println("No Input Rule defined for caratteristica: " + this.caratteristiche.get(index).getCaratteristica().toUpperCase() + " !");
			return true;
		}
	}
	
	@Override
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
	
	@Override
	public boolean runCaratteristicaDefaultValueRuleByIndex(int index)
	{
		try
		{
			RuleBookRunner ruleBook = new RuleBookRunner("it.profilglass.constraint.bav." + this.caratteristiche.get(index).getCaratteristica().toUpperCase());
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
			System.out.println("No Default Rule defined for caratteristica: " + this.caratteristiche.get(index).getCaratteristica().toUpperCase().toUpperCase() + " !");
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
	
	@Override
	public LivelloDistinta buildDistinta()
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
				return (LivelloDistinta) ruleBook.getResult().get().getValue();
			}
			
			return null;
		}
		catch(Exception ex)
		{
			System.out.println("No Distinta defined for BAV Object !");
			return null;
		}
	}
	
	@Override
	public boolean saveRequest()
	{
		//Devo creare la riga in testata e le righe in tabella
		int maxId = DataManagement.getRichiesteTestataMaxId() + 1;
		RichiesteTestata testata = new RichiesteTestata(maxId, "BA", "Inserimento richiesta test", "B00001",DataManagement.readBusinessPartnerByBPCode("B00001"),"pgced012",1,new Date(),new Date(),"","","");
		List<RichiesteRighe> righe = new ArrayList<RichiesteRighe>();
		for(Caratteristica cara : this.caratteristiche)
			righe.add(new RichiesteRighe(new RichiesteRigheIdentity(maxId,"BA",cara.getSequenza(),cara.getCaratteristicaId()),maxId,"BA",cara.getSequenza(),cara.getCaratteristicaId(),cara,cara.getSelectedValue().getOpzione(),"No"));
		return DataManagement.saveRichiesta(testata, righe);
	}
}
