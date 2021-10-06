package it.profilglass.constraint.bav.MLSTATF;

import java.util.List;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.Caratteristica;
import test.test.CaratteristicaBean;

@Rule(order = 23, name = "ruleMLSTATF_23")

public class RuleMLSTATF_23_3 extends it.profilglass.constraint.bav.MLSTATF.sub1.SubRuleMLSTATF_2 {
	/*@Given("caratteristica") 
	private CaratteristicaBean caratteristica; //Annotated Lists get injected with all Facts of the declared generic type*/
	
	@Given
	private List<Caratteristica> caratteristiche;

	@Result
	private String result;

	@Override
	@When
	public boolean when()
	{
		//return (caratteristica.getCLLEGA().substring(0,1).equalsIgnoreCase("3")) && super.when();
		return super.when()
			&& caratteristiche.stream().filter(caratteristica -> "CLLEGA".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().getOpzione().substring(0,1).equalsIgnoreCase("3");
	}

	@Then
	public RuleState then()
	{
		System.out.println("Rule 22 entered");
		result = "H18";
		return RuleState.NEXT;
	}
}
