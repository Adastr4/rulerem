package it.profilglass.constraint.bav.val.sub1.CLSTATF;

import java.util.List;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import test.test.CaratteristicaBean;

@Rule(order = 1001, name = "SubRuleCLSTATF_2")

public class SubRuleCLSTATF_2 {
	@Given 
	private List<CaratteristicaBean> caratteristiche; //Annotated Lists get injected with all Facts of the declared generic type
	
	@When
	public boolean when()
	{
		return caratteristiche.stream().anyMatch(caratteristica -> caratteristica.getCLSTATF().substring(1,2).equalsIgnoreCase("H3"));
	}
	
	@Then
	public RuleState When()
	{
		return RuleState.NEXT;
	}

}
