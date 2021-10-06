package it.profilglass.constraint.bav.SETIC;

import java.util.List;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.Caratteristica;
import test.test.CaratteristicaBean;

@Rule(order = 50, name = "ruleSETIC_50")

public class RuleSETIC_50 {
	/*@Given
	private List<CaratteristicaBean> caratteristiche;*/
	@Given
	private List<Caratteristica> caratteristiche;

	@Result
	private String result;

	@When
	public boolean when()
	{
		//return (caratteristiche.stream().anyMatch(caratteristica -> caratteristica.getSETICC() == 5));
		return Integer.parseInt(caratteristiche.stream().filter(caratteristica -> "SETICC".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().getOpzione()) == 5;
	}

	@Then
	public RuleState then()
	{
		System.out.println("Rule SETIC 5 entered");
		result = "Con Logo + VDA";
		return RuleState.BREAK;
	}
}
