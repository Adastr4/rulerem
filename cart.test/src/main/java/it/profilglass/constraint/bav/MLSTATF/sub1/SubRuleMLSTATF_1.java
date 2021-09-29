package it.profilglass.constraint.bav.MLSTATF.sub1;

import java.util.List;

import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.When;

import test.test.CaratteristicaBean;

public class SubRuleMLSTATF_1 extends SubRuleMLSTATF_0 {
	@Given("caratteristica")  
	private CaratteristicaBean caratteristica; //Annotated Lists get injected with all Facts of the declared generic type
	
	@When
	public boolean when()
	{
		return super.when() && caratteristica.getCLRIVE().equalsIgnoreCase("B");
	}	

}
