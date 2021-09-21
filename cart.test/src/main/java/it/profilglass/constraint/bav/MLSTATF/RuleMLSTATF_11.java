package it.profilglass.constraint.bav.MLSTATF;

import java.util.List;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import test.test.CaratteristicaBean;

@Rule(order = 11, name = "ruleMLSTATF_11")

public class RuleMLSTATF_11 {
	@Given 
	private List<CaratteristicaBean> caratteristiche; //Annotated Lists get injected with all Facts of the declared generic type

	@Result
	private String result;
	
	@When
	public boolean when()
	{
		return caratteristiche.stream().anyMatch(caratteristica -> (caratteristica.getCLLEGA().substring(0, 1).equalsIgnoreCase("1") &&
																						(caratteristica.getCLSTATF().toString().equalsIgnoreCase("H26")
																					    ) &&
																				   (Integer.parseInt(caratteristica.getCLSPESS().toString()) == 3000)
																	)
																);
	}
	
	@Then
	public RuleState then()
	{
		result = "H16";
		return RuleState.NEXT;
	}
}
