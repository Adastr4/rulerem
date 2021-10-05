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

@Rule(order = 2, name = "ruleMLSTATF_2_1O_1Q")

public class RuleMLSTATF_2_1O_1Q extends it.profilglass.constraint.bav.MLSTATF.sub1.SubRuleMLSTATF_3 {
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
		/*return super.when() && (caratteristica.getCLLEGA().equalsIgnoreCase("1O") && !caratteristica.getCLSPESS().toString().equalsIgnoreCase("4000") ||
				   			    caratteristica.getCLLEGA().equalsIgnoreCase("1Q") && !caratteristica.getCLSPESS().toString().equalsIgnoreCase("2000"));*/
		return super.when()
			&& ((   Integer.parseInt(caratteristiche.stream().filter(caratteristica -> "CLSPESS".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue()) == 4000
				&& caratteristiche.stream().filter(caratteristica -> "CLLEGA".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().equalsIgnoreCase("1O")
			   )
			|| (    Integer.parseInt(caratteristiche.stream().filter(caratteristica -> "CLSPESS".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue()) == 2000
				&& caratteristiche.stream().filter(caratteristica -> "CLLEGA".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().equalsIgnoreCase("1Q")  
			   ));
	}

	@Then
	public RuleState then()
	{
		System.out.println("Rule 2 entered");
		result = "H24";
		return RuleState.NEXT;
	}
}
