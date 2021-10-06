package it.profilglass.constraint.bav.SLCNMAX;

import java.util.List;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.Caratteristica;
import test.test.ReadDB;

@Rule(order = 10, name = "RuleSLCNMAX10")

public class RuleSLCNMAX_10 {
	/*@Given("caratteristica")
	private CaratteristicaBean caratteristica; //Annotated Lists get injected with all Facts of the declared generic type*/
	@Given
	private List<Caratteristica> caratteristiche;

	@Result
	private double result;

	@When
	public boolean when()
	{
		
		//return (caratteristica.getSBATIPO() != 1 && caratteristica.getSBATIPO() != 2 && caratteristica.getSLTMAX() == 2);
		return Integer.parseInt(caratteristiche.stream().filter(caratteristica -> "SBATIPO".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().getOpzione()) != 1 
			&& Integer.parseInt(caratteristiche.stream().filter(caratteristica -> "SBATIPO".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().getOpzione()) != 2 
			&& Integer.parseInt(caratteristiche.stream().filter(caratteristica -> "SLTMAX".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().getOpzione()) == 3;
	}

	@Then
	public RuleState then()
	{
		double quantImballi = ReadDB.getQitmFromPackageDefinition(caratteristiche.stream().filter(caratteristica -> "SLDEFIMB".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().getOpzione());
		double hImballi=(Integer.parseInt(caratteristiche.stream().filter(caratteristica -> "CLLARG".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().getOpzione()) / 10000) * (Integer.parseInt(caratteristiche.stream().filter(caratteristica -> "CLLUNG".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().getOpzione()) / 10000);
		hImballi = quantImballi /(hImballi*getPesoSpec(caratteristiche.stream().filter(caratteristica -> "CLLEGA".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().getOpzione()));
		result = (hImballi * 1000000)/(Integer.parseInt(caratteristiche.stream().filter(caratteristica -> "CLSPESS".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().getOpzione()));
		return RuleState.BREAK;
	}
	
	private int getPesoSpec(String lega)
	{
			
			switch(lega)
			{
				case "3D":
					return 2710;
				case "5A":
					return 2690;
				case "5B":
					return 2690;
				case "5D":
					return 2690;
				case "5E":
					return 2690;
				case "5F":
					return 2690;
				case "5I":
					return 2690;
				case "5L":
					return 2690;
				case "5O":
					return 2690;
				case "5P":
					return 2690;
				default:
					return 2700;
			}
	}

}
