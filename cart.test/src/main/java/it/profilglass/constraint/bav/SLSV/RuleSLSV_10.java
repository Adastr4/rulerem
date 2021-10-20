package it.profilglass.constraint.bav.SLSV;

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

@Rule(order = 10, name = "RuleSLSV_10")

public class RuleSLSV_10 {
	@Given
	private List<Caratteristica> caratteristiche;

	@Result
	private Opzione result = caratteristiche.stream().filter(caratteristica -> "SLSV".equals(caratteristica.getCaratteristica())).findAny().get().getOpzioneFromOpzioneList("30");

	@When
	public boolean when()
	{
		return ReadDB.getDatsFromAttributiBP(caratteristiche.stream().filter(caratteristica -> "SLBP".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione(), "PLBA").equalsIgnoreCase("Ottima");
	}

	@Then
	public RuleState then()
	{
		result = caratteristiche.stream().filter(caratteristica -> "SLSV".equals(caratteristica.getCaratteristica())).findAny().get().getOpzioneFromOpzioneList("10");
		return RuleState.BREAK;
	}
}
