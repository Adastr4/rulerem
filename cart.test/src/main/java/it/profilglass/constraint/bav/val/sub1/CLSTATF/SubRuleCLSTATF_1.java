package it.profilglass.constraint.bav.val.sub1.CLSTATF;

import java.util.List;

import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.When;

import test.test.CaratteristicaBean;

public class SubRuleCLSTATF_1 {
	
	@Given 
	private List<CaratteristicaBean> caratteristiche; //Annotated Lists get injected with all Facts of the declared generic type
	
	@When
	public boolean when()
	{
		
		return caratteristiche.stream().anyMatch(caratteristica -> caratteristica.getSLBPTE().equalsIgnoreCase(caratteristica.getSLBP().toString())
																&& caratteristica.getCLSTATF().equalsIgnoreCase("H14"));
	}

}
