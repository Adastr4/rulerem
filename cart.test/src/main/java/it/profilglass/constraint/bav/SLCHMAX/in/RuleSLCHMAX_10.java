package it.profilglass.constraint.bav.SLCHMAX.in;

import java.util.List;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.Caratteristica;
import test.test.CaratteristicaBean;

@Rule(order = 10, name = "ruleSLCHMAX_10")

public class RuleSLCHMAX_10 {

	/*@Given("caratteristica")
	private CaratteristicaBean caratteristica; //Annotated Lists get injected with all Facts of the declared generic type*/
	@Given
	private List<Caratteristica> caratteristiche;

	@Result
	private Boolean result = Boolean.FALSE;

	@When
	public boolean when()
	{
		
		//return (caratteristica.getSBATIPO() != 1 && caratteristica.getSBATIPO() != 2 && caratteristica.getSLTMAX() == 2);
		return Integer.parseInt(caratteristiche.stream().filter(caratteristica -> "SBATIPO".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione()) != 1 
			&& Integer.parseInt(caratteristiche.stream().filter(caratteristica -> "SBATIPO".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione()) != 2 
			&& Integer.parseInt(caratteristiche.stream().filter(caratteristica -> "SLTMAX".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione()) == 2;
	}

	@Then
	public RuleState then()
	{
		result = Boolean.TRUE;
		return RuleState.BREAK;
	}

}
