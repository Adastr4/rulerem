package it.profilglass.constraint.bav.MLSTATF;

import java.util.List;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.Caratteristica;
import test.test.CaratteristicaBean;

@Rule(order = 25, name = "ruleMLSTATF_25")

public class RuleMLSTATF_25_4A extends it.profilglass.constraint.bav.MLSTATF.sub1.SubRuleMLSTATF_4A {
	/*@Given("caratteristica") 
	private CaratteristicaBean caratteristica; //Annotated Lists get injected with all Facts of the declared generic type*/
	
	@Given
	private List<Caratteristica> caratteristiche;

	@Result
	private String result;

	private CaratteristicaBean carRet;

	@Override
	@When
	public boolean when()
	{
		/*return super.when() && (Integer.parseInt(caratteristica.getCLLARG().toString()) <= 6500)
							&& (Integer.parseInt(caratteristica.getCLLUNG().toString()) <= 6500)
							&& (caratteristica.getCLRIVE().toString().equalsIgnoreCase("B"))
							&& (caratteristica.getCLSTATF().toString().equalsIgnoreCase("H00"));*/
		return super.when()
			&& Integer.parseInt(caratteristiche.stream().filter(caratteristica -> "CLLARG".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().getOpzione()) <= 6500
			&& Integer.parseInt(caratteristiche.stream().filter(caratteristica -> "CLLUNG".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().getOpzione()) <= 6500
			&& caratteristiche.stream().filter(caratteristica -> "CLRIVE".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().getOpzione().equalsIgnoreCase("B")
			&& caratteristiche.stream().filter(caratteristica -> "CLSTATF".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().getOpzione().equalsIgnoreCase("H00");
	}

	@Then
	public RuleState then()
	{
		System.out.println("Rule 24 entered");
		result = "H18";
		return RuleState.NEXT;
	}
}
