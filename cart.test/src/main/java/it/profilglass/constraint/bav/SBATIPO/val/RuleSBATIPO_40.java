package it.profilglass.constraint.bav.SBATIPO.val;

import java.util.List;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.Caratteristica;
import test.test.CaratteristicaBean;

@Rule(order = 40, name = "ruleSBATIPO_40")

public class RuleSBATIPO_40 {
	/*@Given 
	private List<CaratteristicaBean> caratteristiche;*/
	
	@Given
	private List<Caratteristica> caratteristiche;
	
	@Result
	private Boolean result;

	@When
	public boolean when()
	{		
		/*return caratteristiche.stream().anyMatch(caratteristica -> caratteristica.getSBATIPO() == 1 &&
																   !caratteristica.getCLFINI().equalsIgnoreCase("C") &&
																   !caratteristica.getCLFINI().equalsIgnoreCase("D") &&
																   !caratteristica.getCLFINI().equalsIgnoreCase("E") &&
																   !caratteristica.getCLFINI().equalsIgnoreCase("G"));*/
		return Integer.parseInt(caratteristiche.stream().filter(caratteristica -> "SBATIPO".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione()) != 1
			&& !caratteristiche.stream().filter(caratteristica -> "CLFINI".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione().equalsIgnoreCase("C")
			&& !caratteristiche.stream().filter(caratteristica -> "CLFINI".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione().equalsIgnoreCase("D")
			&& !caratteristiche.stream().filter(caratteristica -> "CLFINI".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione().equalsIgnoreCase("E")
			&& !caratteristiche.stream().filter(caratteristica -> "CLFINI".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione().equalsIgnoreCase("G");
	}

	@Then
	public RuleState then()
	{
		System.out.println("Rule SBATIPO 4 entered");
		result = Boolean.TRUE;
		return RuleState.BREAK;
	}
}
