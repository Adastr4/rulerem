package it.profilglass.constraint.bav.distinta;

import java.util.List;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.GenericItem;
import it.profilglass.classmodel.ICaratteristica;
import it.profilglass.classmodel.LivelloDistinta;

@Rule(order = 6, name = "ruleBA_IMCAR_3_1")

public class RuleBA_IMPVC_3_3 {
	@Given
	private List<ICaratteristica> caratteristiche; //Annotated Lists get injected with all Facts of the declared generic type

	@Result
	private List<LivelloDistinta> result;

	@When
	public boolean when()
	{
		return !caratteristiche.stream().filter(caratteristica -> "CLRIVE".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().equalsIgnoreCase("S") &&
			   !caratteristiche.stream().filter(caratteristica -> "CLRIVE".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().equalsIgnoreCase("A") &&
			   !caratteristiche.stream().filter(caratteristica -> "CLRIVE".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().equalsIgnoreCase("B");
	}

	@Then
	public RuleState then()
	{
		//result.add(ReadDB.getAttivitaFromId("BA1"));
		result.add(new LivelloDistinta(new GenericItem("IMPVC" + "050"  + caratteristiche.stream().filter(caratteristica -> "CLLARG".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().substring(0,caratteristiche.stream().filter(caratteristica -> "CLLARG".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().length()-1) +
																							caratteristiche.stream().filter(caratteristica -> "SLMOD".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue() ,"IMPVC",null), 2, 2));
		return RuleState.BREAK;
	}

}
