package it.profilglass.constraint.bav.MLSTATF;

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

@Rule(order = 26, name = "ruleMLSTATF_26")

public class RuleMLSTATF_26_4A extends it.profilglass.constraint.bav.MLSTATF.sub1.SubRuleMLSTATF_4A_2 {
	/*@Given("caratteristica") 
	private CaratteristicaBean caratteristica; //Annotated Lists get injected with all Facts of the declared generic type*/
	
	@Given
	private List<Caratteristica> caratteristiche;

	@Result
	private Opzione result;

	@Override
	@When
	public boolean when()
	{
		//return super.when() && (caratteristica.getCLSPESS().intValue() >= 2500);
		return super.when()
			&& Integer.parseInt(caratteristiche.stream().filter(caratteristica -> "CLSPESS".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione()) >= 2500;
	}

	@Then
	public RuleState then()
	{
		System.out.println("Rule 25 entered");
		//result = "H00";
		result = caratteristiche.stream().filter(caratteristica -> "MLSTATF".equals(caratteristica.getCaratteristica())).findAny().get().getOpzioneFromOpzioneList("H00");
		return RuleState.NEXT;
	}
}
