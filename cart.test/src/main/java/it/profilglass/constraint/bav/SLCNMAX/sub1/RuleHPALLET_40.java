package it.profilglass.constraint.bav.SLCNMAX.sub1;

import java.util.List;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.Caratteristica;

@Rule(order = 40, name = "RuleHPALLET40")

public class RuleHPALLET_40 {
	/*@Given("caratteristica")
	private CaratteristicaBean caratteristica; //Annotated Lists get injected with all Facts of the declared generic type*/
	@Given
	private List<Caratteristica> caratteristiche;

	@Result
	private int result;

	@When
	public boolean when()
	{
		return caratteristiche.stream().filter(caratteristica -> "SBADEFIMB".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().getOpzione().substring(2,5).equalsIgnoreCase("003")
			&& (Integer.parseInt(caratteristiche.stream().filter(caratteristica -> "CLLUNG".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().getOpzione())/10 <= 1400);
	}

	@Then
	public RuleState then()
	{	
		result = 120;
		return RuleState.BREAK;
	}
}
