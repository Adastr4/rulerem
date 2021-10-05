package cart.test.constraints.cs2;

import java.util.List;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.ICaratteristica;

@Rule(order = 1) // order specifies the order the rule should execute in; if not specified, any
					// order may be used
public class CLFINI_Rule1 {
	private static final RuleState BREAK = null;

	@Given
	private List<ICaratteristica> caratteristiche; // Annotated Lists get injected with all Facts of the declared
														// generic type

	@Result
	private boolean validate;

	@Then
	public RuleState then() {
		System.out.println("executed rule 1 no package");
		validate = Boolean.TRUE;
		return RuleState.BREAK;
	}

	@When
	public boolean when() {
		System.out.println("executing rule 1 no package");

		return ( caratteristiche.stream().anyMatch(caratteristica -> caratteristica.getClasse().equalsIgnoreCase("EDT")) &&
				 caratteristiche.stream().anyMatch(caratteristica -> caratteristica.getCLFINI().equalsIgnoreCase("f")) ||
						caratteristiche.stream().anyMatch(caratteristica -> caratteristica.getCLFINI().equalsIgnoreCase("n")) );
	}


}
