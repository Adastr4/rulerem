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

@Rule(order = 24, name = "ruleLA8_1")

public class RuleLA8_24 extends it.profilglass.constraint.bav.attivita.subrules.SubRuleLA_3 {
	@Given
	//private List<CaratteristicaBean> caratteristiche; //Annotated Lists get injected with all Facts of the declared generic type
	private List<Caratteristica> caratteristiche;

	@Result
	private List<Attivita> result;

	@Override
	@When
	public boolean when()
	{
		/*return super.when() && caratteristiche.stream().anyMatch(caratteristica -> caratteristica.getQLLAVDET().equalsIgnoreCase("E01")
																				&& caratteristica.getCLSPESS().intValue() <= 3000);*/
		return super.when()
			&& (Integer.parseInt(caratteristiche.stream().filter(caratteristica -> "CLSPESS".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().getOpzione()) <= 3000)
			&& caratteristiche.stream().filter(caratteristica -> "QLLAVDET".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().getOpzione().equalsIgnoreCase("E01");
	}

	@Then
	public RuleState then()
	{
		result.add(ReadDB.getAttivitaFromId("LA8"));
		return RuleState.NEXT;
	}
}
