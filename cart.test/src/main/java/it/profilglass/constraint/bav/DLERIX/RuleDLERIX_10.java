package it.profilglass.constraint.bav.DLERIX;

import java.util.List;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.Caratteristica;
import it.profilglass.classmodel.Opzione;

@Rule(order = 10, name = "RuleDLERIX_10")

public class RuleDLERIX_10 extends it.profilglass.constraint.bav.QLSPEC.sub1.SubRuleQLSPEC_10 {
	@Given 
	private List<Caratteristica> caratteristiche;

	@Result
	private Opzione result;
	
	@When
	public boolean when()
	{
		return !super.when();		   
	}
	
	@Then
	public RuleState then()
	{
		result = new Opzione("0");
		return RuleState.BREAK;
	}
}
