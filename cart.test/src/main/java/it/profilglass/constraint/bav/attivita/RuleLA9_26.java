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

@Rule(order = 26, name = "ruleLA9_1")

public class RuleLA9_26 {
	@Given
	//private List<CaratteristicaBean> caratteristiche; //Annotated Lists get injected with all Facts of the declared generic type
	private List<Caratteristica> caratteristiche;

	@Result
	private List<Attivita> result;

	@When
	public boolean when()
	{
		/*return caratteristiche.stream().anyMatch(caratteristica ->  caratteristica.getQLLAVDET().equalsIgnoreCase("I01")
																&& !caratteristica.getSLMOD().equalsIgnoreCase("BP"));*/
		return caratteristiche.stream().filter(caratteristica -> "QLLAVDET".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().getOpzione().equalsIgnoreCase("I01")
			&& !caratteristiche.stream().filter(caratteristica -> "SLMOD".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().getOpzione().equalsIgnoreCase("BP");
	}

	@Then
	public RuleState then()
	{
		result.add(ReadDB.getAttivitaFromId("LA9"));
		return RuleState.NEXT;
	}
}
