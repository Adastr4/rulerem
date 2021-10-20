package it.profilglass.constraint.bav.DLBRIN.dis;

import java.util.List;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.Caratteristica;

@Rule(order = 10, name = "RuleDLBRIN_10")

public class RuleDLBRIN_10 {
	@Given 
	private List<Caratteristica> caratteristiche;

	@Result
	private Boolean result = Boolean.FALSE;
	
	@When
	public boolean when()
	{
		return Integer.parseInt(caratteristiche.stream().filter(caratteristica -> "QLSPEC".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione()) == 1;		   
	}
	
	@Then
	public RuleState then()
	{
		result = Boolean.TRUE;
		return RuleState.BREAK;
	}
}
