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
import test.test.ReadDB;

@Rule(order = 6, name = "ruleSG21_1")

public class RuleSG21_6 extends it.profilglass.constraint.bav.attivita.subrules.SubRuleSG_1 {
	@Given
	//private List<CaratteristicaBean> caratteristiche; //Annotated Lists get injected with all Facts of the declared generic type
	private List<Caratteristica> caratteristiche;

	@Result
	private List<Attivita> result;

	@Override
	@When
	public boolean when()
	{
		/*return super.when() && caratteristiche.stream().anyMatch(caratteristica -> caratteristica.getSLMOD().equalsIgnoreCase("BP")
																			    && caratteristica.getCLSPESS().intValue() > 400
																			    && caratteristica.getQLLAV().equalsIgnoreCase("N"));*/
		return super.when()
			&& caratteristiche.stream().filter(caratteristica -> "SLMOD".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().getOpzione().equalsIgnoreCase("BP")
			&& (Integer.parseInt(caratteristiche.stream().filter(caratteristica -> "CLSPESS".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().getOpzione()) > 400)
			&& caratteristiche.stream().filter(caratteristica -> "QLLAV".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().getOpzione().equalsIgnoreCase("N");
			
	}

	@Then
	public RuleState then()
	{
		result.add(ReadDB.getAttivitaFromId("SG21"));
		return RuleState.NEXT;
	}
}
