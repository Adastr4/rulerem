package it.profilglass.constraint.bav.MLSTATF;

import java.util.List;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import test.test.CaratteristicaBean;

@Rule(order = 9, name = "ruleMLSTATF_9")

public class RuleMLSTATF_9 extends it.profilglass.constraint.bav.MLSTATF.sub1.SubRuleMLSTATF_1 {
	@Given 
	private List<CaratteristicaBean> caratteristiche; //Annotated Lists get injected with all Facts of the declared generic type

	@Result
	private String result;
	
	@When
	public boolean when()
	{
		return super.when() && caratteristiche.stream().anyMatch(caratteristica -> (caratteristica.getCLLEGA().substring(0, 1).equalsIgnoreCase("1") &&
																						(caratteristica.getCLSTATF().toString().equalsIgnoreCase("H00") ||
																						 caratteristica.getCLSTATF().toString().equalsIgnoreCase("HA1")
																					    ) &&
																	Integer.parseInt(caratteristica.getCLSPESS().toString()) >= 2500
																	)
																);
	}
	
	@Then
	public RuleState then()
	{
		result = "H00";
		return RuleState.NEXT;
	}
}
