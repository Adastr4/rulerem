package it.profilglass.constraint.bav.attivita;

import java.util.List;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.Caratteristica;
import test.test.Attivita;
import test.test.CaratteristicaBean;
import test.test.ReadDB;

@Rule(order = 4, name = "ruleST22_1")

public class RuleST22_4 extends it.profilglass.constraint.bav.attivita.subrules.SubRuleST_2 {
	@Given
	//private List<CaratteristicaBean> caratteristiche; //Annotated Lists get injected with all Facts of the declared generic type
	private List<Caratteristica> caratteristiche;

	@Result
	private List<Attivita> result;

	@Override
	@When
	public boolean when()
	{
		//return super.when() && caratteristiche.stream().anyMatch(caratteristica -> caratteristica.getCLSPESS().intValue() > 1490);
		return super.when()
			&& (Integer.parseInt(caratteristiche.stream().filter(caratteristica -> "CLSPESS".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione()) > 1490);
	}

	@Then
	public RuleState then()
	{
		result.add(ReadDB.getAttivitaFromId("ST22"));
		return RuleState.NEXT;
	}
}
