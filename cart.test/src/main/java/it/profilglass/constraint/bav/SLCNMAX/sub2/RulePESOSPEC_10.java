package it.profilglass.constraint.bav.SLCNMAX.sub2;

import java.util.List;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.Caratteristica;
import test.test.ReadDB;

@Rule(order = 10, name = "RulePESOSPEC10")

public class RulePESOSPEC_10 {
	/*@Given("caratteristica")
	private CaratteristicaBean caratteristica; //Annotated Lists get injected with all Facts of the declared generic type*/
	@Given
	private List<Caratteristica> caratteristiche;

	@Result
	private int result = 2700;

	@When
	public boolean when()
	{
		return caratteristiche.stream().filter(caratteristica -> "CLLEGA".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione().equalsIgnoreCase("3D");
	}

	@Then
	public RuleState then()
	{	
		result = 2710;
		return RuleState.BREAK;
	}

}
