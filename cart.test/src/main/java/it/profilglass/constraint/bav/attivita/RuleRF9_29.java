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

@Rule(order = 29, name = "ruleRF9_1")

public class RuleRF9_29 {
	@Given
	//private List<CaratteristicaBean> caratteristiche; //Annotated Lists get injected with all Facts of the declared generic type
	private List<Caratteristica> caratteristiche;

	@Result
	private List<Attivita> result;

	@When
	public boolean when()
	{
		/*return caratteristiche.stream().anyMatch(caratteristica -> caratteristica.getSLMOD().equalsIgnoreCase("BA")
																&& (	caratteristica.getCLFINI().equalsIgnoreCase("B")
																	 || caratteristica.getCLFINI().equalsIgnoreCase("M") // NON COMPLETA ANCORA; manca la regola dell'SLLANAS
																	)
																&& Integer.parseInt(caratteristica.getCLLARG()) >= 8500
																&& caratteristica.getCLSPESS().intValue() >= 500
																&& caratteristica.getCLSPESS().intValue() < 1000);*/
		return caratteristiche.stream().filter(caratteristica -> "SLMOD".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione().equalsIgnoreCase("BA")
			&& (   caratteristiche.stream().filter(caratteristica -> "CLFINI".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione().equalsIgnoreCase("B")
				|| caratteristiche.stream().filter(caratteristica -> "CLFINI".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione().equalsIgnoreCase("M")
				)
			&& (Integer.parseInt(caratteristiche.stream().filter(caratteristica -> "CLLARG".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione()) >= 8500)
			&& (Integer.parseInt(caratteristiche.stream().filter(caratteristica -> "CLSPESS".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione()) >= 500)
			&& (Integer.parseInt(caratteristiche.stream().filter(caratteristica -> "CLSPESS".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione()) < 1000);
	}

	@Then
	public RuleState then()
	{
		result.add(ReadDB.getAttivitaFromId("RF9"));
		return RuleState.NEXT;
	}
}
