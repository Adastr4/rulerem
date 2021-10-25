package it.profilglass.constraint.bav.macchina;

import java.util.ArrayList;
import java.util.List;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.Macchina;
import it.profilglass.orm.DataManagement;
import test.test.CaratteristicaBean;
import test.test.ReadDB;

@Rule(order = 8, name = "ruleIMBL07")

public class RuleIMBL07 {
	@Given("caratteristica") 
	CaratteristicaBean caratteristica; //Annotated Lists get injected with all Facts of the declared generic type

	@Result
	private ArrayList<Macchina> result;
	
	@When
	public boolean when()
	{
		return ReadDB.isMacchineListFromCharacteristicsValid(caratteristica.getCLLARG(),caratteristica.getCLLUNG(),caratteristica.getCLSPESS().toString(),caratteristica.getSLLANASLarg() - ((Integer.parseInt(caratteristica.getCLLARG())/10) * caratteristica.getBandellineNumInSLLANAS()),caratteristica.getCLFINI(),caratteristica.getCLRIVE(),"IMBL07");
	}
	
	@Then
	public RuleState then()
	{
		result.add(DataManagement.readMacchinaById("IMBL07"));
		return RuleState.NEXT;
	}
}
