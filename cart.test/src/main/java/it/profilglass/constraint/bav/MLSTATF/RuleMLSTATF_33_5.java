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

@Rule(order = 33, name = "ruleMLSTATF_33")

public class RuleMLSTATF_33_5 {
	/*@Given("caratteristica") 
	private CaratteristicaBean caratteristica; //Annotated Lists get injected with all Facts of the declared generic type*/
	
	@Given
	private List<Caratteristica> caratteristiche;

	@Result
	private Opzione result;

	@When
	public boolean when()
	{
		/*return (caratteristica.getCLLEGA().substring(0,1).equalsIgnoreCase("5") &&
				caratteristica.getCLSTATF().substring(0,2).equalsIgnoreCase("H3"));*/
		return caratteristiche.stream().filter(caratteristica -> "CLSTATF".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione().substring(0,2).equalsIgnoreCase("H3")
			&& caratteristiche.stream().filter(caratteristica -> "CLLEGA".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione().substring(0,1).equalsIgnoreCase("5");
	}

	@Then
	public RuleState then()
	{
		System.out.println("Rule 32 entered");
		//result = "H2" + caratteristiche.stream().filter(caratteristica -> "CLSTATF".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().getOpzione().substring(2,3);
		try
		{
			result = caratteristiche.stream().filter(caratteristica -> "MLSTATF".equals(caratteristica.getCaratteristica())).findAny().get().getOpzioneFromOpzioneList("H2" + caratteristiche.stream().filter(caratteristica -> "CLSTATF".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione().substring(2,3));
		}
		catch(Exception ex)
		{
			result = new Opzione("H2" + caratteristiche.stream().filter(caratteristica -> "CLSTATF".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione().substring(2,3));
		}
		return RuleState.BREAK;
	}
}
