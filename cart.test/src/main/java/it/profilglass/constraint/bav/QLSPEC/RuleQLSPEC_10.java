package it.profilglass.constraint.bav.QLSPEC;

import java.util.List;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.Caratteristica;
import it.profilglass.classmodel.Opzione;

@Rule(order = 10, name = "RuleQLSPEC10")

public class RuleQLSPEC_10 {
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
		result = caratteristiche.stream().filter(caratteristica -> "QLSPEC".equals(caratteristica.getCaratteristicaId())).findAny().get().getOpzioneFromOpzioneList("2");
		return RuleState.BREAK;
	}

}
