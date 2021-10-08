package it.profilglass.constraint.bav.DLLUBRI;

import java.util.List;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.Caratteristica;
import it.profilglass.classmodel.Opzione;

@Rule(order = 10, name = "RuleDLLUBRI10")

public class RuleDLLUBRI_10 {
	@Given 
	private List<Caratteristica> caratteristiche;

	@Result
	private Opzione result;
	
	@When
	public boolean when()
	{
		return true;		   
	}
	
	@Then
	public RuleState then()
	{
		result = caratteristiche.stream().filter(caratteristica -> "DLLUBRI".equals(caratteristica.getCaratteristicaId())).findAny().get().getOpzioneFromOpzioneList("N");
		return RuleState.BREAK;
	}
}
