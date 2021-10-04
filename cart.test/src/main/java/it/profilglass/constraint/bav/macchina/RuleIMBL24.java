package it.profilglass.constraint.bav.macchina;

import java.util.ArrayList;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.ICaratteristica;
import it.profilglass.classmodel.Macchina;
import it.profilglass.classmodel.ReadDB;


@Rule(order = 11, name = "ruleIMBL24")

public class RuleIMBL24 {
	@Given("caratteristica")
	ICaratteristica caratteristica; //Annotated Lists get injected with all Facts of the declared generic type

	@Result
	private ArrayList<Macchina> result;

	@Then
	public RuleState then()
	{
		result.add(ReadDB.getMacchinaFromId("IMBL24"));
		return RuleState.NEXT;
	}

	@When
	public boolean when()
	{
		return ReadDB.isMacchineListFromCharacteristicsValid(caratteristica.getCLLARG(),caratteristica.getCLLUNG(),caratteristica.getCLSPESS().toString(),caratteristica.getSLLANASLarg() - ((Integer.parseInt(caratteristica.getCLLARG())/10) * caratteristica.getBandellineNumInSLLANAS()),caratteristica.getCLFINI(),caratteristica.getCLRIVE(),"IMBL24");
	}
}
