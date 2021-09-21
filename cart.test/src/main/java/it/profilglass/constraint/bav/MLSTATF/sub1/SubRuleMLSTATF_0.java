package it.profilglass.constraint.bav.MLSTATF.sub1;

import java.util.List;

import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.When;

import test.test.CaratteristicaBean;

public class SubRuleMLSTATF_0 {
	@Given 
	private List<CaratteristicaBean> caratteristiche; //Annotated Lists get injected with all Facts of the declared generic type
	
	@When
	public boolean when()
	{
		return caratteristiche.stream().anyMatch(caratteristica -> Integer.parseInt(caratteristica.getCLLARG().toString()) <= 10000 && 
																   Integer.parseInt(caratteristica.getCLLUNG().toString()) <= 10000);
	}	
}
