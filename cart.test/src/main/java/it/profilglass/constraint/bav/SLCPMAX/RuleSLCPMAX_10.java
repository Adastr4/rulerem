package it.profilglass.constraint.bav.SLCPMAX;

import java.util.List;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.Caratteristica;
import it.profilglass.classmodel.Opzione;
import test.test.ReadDB;

@Rule(order = 10, name = "ruleSLCPMAX10")

public class RuleSLCPMAX_10 extends it.profilglass.constraint.bav.SLCPMAX.sub1.SubRuleSLCPMAX_0 {
	@Given
	private List<Caratteristica> caratteristiche;

	@Result
	private Opzione result;

	@When
	public boolean when()
	{
		
		//return (caratteristica.getSBATIPO() != 1 && caratteristica.getSBATIPO() != 2 && caratteristica.getSLTMAX() == 2);
		return super.when()
			|| Integer.parseInt(caratteristiche.stream().filter(caratteristica -> "SBATIPO".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().getOpzione()) == 1 
			|| Integer.parseInt(caratteristiche.stream().filter(caratteristica -> "SBATIPO".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().getOpzione()) == 2;
	}

	@Then
	public RuleState then()
	{
		//result = ReadDB.getQitmFromPackageDefinition(caratteristiche.stream().filter(caratteristica -> "SLDEFIMB".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().getOpzione());
		result = new Opzione(String.valueOf(ReadDB.getQitmFromPackageDefinition(caratteristiche.stream().filter(caratteristica -> "SLDEFIMB".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().getOpzione())));
		return RuleState.BREAK;
	}

}
