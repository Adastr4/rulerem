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

@Rule(order = 22, name = "ruleMLSTATF_22")

public class RuleMLSTATF_22_3Q {
	/*@Given("caratteristica") 
	private CaratteristicaBean caratteristica; //Annotated Lists get injected with all Facts of the declared generic type*/
	
	@Given
	private List<Caratteristica> caratteristiche;

	@Result
	private Opzione result;

	@When
	public boolean when()
	{
		/*return (caratteristica.getCLLEGA().equalsIgnoreCase("3Q") &&
				caratteristica.getCLRIVE().equalsIgnoreCase("B") &&
				caratteristica.getCLSTATF().equalsIgnoreCase("H00") &&
				(Integer.parseInt(caratteristica.getCLLARG().toString()) <= 6500) &&
				(Integer.parseInt(caratteristica.getCLLUNG().toString()) <= 6500));*/
		return caratteristiche.stream().filter(caratteristica -> "CLLEGA".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione().equalsIgnoreCase("3Q")
			&& caratteristiche.stream().filter(caratteristica -> "CLRIVE".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione().equalsIgnoreCase("B")
			&& caratteristiche.stream().filter(caratteristica -> "CLSTATF".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione().equalsIgnoreCase("H00")
			&& Integer.parseInt(caratteristiche.stream().filter(caratteristica -> "CLLARG".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione()) <= 6500
			&& Integer.parseInt(caratteristiche.stream().filter(caratteristica -> "CLLUNG".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione()) <= 6500;
	}

	@Then
	public RuleState then()
	{
		System.out.println("Rule 21 entered");
		//result = "H18";
		result = caratteristiche.stream().filter(caratteristica -> "MLSTATF".equals(caratteristica.getCaratteristica())).findAny().get().getOpzioneFromOpzioneList("H18");
		return RuleState.NEXT;
	}
}
