package it.profilglass.constraint.bav.MLSTATF.sub1;

import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.ICaratteristica;


public class SubRuleMLSTATF_4A_2 extends it.profilglass.constraint.bav.MLSTATF.sub1.SubRuleMLSTATF_4A {
	@Given("caratteristica")
	private ICaratteristica caratteristica; //Annotated Lists get injected with all Facts of the declared generic type

	@Override
	@When
	public boolean when()
	{
		return super.when() && (Integer.parseInt(caratteristica.getCLLARG().toString()) <= 10000)
							&& (Integer.parseInt(caratteristica.getCLLUNG().toString()) <= 10000)
							&& (	   caratteristica.getCLSTATF().toString().equalsIgnoreCase("HA1")
									|| caratteristica.getCLSTATF().toString().equalsIgnoreCase("H00"));
	}
}
