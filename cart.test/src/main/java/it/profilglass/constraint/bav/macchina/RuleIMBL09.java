package it.profilglass.constraint.bav.macchina;

import java.util.ArrayList;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.ICaratteristica;
import test.test.Macchina;
import test.test.ReadDB;

@Rule(order = 10, name = "ruleIMBL09")

public class RuleIMBL09 {
	@Given("caratteristica") 
	ICaratteristica caratteristica; //Annotated Lists get injected with all Facts of the declared generic type

	@Result
	private ArrayList<Macchina> result;
	
	@When
	public boolean when()
	{
		return ReadDB.isMacchineListFromCharacteristicsValid(caratteristica.getCLLARG(),caratteristica.getCLLUNG(),caratteristica.getCLSPESS().toString(),caratteristica.getSLLANASLarg() - ((Integer.parseInt(caratteristica.getCLLARG())/10) * caratteristica.getBandellineNumInSLLANAS()),caratteristica.getCLFINI(),caratteristica.getCLRIVE(),"IMBL09");
	}
	
	@Then
	public RuleState then()
	{
		result.add(ReadDB.getMacchinaFromId("IMBL09"));
		return RuleState.NEXT;
	}
}
