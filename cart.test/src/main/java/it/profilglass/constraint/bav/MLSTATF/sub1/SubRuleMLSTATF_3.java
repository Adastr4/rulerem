package it.profilglass.constraint.bav.MLSTATF.sub1;

import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.ICaratteristica;

public class SubRuleMLSTATF_3 {
	@Given("caratteristica")
	private ICaratteristica caratteristica; //Annotated Lists get injected with all Facts of the declared generic type

	@When
	public boolean when()
	{
		return caratteristica.getCLSTATF().equalsIgnoreCase("H24") ||
			   caratteristica.getCLSTATF().equalsIgnoreCase("H14");
	}
}
