package it.profilglass.constraint.bav.distinta;

import java.util.ArrayList;
import java.util.List;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.Caratteristica;
import it.profilglass.classmodel.Ciclo;
import it.profilglass.classmodel.Distinta;
import it.profilglass.classmodel.GenericItem;
import it.profilglass.classmodel.LivelloDistinta;
import it.profilglass.orm.DistintaOrm;
import test.test.Attivita;
import test.test.CaratteristicaBean;
import test.test.ReadDB;

@Rule(order = 10, name = "ruleBA_1")

public class RuleBA_1 {
	@Given 
	private List<Caratteristica> caratteristiche; //Annotated Lists get injected with all Facts of the declared generic type

	@Result
	private LivelloDistinta result = null;
	
	@When
	public boolean when()
	{
		return !caratteristiche.stream().filter(caratteristica -> "CLLEGA".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione().equalsIgnoreCase("") &&
			   !caratteristiche.stream().filter(caratteristica -> "CLSPESS".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione().equalsIgnoreCase("") &&
			   !caratteristiche.stream().filter(caratteristica -> "CLSTATF".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione().equalsIgnoreCase("") &&
			   !caratteristiche.stream().filter(caratteristica -> "CLLARG".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione().equalsIgnoreCase("") &&
			   !caratteristiche.stream().filter(caratteristica -> "CLLUNG".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione().equalsIgnoreCase("") &&
			   !caratteristiche.stream().filter(caratteristica -> "CLFINI".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione().equalsIgnoreCase("") &&
			   !caratteristiche.stream().filter(caratteristica -> "CLTOLLE".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione().equalsIgnoreCase("") &&
			   !caratteristiche.stream().filter(caratteristica -> "CLRIVE".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione().equalsIgnoreCase(""); 
	}
	
	@Then
	public RuleState then()
	{
		//Aggiungo il primo livello di distinta (nodo);
		result = new LivelloDistinta(new GenericItem("BA" + caratteristiche.stream().filter(caratteristica -> "CLLEGA".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione().toString() + 
															caratteristiche.stream().filter(caratteristica -> "CLSPESS".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione().toString() + 
															caratteristiche.stream().filter(caratteristica -> "CLSTATF".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione().toString() +
															caratteristiche.stream().filter(caratteristica -> "CLLARG".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione().toString() + 
															caratteristiche.stream().filter(caratteristica -> "CLLUNG".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione().toString() + 
															caratteristiche.stream().filter(caratteristica -> "CLFINI".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione().toString() +
															caratteristiche.stream().filter(caratteristica -> "CLTOLLE".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione().toString() + 
															caratteristiche.stream().filter(caratteristica -> "CLRIVE".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione().toString(),"BA",null), 1, 10);
		return RuleState.NEXT;
	}

}
