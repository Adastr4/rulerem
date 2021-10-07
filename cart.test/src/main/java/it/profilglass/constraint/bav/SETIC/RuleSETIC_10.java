package it.profilglass.constraint.bav.SETIC;

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

@Rule(order = 10, name = "ruleSETIC_10")

public class RuleSETIC_10 {
	/*@Given
	private List<CaratteristicaBean> caratteristiche;*/
	@Given
	private List<Caratteristica> caratteristiche;

	@Result
	private Opzione result;

	@When
	public boolean when()
	{
		//return (caratteristiche.stream().anyMatch(caratteristica -> caratteristica.getSETICC() == 1));
		return Integer.parseInt(caratteristiche.stream().filter(caratteristica -> "SETICC".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().getOpzione()) == 1;
	}

	@Then
	public RuleState then()
	{
		System.out.println("Rule SETIC 1 entered");
		//result = "Con Logo";
		result = new Opzione("Con Logo","Con Logo");
		return RuleState.BREAK;
	}
}
