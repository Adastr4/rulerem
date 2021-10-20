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

@Rule(order = 19, name = "ruleMLSTATF_19")

public class RuleMLSTATF_19_3D_3T {
	/*@Given("caratteristica") 
	private CaratteristicaBean caratteristica; //Annotated Lists get injected with all Facts of the declared generic type*/
	@Given
	private List<Caratteristica> caratteristiche;

	@Result
	private Opzione result;

	@When
	public boolean when()
	{
		/*return ((caratteristica.getCLLEGA().equalsIgnoreCase("3D") ||
			     caratteristica.getCLLEGA().equalsIgnoreCase("3T")) &&
					(caratteristica.getCLSTATF().equalsIgnoreCase("H14")) &&
					(caratteristica.getCLSPESS().intValue() <= 4000) &&
				(caratteristica.getCLSPESS().intValue() > 1000));*/
		return (  caratteristiche.stream().filter(caratteristica -> "CLLEGA".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione().equalsIgnoreCase("3D")
			   || caratteristiche.stream().filter(caratteristica -> "CLLEGA".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione().equalsIgnoreCase("3T")
			   )
			&& caratteristiche.stream().filter(caratteristica -> "CLSTATF".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione().equalsIgnoreCase("H14")
			&& Integer.parseInt(caratteristiche.stream().filter(caratteristica -> "CLSPESS".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione()) <= 4000
			&& Integer.parseInt(caratteristiche.stream().filter(caratteristica -> "CLSPESS".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione()) > 1000;
		
	}

	@Then
	public RuleState then()
	{
		System.out.println("Rule 18 entered");
		//result = "H24";
		result = caratteristiche.stream().filter(caratteristica -> "MLSTATF".equals(caratteristica.getCaratteristica())).findAny().get().getOpzioneFromOpzioneList("H24");
		return RuleState.NEXT;
	}
}
