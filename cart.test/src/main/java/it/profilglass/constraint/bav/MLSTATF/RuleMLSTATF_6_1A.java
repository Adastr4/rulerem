package it.profilglass.constraint.bav.MLSTATF;

import java.util.List;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import test.test.CaratteristicaBean;

@Rule(order = 6, name = "ruleMLSTATF_6")

public class RuleMLSTATF_6_1A {
	@Given 
	private List<CaratteristicaBean> caratteristiche; //Annotated Lists get injected with all Facts of the declared generic type

	@Result
	private String result;
	
	@When
	public boolean when()
	{
		return caratteristiche.stream().anyMatch(caratteristica -> ((caratteristica.getCLLEGA().equalsIgnoreCase("1A")) && 
																	 caratteristica.getCLRIVE().toString().equalsIgnoreCase("B") &&
																	 caratteristica.getCLSTATF().toString().equalsIgnoreCase("H00") &&
																	 Integer.parseInt(caratteristica.getCLLARG().toString()) <= 6500 &&
																	 Integer.parseInt(caratteristica.getCLLUNG().toString()) <= 6500
																	 )
																);
	}
	
	@Then
	public RuleState then()
	{
		result = "H18";
		return RuleState.NEXT;
	}

}
