package it.profilglass.constraint.bav.macchina;

import java.util.ArrayList;
import java.util.List;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import test.test.CaratteristicaBean;
import test.test.Macchina;
import test.test.ReadDB;

@Rule(order = 1, name = "ruleCUTL21")

public class RuleCUTL21 {
	@Given 
	CaratteristicaBean caratteristica; //Annotated Lists get injected with all Facts of the declared generic type

	@Result
	private ArrayList<Macchina> result;
	
	@When
	public boolean when()
	{
		return ReadDB.isMacchineListFromCharacteristicsValid(caratteristica.getCLLARG(),caratteristica.getCLLUNG(),caratteristica.getCLSPESS().toString(),caratteristica.getSLLANAS(),caratteristica.getCLFINI(),caratteristica.getCLRIVE(),"CUTL21");
	}
	
	@Then
	public RuleState then()
	{
		result.add(ReadDB.getMacchinaFromId("CUTL21"));
		return RuleState.NEXT;
	}
}
