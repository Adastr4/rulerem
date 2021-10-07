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

@Rule(order = 4, name = "ruleMLSTATF_4")

public class RuleMLSTATF_4_1 extends it.profilglass.constraint.bav.MLSTATF.sub1.SubRuleMLSTATF_3 {
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
		/*return super.when() && (caratteristica.getCLLEGA().substring(0, 1).equalsIgnoreCase("1") &&
							   (!caratteristica.getCLLEGA().equalsIgnoreCase("1Q") && !caratteristica.getCLLEGA().equalsIgnoreCase("1O")) && 
							  !(caratteristica.getCLSPESS().toString().equalsIgnoreCase("4000") ||
									  caratteristica.getCLSPESS().toString().equalsIgnoreCase("5000") ||
									  caratteristica.getCLSPESS().toString().equalsIgnoreCase("6000")));*/
		return super.when()
			&& caratteristiche.stream().filter(caratteristica -> "CLLEGA".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().getOpzione().substring(0,1).equalsIgnoreCase("1")
			&& !caratteristiche.stream().filter(caratteristica -> "CLLEGA".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().getOpzione().equalsIgnoreCase("1Q")
			&& !caratteristiche.stream().filter(caratteristica -> "CLLEGA".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().getOpzione().equalsIgnoreCase("1O")
			&& !(   Integer.parseInt(caratteristiche.stream().filter(caratteristica -> "CLSPESS".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().getOpzione()) == 4000
				 || Integer.parseInt(caratteristiche.stream().filter(caratteristica -> "CLSPESS".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().getOpzione()) == 5000
				 || Integer.parseInt(caratteristiche.stream().filter(caratteristica -> "CLSPESS".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().getOpzione()) == 6000	
			    );
	}

	@Then
	public RuleState then()
	{
		System.out.println("Rule 4 entered");
		//result = "H24";
		result = caratteristiche.stream().filter(caratteristica -> "MLSTATF".equals(caratteristica.getCaratteristicaId())).findAny().get().getOpzioneFromOpzioneList("H24");
		return RuleState.NEXT;
	}

}
