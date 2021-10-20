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

@Rule(order = 13, name = "ruleSL3_1")

public class RuleSL3_13 extends it.profilglass.constraint.bav.attivita.subrules.SubRuleSL_2{
	@Given
	//private List<CaratteristicaBean> caratteristiche; //Annotated Lists get injected with all Facts of the declared generic type
	private List<Caratteristica> caratteristiche;

	@Result
	private List<Attivita> result;

	@Override
	@When
	public boolean when()
	{
		/*return super.when() && caratteristiche.stream().anyMatch(caratteristica -> !caratteristica.getSLMOD().toString().equalsIgnoreCase("BP")
																				 && caratteristica.getQLLAVDET().toString().equalsIgnoreCase("B11")
																				 && caratteristica.getCLSPESS().intValue() <= 240);*/
		return super.when()
			&& !caratteristiche.stream().filter(caratteristica -> "SLMOD".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione().equalsIgnoreCase("BP")
			&& caratteristiche.stream().filter(caratteristica -> "QLLAVDET".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione().equalsIgnoreCase("B11")
			&& (Integer.parseInt(caratteristiche.stream().filter(caratteristica -> "CLSPESS".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione()) <= 240);
	}

	@Then
	public RuleState then()
	{
		result.add(ReadDB.getAttivitaFromId("SL3"));
		return RuleState.NEXT;
	}
}
