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

@Rule(order = 11, name = "ruleMLSTATF_11")

public class RuleMLSTATF_11_1 extends it.profilglass.constraint.bav.MLSTATF.sub1.SubRuleMLSTATF_2 {
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
		//return caratteristica.getCLLEGA().substring(0, 1).equalsIgnoreCase("1") && super.when();
		return super.when()
			&& caratteristiche.stream().filter(caratteristica -> "CLLEGA".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione().substring(0,1).equalsIgnoreCase("1");
	}

	@Then
	public RuleState then()
	{
		System.out.println("Rule 11 entered");
		//result = "H18";
		result = caratteristiche.stream().filter(caratteristica -> "MLSTATF".equals(caratteristica.getCaratteristica())).findAny().get().getOpzioneFromOpzioneList("H18");
		return RuleState.NEXT;
	}
}
