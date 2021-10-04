package it.profilglass.constraint.bav.MLSTATF.sub1;

import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.ICaratteristica;

public class SubRuleMLSTATF_4A {
	@Given("caratteristica")
	private ICaratteristica caratteristica; //Annotated Lists get injected with all Facts of the declared generic type

	@When
	public boolean when()
	{
		return caratteristica.getCLLEGA().substring(0,1).equalsIgnoreCase("4A");
	}
}
