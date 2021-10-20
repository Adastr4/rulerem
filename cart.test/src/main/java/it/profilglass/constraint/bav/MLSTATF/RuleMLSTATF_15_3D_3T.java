package it.profilglass.constraint.bav.MLSTATF;

import java.util.List;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.Caratteristica;
import it.profilglass.classmodel.Opzione;
import test.test.CaratteristicaBean;

@Rule(order = 15, name = "ruleMLSTATF_15")

public class RuleMLSTATF_15_3D_3T extends it.profilglass.constraint.bav.MLSTATF.sub1.SubRuleMLSTATF_3D_3T {
	/*@Given("caratteristica") 
	private CaratteristicaBean caratteristica; //Annotated Lists get injected with all Facts of the declared generic type*/
	@Given
	private List<Caratteristica> caratteristiche;

	@Result
	private Opzione result;

	@Override
	@When
	public boolean when()
	{
		//return (caratteristica.getCLSTATF().equalsIgnoreCase("H16")) && super.when();
		return super.when()
			&& caratteristiche.stream().filter(caratteristica -> "CLSTATF".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione().equalsIgnoreCase("H16");
	}

	@Then
	public RuleState then()
	{
		System.out.println("Rule 15 entered");
		//result = "H26";
		result = caratteristiche.stream().filter(caratteristica -> "MLSTATF".equals(caratteristica.getCaratteristica())).findAny().get().getOpzioneFromOpzioneList("H26");
		return RuleState.NEXT;
	}
}
