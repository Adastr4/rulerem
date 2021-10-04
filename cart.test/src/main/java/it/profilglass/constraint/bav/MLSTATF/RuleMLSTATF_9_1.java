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

@Rule(order = 9, name = "ruleMLSTATF_9")

public class RuleMLSTATF_9_1 extends it.profilglass.constraint.bav.MLSTATF.sub1.SubRuleMLSTATF_1 {
	/*@Given("caratteristica") 
	private CaratteristicaBean caratteristica; //Annotated Lists get injected with all Facts of the declared generic type*/
	
	@Given
	private List<Caratteristica> caratteristiche;

	@Result
	private String result;
	
	@When
	public boolean when()
	{
		/*return super.when() && (caratteristica.getCLLEGA().substring(0, 1).equalsIgnoreCase("1") &&
									(caratteristica.getCLSTATF().toString().equalsIgnoreCase("H00") ||
									 caratteristica.getCLSTATF().toString().equalsIgnoreCase("HA1")
									) &&
								!(Integer.parseInt(caratteristica.getCLSPESS().toString()) >= 2500)
																	);*/
		return super.when()
			&& caratteristiche.stream().filter(caratteristica -> "CLLEGA".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().substring(0,1).equalsIgnoreCase("1")
			&& (   caratteristiche.stream().filter(caratteristica -> "CLSTATF".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().equalsIgnoreCase("H00")
				|| caratteristiche.stream().filter(caratteristica -> "CLSTATF".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().equalsIgnoreCase("HA1")
			   )
			&& !(Integer.parseInt(caratteristiche.stream().filter(caratteristica -> "CLSPESS".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue()) >= 2500);
	}
	
	@Then
	public RuleState then()
	{
		System.out.println("Rule 9 entered");
		result = "H18";
		return RuleState.NEXT;
	}
}
