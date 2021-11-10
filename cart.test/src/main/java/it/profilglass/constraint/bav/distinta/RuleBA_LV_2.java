package it.profilglass.constraint.bav.distinta;

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
import test.test.Attivita;
import test.test.CaratteristicaBean;
import test.test.ReadDB;

@Rule(order = 20, name = "ruleBA_LV_2")

public class RuleBA_LV_2 {
	@Given 
	private List<Caratteristica> caratteristiche; //Annotated Lists get injected with all Facts of the declared generic type

	@Result
	private LivelloDistinta result;
	
	@When
	public boolean when()
	{
		return caratteristiche.stream().filter(caratteristica -> "SLMOD".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione().equalsIgnoreCase("BP"); 
	}
	
	@Then
	public RuleState then()
	{
		//AGIIUNGO IL LIVELLO 2 DI DISTINTA (LB o LV)
		result.getDistinta().add(new LivelloDistinta(new GenericItem("LV" + caratteristiche.stream().filter(caratteristica -> "CLLEGA".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione() + 
																				caratteristiche.stream().filter(caratteristica -> "CLSPESS".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione() + 
																				caratteristiche.stream().filter(caratteristica -> "MLSTATF".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione() +
																				caratteristiche.stream().filter(caratteristica -> "SLLANAS".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione().substring(3, 7) +
																				caratteristiche.stream().filter(caratteristica -> "CLFINI".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione() +
																				caratteristiche.stream().filter(caratteristica -> "CLTOLLE".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione(),"LV",null), 2, 10));
		return RuleState.NEXT;
	}

}
