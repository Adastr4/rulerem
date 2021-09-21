package it.profilglass.constraint.bav.MLSTATF.sub1;

import java.util.List;

import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.When;

import test.test.CaratteristicaBean;

public class SubRuleMLSTATF_2 extends SubRuleMLSTATF_1 {
	@Given 
	private List<CaratteristicaBean> caratteristiche; //Annotated Lists get injected with all Facts of the declared generic type
	
	@When
	public boolean when()
	{
		return super.when() && caratteristiche.stream().anyMatch(caratteristica -> caratteristica.getDLDEST().substring(0, 3).equalsIgnoreCase("PEN") &&
																				   caratteristica.getCLSTATF().toString().equalsIgnoreCase("H00"));
	}																
}
