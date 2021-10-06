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

@Rule(order = 12, name = "ruleMLSTATF_12")

public class RuleMLSTATF_12_3A extends it.profilglass.constraint.bav.MLSTATF.sub1.SubRuleMLSTATF_0 {
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
		/*return (caratteristica.getCLLEGA().equalsIgnoreCase("3A") && 
				 ( caratteristica.getCLSTATF().equalsIgnoreCase("H00") ||
				   caratteristica.getCLSTATF().equalsIgnoreCase("HA1"))
				 ) && super.when();*/
		return super.when()
			&& caratteristiche.stream().filter(caratteristica -> "CLLEGA".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().getOpzione().equalsIgnoreCase("3A")
			&& (   caratteristiche.stream().filter(caratteristica -> "CLSTATF".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().getOpzione().equalsIgnoreCase("H00")
				|| caratteristiche.stream().filter(caratteristica -> "CLSTATF".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().getOpzione().equalsIgnoreCase("HA1")
			   );
		
	}

	@Then
	public RuleState then()
	{
		System.out.println("Rule 12 entered");
		result = "H18";
		return RuleState.NEXT;
	}
}
