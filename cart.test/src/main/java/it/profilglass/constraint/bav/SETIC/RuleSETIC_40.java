package it.profilglass.constraint.bav.SETIC;

import java.util.List;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import test.test.CaratteristicaBean;

@Rule(order = 40, name = "ruleSETIC_40")

public class RuleSETIC_40 {
	@Given 
	private List<CaratteristicaBean> caratteristiche;

	@Result
	private String result;
	
	@When
	public boolean when()
	{		
		return (caratteristiche.stream().anyMatch(caratteristica -> caratteristica.getSETICC() == 4));
	}
	
	@Then
	public RuleState then()
	{
		System.out.println("Rule SETIC 4 entered");
		result = "Personalizzata";
		return RuleState.BREAK;
	}
}