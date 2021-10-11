package it.profilglass.constraint.bav.SLCPMAX.in;

import java.util.List;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.Caratteristica;

@Rule(order = 10, name = "ruleSLCPMAX10")

public class RuleSLCPMAX_10 {
	@Given
	private List<Caratteristica> caratteristiche;

	@Result
	private Boolean result= Boolean.FALSE;

	@When
	public boolean when()
	{
		
		//return (caratteristica.getSBATIPO() != 1 && caratteristica.getSBATIPO() != 2 && caratteristica.getSLTMAX() == 2);
		return Integer.parseInt(caratteristiche.stream().filter(caratteristica -> "SLTMAX".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().getOpzione()) == 1
			&& (
				   Integer.parseInt(caratteristiche.stream().filter(caratteristica -> "SBATIPO".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().getOpzione()) != 1 
				&& Integer.parseInt(caratteristiche.stream().filter(caratteristica -> "SBATIPO".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().getOpzione()) != 2
			   );
	}

	@Then
	public RuleState then()
	{
		//result = ReadDB.getQitmFromPackageDefinition(caratteristiche.stream().filter(caratteristica -> "SLDEFIMB".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().getOpzione());
		result = Boolean.TRUE;
		return RuleState.BREAK;
	}
}
