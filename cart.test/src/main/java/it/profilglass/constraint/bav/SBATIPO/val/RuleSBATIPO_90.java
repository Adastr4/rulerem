package it.profilglass.constraint.bav.SBATIPO.val;

import java.util.List;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.Caratteristica;
import test.test.CaratteristicaBean;

@Rule(order = 90, name = "ruleSBATIPO_90")

public class RuleSBATIPO_90 {
	/*@Given 
	private List<CaratteristicaBean> caratteristiche;*/
	
	@Given
	private List<Caratteristica> caratteristiche;
	
	@Result
	private Boolean result;

	@When
	public boolean when()
	{		
		/*return caratteristiche.stream().anyMatch(caratteristica -> caratteristica.getSBATIPO() == 5 && (
																		caratteristica.getSLBP().equalsIgnoreCase("B05603") ||
																		caratteristica.getSLBP().equalsIgnoreCase("B03644") ||
																		caratteristica.getSLBP().equalsIgnoreCase("B02255") ||
																		caratteristica.getSLBP().equalsIgnoreCase("B03752") ||
																		caratteristica.getSLBP().equalsIgnoreCase("B03900") ||
																		caratteristica.getSLBP().equalsIgnoreCase("B04695") ||
																		caratteristica.getSLBP().equalsIgnoreCase("B00380") ||
																		caratteristica.getSLBP().equalsIgnoreCase("B01525") ||
																		caratteristica.getSLBP().equalsIgnoreCase("B04559") ||
																		caratteristica.getSLBP().equalsIgnoreCase("B07289") ||
																		caratteristica.getSLBP().equalsIgnoreCase("B02786") ||
																		caratteristica.getSLBP().equalsIgnoreCase("B06468")
																		));*/
		return Integer.parseInt(caratteristiche.stream().filter(caratteristica -> "SBATIPO".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue()) == 5
				&& (   caratteristiche.stream().filter(caratteristica -> "SLBP".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().equalsIgnoreCase("B05603")
					 || caratteristiche.stream().filter(caratteristica -> "SLBP".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().equalsIgnoreCase("B03644")
					 || caratteristiche.stream().filter(caratteristica -> "SLBP".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().equalsIgnoreCase("B02255")
					 || caratteristiche.stream().filter(caratteristica -> "SLBP".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().equalsIgnoreCase("B03752")
					 || caratteristiche.stream().filter(caratteristica -> "SLBP".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().equalsIgnoreCase("B03900")
					 || caratteristiche.stream().filter(caratteristica -> "SLBP".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().equalsIgnoreCase("B04695")
					 || caratteristiche.stream().filter(caratteristica -> "SLBP".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().equalsIgnoreCase("B00380")
					 || caratteristiche.stream().filter(caratteristica -> "SLBP".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().equalsIgnoreCase("B01525")
					 || caratteristiche.stream().filter(caratteristica -> "SLBP".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().equalsIgnoreCase("B04559")
					 || caratteristiche.stream().filter(caratteristica -> "SLBP".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().equalsIgnoreCase("B07289")
					 || caratteristiche.stream().filter(caratteristica -> "SLBP".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().equalsIgnoreCase("B02786")
					 || caratteristiche.stream().filter(caratteristica -> "SLBP".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().equalsIgnoreCase("B06468")
				   );
	}

	@Then
	public RuleState then()
	{
		System.out.println("Rule SBATIPO 8 entered");
		result = Boolean.TRUE;
		return RuleState.BREAK;
	}
}
