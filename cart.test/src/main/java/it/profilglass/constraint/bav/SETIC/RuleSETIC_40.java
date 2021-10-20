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

@Rule(order = 40, name = "ruleSETIC_40")

public class RuleSETIC_40 {
	/*@Given
	private List<CaratteristicaBean> caratteristiche;*/
	@Given
	private List<Caratteristica> caratteristiche;

	@Result
	private Opzione result;

	@When
	public boolean when()
	{
		//return (caratteristiche.stream().anyMatch(caratteristica -> caratteristica.getSETICC() == 4));
		return Integer.parseInt(caratteristiche.stream().filter(caratteristica -> "SETICC".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione()) == 4;
	}

	@Then
	public RuleState then()
	{
		System.out.println("Rule SETIC 4 entered");
		//result = "Personalizzata";
		result = new Opzione("Personalizzata","Personalizzata");
		return RuleState.BREAK;
	}
}
