package it.profilglass.constraint.bav.MLSTATF.sub1;

import java.util.List;

import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.When;

import test.test.CaratteristicaBean;

public class SubRuleMLSTATF_3D_3T extends it.profilglass.constraint.bav.MLSTATF.sub1.SubRuleMLSTATF_4 {
	@Given 
	private CaratteristicaBean caratteristica; //Annotated Lists get injected with all Facts of the declared generic type
	
	@When
	public boolean when()
	{
		return (caratteristica.getCLLEGA().equalsIgnoreCase("3D") ||
				caratteristica.getCLLEGA().equalsIgnoreCase("3T")) && super.when();
	}

}
