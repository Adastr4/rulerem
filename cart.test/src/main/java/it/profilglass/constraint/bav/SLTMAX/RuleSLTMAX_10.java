package it.profilglass.constraint.bav.SLTMAX;

import java.util.List;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.Caratteristica;
import it.profilglass.classmodel.Opzione;

@Rule(order = 10, name = "RuleSLTMAX_10")

public class RuleSLTMAX_10 {
	@Given 
	private List<Caratteristica> caratteristiche; //Annotated Lists get injected with all Facts of the declared generic type

	@Result
	private Opzione result;
	
	@When
	public boolean when()
	{
		return Integer.parseInt(caratteristiche.stream().filter(caratteristica -> "SBATIPO".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().getOpzione()) == 1
			|| Integer.parseInt(caratteristiche.stream().filter(caratteristica -> "SBATIPO".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().getOpzione()) == 2;
			   
	}
	
	@Then
	public RuleState then()
	{
		//result = 1;
		result = caratteristiche.stream().filter(caratteristica -> "SLTMAX".equals(caratteristica.getCaratteristicaId())).findAny().get().getOpzioneFromOpzioneList("1");
		return RuleState.BREAK;
	}

}
