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

@Rule(order = 7, name = "ruleSG9_1")

public class RuleSG9_7 extends it.profilglass.constraint.bav.attivita.subrules.SubRuleSG_1 {
	@Given
	//private List<CaratteristicaBean> caratteristiche; //Annotated Lists get injected with all Facts of the declared generic type
	private List<Caratteristica> caratteristiche;

	@Result
	private List<Attivita> result;

	@Override
	@When
	public boolean when()
	{
		/*return super.when() && caratteristiche.stream().anyMatch(caratteristica -> !caratteristica.getSLMOD().equalsIgnoreCase("BP")
																			    && caratteristica.getQLLAV().equalsIgnoreCase("C"));*/
		return super.when()
			&& !caratteristiche.stream().filter(caratteristica -> "SLMOD".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione().equalsIgnoreCase("BP")
			&& caratteristiche.stream().filter(caratteristica -> "QLLAV".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione().equalsIgnoreCase("C");
	}

	@Then
	public RuleState then()
	{
		result.add(ReadDB.getAttivitaFromId("SG9"));
		return RuleState.NEXT;
	}
}
