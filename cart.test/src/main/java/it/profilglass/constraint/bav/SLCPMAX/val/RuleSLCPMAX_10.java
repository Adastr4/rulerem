package it.profilglass.constraint.bav.SLCPMAX.val;

import java.util.List;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.Caratteristica;
import test.test.ReadDB;

public class RuleSLCPMAX_10 {
	@Given
	private List<Caratteristica> caratteristiche;

	@Result
	private Boolean result= Boolean.TRUE;

	@When
	public boolean when()
	{
		
		//return (caratteristica.getSBATIPO() != 1 && caratteristica.getSBATIPO() != 2 && caratteristica.getSLTMAX() == 2);
		return Integer.parseInt(caratteristiche.stream().filter(caratteristica -> "SLCPMAX".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().getOpzione()) > 0
			&& Integer.parseInt(caratteristiche.stream().filter(caratteristica -> "SLCPMAX".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().getOpzione()) > ReadDB.getQitmFromPackageDefinition(caratteristiche.stream().filter(caratteristica -> "SLDEFIMB".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().getOpzione());
	}

	@Then
	public RuleState then()
	{
		//result = ReadDB.getQitmFromPackageDefinition(caratteristiche.stream().filter(caratteristica -> "SLDEFIMB".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().getOpzione());
		result = Boolean.FALSE;
		return RuleState.BREAK;
	}
	
}
