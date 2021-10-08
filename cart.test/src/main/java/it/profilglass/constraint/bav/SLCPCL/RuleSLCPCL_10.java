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

@Rule(order = 10, name = "RuleSLCPCL_10")

public class RuleSLCPCL_10 {
	@Given
	private List<Caratteristica> caratteristiche;

	@Result
	private Opzione result = caratteristiche.stream().filter(caratteristica -> "CLFINI".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue();

	@When
	public boolean when()
	{
		return caratteristiche.stream().filter(caratteristica -> "CLLEGA".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().getOpzione().equalsIgnoreCase("5Z")
			|| caratteristiche.stream().filter(caratteristica -> "CLLEGA".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().getOpzione().equalsIgnoreCase("3O");
	}

	@Then
	public RuleState then()
	{
		result = caratteristiche.stream().filter(caratteristica -> "SLCPCL".equals(caratteristica.getCaratteristicaId())).findAny().get().getOpzioneFromOpzioneList("AR");
		return RuleState.BREAK;
	}
}
