package it.profilglass.constraint.bav.SLCPCL;

import java.util.List;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.Caratteristica;
import it.profilglass.classmodel.Opzione;

@Rule(order = 20, name = "RuleSLCPCL_20")

public class RuleSLCPCL_20 {
	@Given
	private List<Caratteristica> caratteristiche;

	@Result
	private Opzione result;

	@When
	public boolean when()
	{
		return caratteristiche.stream().filter(caratteristica -> "CLLEGA".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().getOpzione().equalsIgnoreCase("5O");
	}

	@Then
	public RuleState then()
	{
		result = caratteristiche.stream().filter(caratteristica -> "SLCPCL".equals(caratteristica.getCaratteristicaId())).findAny().get().getOpzioneFromOpzioneList("MF");
		return RuleState.BREAK;
	}
}
