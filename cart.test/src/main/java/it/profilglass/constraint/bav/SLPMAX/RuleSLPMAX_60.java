package it.profilglass.constraint.bav.SLPMAX;

import java.util.List;

import com.deliveredtechnologies.rulebook.Fact;
import com.deliveredtechnologies.rulebook.FactMap;
import com.deliveredtechnologies.rulebook.NameValueReferableMap;
import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;
import com.deliveredtechnologies.rulebook.model.runner.RuleBookRunner;

import it.profilglass.classmodel.Caratteristica;
import it.profilglass.classmodel.Opzione;
import test.test.ReadDB;

@Rule(order = 60, name = "ruleSLPMAX60")

public class RuleSLPMAX_60 {
	@Given
	private List<Caratteristica> caratteristiche;

	@Result
	private Opzione result;

	@When
	public boolean when()
	{
		return caratteristiche.stream().filter(caratteristica -> "SLTMAX".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione() == ""
			&& Integer.parseInt(caratteristiche.stream().filter(caratteristica -> "SLPMAX".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione()) == 0;
	}

	@Then
	public RuleState then()
	{
		result = new Opzione(String.valueOf(ReadDB.getQitmFromPackageDefinition(caratteristiche.stream().filter(caratteristica -> "SLDEFIMB".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione())));
		return RuleState.BREAK;
	}

}
