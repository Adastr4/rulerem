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

@Rule(order = 20, name = "ruleSETIC_20")

public class RuleSETIC_20 {
	/*@Given
	private List<CaratteristicaBean> caratteristiche;*/
	@Given
	private List<Caratteristica> caratteristiche;

	@Result
	private Opzione result;

	@When
	public boolean when()
	{
		//return (caratteristiche.stream().anyMatch(caratteristica -> caratteristica.getSETICC() == 2));
		return Integer.parseInt(caratteristiche.stream().filter(caratteristica -> "SETICC".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione()) == 2;
	}

	@Then
	public RuleState then()
	{
		System.out.println("Rule SETIC 2 entered");
		//result = "Senza Logo";
		result = new Opzione("Senza Logo","Senza Logo");
		return RuleState.BREAK;
	}
}
