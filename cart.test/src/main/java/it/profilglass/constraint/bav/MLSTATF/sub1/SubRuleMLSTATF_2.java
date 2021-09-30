package it.profilglass.constraint.bav.MLSTATF.sub1;

import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.When;

import test.test.CaratteristicaBean;

public class SubRuleMLSTATF_2 extends SubRuleMLSTATF_1 {
	@Given("caratteristica")
	private CaratteristicaBean caratteristica; //Annotated Lists get injected with all Facts of the declared generic type

	@Override
	@When
	public boolean when()
	{
		return super.when() && caratteristica.getDLDEST().substring(0, 3).equalsIgnoreCase("PEN") &&
							   caratteristica.getCLSTATF().toString().equalsIgnoreCase("H00");
	}
}
