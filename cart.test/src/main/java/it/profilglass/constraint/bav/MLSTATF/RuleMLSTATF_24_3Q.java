package it.profilglass.constraint.bav.MLSTATF;

import java.util.List;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import test.test.CaratteristicaBean;

@Rule(order = 24, name = "ruleMLSTATF_24")

public class RuleMLSTATF_24_3Q {
	@Given 
	private List<CaratteristicaBean> caratteristiche; //Annotated Lists get injected with all Facts of the declared generic type

	@Result
	private String result;
	
	private CaratteristicaBean carRet;
	
	@When
	public boolean when()
	{
		for (CaratteristicaBean caratteristica : caratteristiche) {
			if(caratteristica.getCLLEGA().equalsIgnoreCase("3Q") &&
			   caratteristica.getCLSPESS().intValue() >= 2000)
			{
				carRet = caratteristica;
			}
		}
		return false;
	}
	
	@Then
	public RuleState then()
	{
		result = carRet.getCLSTATF().toString();
		return RuleState.BREAK;
	}
}
