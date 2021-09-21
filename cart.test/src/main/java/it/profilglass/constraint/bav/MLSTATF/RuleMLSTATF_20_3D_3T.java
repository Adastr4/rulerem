package it.profilglass.constraint.bav.MLSTATF;

import java.util.List;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import test.test.CaratteristicaBean;

@Rule(order = 19, name = "ruleMLSTATF_19")

public class RuleMLSTATF_20_3D_3T {
	@Given 
	private List<CaratteristicaBean> caratteristiche; //Annotated Lists get injected with all Facts of the declared generic type

	@Result
	private String result;
	
	@When
	public boolean when()
	{
		return caratteristiche.stream().anyMatch(caratteristica -> ((caratteristica.getCLLEGA().equalsIgnoreCase("3D") ||
																	 caratteristica.getCLLEGA().equalsIgnoreCase("3T")) &&
																    (caratteristica.getCLSTATF().equalsIgnoreCase("H16")) &&
																     (caratteristica.getCLSPESS().intValue() <= 3000) &&
																     (caratteristica.getCLSPESS().intValue() > 1000)
																   ));
	}
	
	@Then
	public RuleState then()
	{
		result = "H26";
		return RuleState.NEXT;
	}
}
