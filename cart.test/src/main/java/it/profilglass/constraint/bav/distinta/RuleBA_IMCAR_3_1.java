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

@Rule(order = 4, name = "ruleBA_IMCAR_3_1")

public class RuleBA_IMCAR_3_1 {
	@Given 
	private List<Caratteristica> caratteristiche; //Annotated Lists get injected with all Facts of the declared generic type

	@Result
	private List<LivelloDistinta> result;
	
	@When
	public boolean when()
	{
		return caratteristiche.stream().filter(caratteristica -> "CLRIVE".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().getOpzione().equalsIgnoreCase("A"); 
	}
	
	@Then
	public RuleState then()
	{
		//AGIIUNGO IL LIVELLO 2 DI DISTINTA ORDINE 2(IMCAR o IMPVC)
		result.get(0).getDistinta().add(new LivelloDistinta(new GenericItem("IMCAR" + "G28" + "L" +  caratteristiche.stream().filter(caratteristica -> "CLLARG".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().substring(0,caratteristiche.stream().filter(caratteristica -> "CLLARG".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().getOpzione().length()-1) ,"IMCAR",null), 2, 2));
		return RuleState.BREAK;
	}

}
