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

@Rule(order = 10, name = "ruleMLSTATF_10")

public class RuleMLSTATF_10_1 {
	/*@Given("caratteristica") 
	private CaratteristicaBean caratteristica; //Annotated Lists get injected with all Facts of the declared generic type*/
	@Given
	private List<Caratteristica> caratteristiche;


	@Result
	private Opzione result;

	@When
	public boolean when()
	{
		/*return (caratteristica.getCLLEGA().substring(0, 1).equalsIgnoreCase("1") &&
			   (caratteristica.getCLSTATF().toString().equalsIgnoreCase("H26")) &&
			   (Integer.parseInt(caratteristica.getCLSPESS().toString()) == 3000));*/
		return caratteristiche.stream().filter(caratteristica -> "CLLEGA".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione().substring(0,1).equalsIgnoreCase("1")
			&& caratteristiche.stream().filter(caratteristica -> "CLSTATF".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione().equalsIgnoreCase("H26")
			&& Integer.parseInt(caratteristiche.stream().filter(caratteristica -> "CLLEGA".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione()) == 3000;
	}

	@Then
	public RuleState then()
	{
		System.out.println("Rule 10 entered");
		//result = "H16";
		result = caratteristiche.stream().filter(caratteristica -> "MLSTATF".equals(caratteristica.getCaratteristica())).findAny().get().getOpzioneFromOpzioneList("H16");
		return RuleState.NEXT;
	}
}
