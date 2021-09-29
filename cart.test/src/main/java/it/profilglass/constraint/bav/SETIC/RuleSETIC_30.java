package it.profilglass.constraint.bav.SETIC;

import java.util.List;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import test.test.CaratteristicaBean;

@Rule(order = 30, name = "ruleSETIC_30")

public class RuleSETIC_30 {
	@Given 
	private List<CaratteristicaBean> caratteristiche;

	@Result
	private String result;
	
	@When
	public boolean when()
	{		
		return (caratteristiche.stream().anyMatch(caratteristica -> caratteristica.getSETICC() == 3));
	}
	
	@Then
	public RuleState then()
	{
		System.out.println("Rule SETIC 3 entered");
		result = "Anonima";
		return RuleState.BREAK;
	}
}