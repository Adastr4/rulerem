package it.profilglass.constraint.bav.SLBP;

import java.util.List;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.Caratteristica;
import it.profilglass.classmodel.Opzione;
import test.test.CaratteristicaBean;

@Rule(order = 2, name = "ruleSLBP_2")

public class ruleSLBP_2 {
	/*@Given("caratteristica")
	private CaratteristicaBean caratteristica; //Annotated Lists get injected with all Facts of the declared generic type*/
	@Given
	private List<Caratteristica> caratteristiche;

	@Result
	private Opzione result;

	@When
	public boolean when()
	{
		return true;
	}

	@Then
	public RuleState then()
	{
		//result = "000000";
		result = caratteristiche.stream().filter(caratteristica -> "SLBP".equals(caratteristica.getCaratteristica())).findAny().get().getOpzioneFromOpzioneList("000000");
		return RuleState.BREAK;
	}

}
