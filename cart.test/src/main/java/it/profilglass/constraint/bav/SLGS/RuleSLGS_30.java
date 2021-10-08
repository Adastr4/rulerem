package it.profilglass.constraint.bav.SLGS;

import java.util.List;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.Caratteristica;
import it.profilglass.classmodel.Opzione;
import test.test.ReadDB;

@Rule(order = 20, name = "RuleSLGS_20")

public class RuleSLGS_30 {
	@Given
	private List<Caratteristica> caratteristiche;

	@Result
	private Opzione result;

	@When
	public boolean when()
	{
		return ReadDB.getDatsFromAttributiBP(caratteristiche.stream().filter(caratteristica -> "SLBP".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().getOpzione(), "GSBA").equalsIgnoreCase("Media");
	}

	@Then
	public RuleState then()
	{
		result = caratteristiche.stream().filter(caratteristica -> "SLGS".equals(caratteristica.getCaratteristicaId())).findAny().get().getOpzioneFromOpzioneList("20");
		return RuleState.BREAK;
	}
}
